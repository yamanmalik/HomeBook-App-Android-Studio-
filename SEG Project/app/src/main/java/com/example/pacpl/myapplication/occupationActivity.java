package com.example.pacpl.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class occupationActivity extends AppCompatActivity {

    String firstName, lastName, emailAddress, role;
    int phoneNumber;

    EditText roleInput;
    EditText firstNameInput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_occupation);



        firstNameInput = (EditText) findViewById(R.id.firstname);
        roleInput = (EditText) findViewById(R.id.confirm2);

//        lastNameInput = (EditText) findViewById(R.id.lastname);
//        emailInput = (EditText) findViewById(R.id.email);
//        phoneNumberInput = (EditText) findViewById(R.id.phonenumber);

        Button admincontinue1 = (Button) findViewById(R.id.admincontinue); //user
        admincontinue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent startintent = new Intent(getApplicationContext(), welcome.class);
                startActivity(startintent);
                firstName = firstNameInput.getText().toString();
                role = roleInput.getText().toString();

                Intent intent = new Intent(occupationActivity.this, welcome.class);

                intent.putExtra("jim", role);
                intent.putExtra("jimmy", firstName);

                startActivity(intent);
            }
        });

        ArrayList list = new ArrayList(10);
        list.add(""
        );


    }
}




//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//
//
//public class occupationActivity extends AppCompatActivity {
//
//    String firstName, lastName, emailAddress, role;
//
//    EditText roleInput;
//    EditText firstNameInput;
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_occupation);
//
//        firstNameInput = (EditText) findViewById(R.id.firstname);
//        roleInput = (EditText) findViewById(R.id.confirm1);
//
//
//
//
//        Button admincontinue1 = (Button) findViewById(R.id.admincontinue); //user
//        admincontinue1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                Intent startintent = new Intent(getApplicationContext(), welcome.class);
//                startActivity(startintent);
//                firstName = firstNameInput.getText().toString();
//                role = roleInput.getText().toString();
//
//                Intent intent = new Intent(occupationActivity.this, welcome.class);
//
//                intent.putExtra("jim", role);
//                intent.putExtra("jimmy", firstName);
//                startActivity(intent);
//
//            }
//        });
//    }
//}
