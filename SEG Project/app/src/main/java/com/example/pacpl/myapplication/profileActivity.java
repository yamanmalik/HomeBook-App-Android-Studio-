package com.example.pacpl.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class profileActivity extends AppCompatActivity {

    String firstName, lastName, emailAddress, role;
    int phoneNumber;

    EditText roleInput;
    EditText firstNameInput;
    EditText lastNameInput;
    EditText phoneInput;
    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);



        firstNameInput = (EditText) findViewById(R.id.firstname);
        roleInput = (EditText) findViewById(R.id.confirm1);
        lastNameInput = (EditText) findViewById(R.id.lastname);//Changed by salty
        phoneInput = (EditText) findViewById(R.id.phonenumber);//Changed by salty
        email = (EditText) findViewById(R.id.email);//Changed by salty

        Button usercontinue1 = (Button) findViewById(R.id.usercontinue); //user
        usercontinue1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(firstNameInput.getText().toString())
                        ||!isAlpha(firstNameInput.getText().toString())) {
                    firstNameInput.setError("Enter a valid name");
                    return;
                }
                if (TextUtils.isEmpty(lastNameInput.getText().toString())
                        ||!isAlpha(lastNameInput.getText().toString())) {
                    lastNameInput.setError("Enter a valid name");
                    return;
                }
                if (TextUtils.isEmpty(phoneInput.getText().toString())
                        ||!isNumeric(phoneInput.getText().toString())
                        ||phoneInput.getText().toString().length()!=10) {
                    phoneInput.setError("Enter a valid phone number");
                    return;
                }
                if (TextUtils.isEmpty(email.getText().toString())) {
                    email.setError("Enter a valid email address");
                    return;
                }

                Intent startintent = new Intent(getApplicationContext(), search.class);
                startActivity(startintent);
                firstName = firstNameInput.getText().toString();
                role = roleInput.getText().toString();

                Intent intent = new Intent(profileActivity.this, search.class);

                intent.putExtra("jim", role);
                intent.putExtra("jimmy", firstName);

                startActivity(intent);



            }
            public boolean isNumeric(String strNum) {
                try {
                    double d = Double.parseDouble(strNum);
                } catch (NumberFormatException | NullPointerException nfe) {
                    return false;
                }
                return true;
            }
            public boolean isAlpha(String name) {
                char[] chars = name.toCharArray();

                for (char c : chars) {
                    if(!Character.isLetter(c)) {
                        return false;
                    }
                }
                return true;
            }
        });

        ArrayList list = new ArrayList(10);
        list.add(""
        );




    }
}
