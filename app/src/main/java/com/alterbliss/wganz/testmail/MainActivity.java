package com.alterbliss.wganz.testmail;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Declare global variables for the edit texts field
    private EditText editName;
    private EditText editPhone;
    private EditText editEmail;
    private EditText editMessage;

    //Declare global variable for the button
    private Button emailSupport;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get the id's of the edit text fields
        editName = (EditText) findViewById(R.id.editName);
        editPhone = (EditText) findViewById(R.id.editPhone);
        editEmail = (EditText) findViewById(R.id.editEmail);
        editMessage = (EditText) findViewById(R.id.editText);

        //Get the id of the button
        emailSupport = (Button) findViewById(R.id.support);

    }

    private void sendMail(){
        //Get the contents for the email
        String name = editName.getText().toString().trim();
        String phone = editPhone.getText().toString().trim();
        String email = editEmail.getText().toString().trim();
        String message = editMessage.getText().toString().trim();

        //create sendMail object
        SendMail sendMail = new SendMail((Context) this, name, phone, email, message);

        sendMail.execute();
    }



    @Override
    public void onClick(View v) {

        sendMail();

    }
}
