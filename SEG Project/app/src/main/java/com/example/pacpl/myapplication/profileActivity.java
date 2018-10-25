package com.example.pacpl.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class profileActivity extends AppCompatActivity {

    String decision, firstname, lastname, number, username, password;
    EditText firstnameinput;
    EditText lastnameinput;
    EditText numberinput;
    EditText usernameinput;
    EditText passwordinput;
    //Firebase myFirebase;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        firstnameinput = (EditText) findViewById(R.id.firstnameinput);
        lastnameinput = (EditText) findViewById(R.id.lastnameinput);
        numberinput = (EditText) findViewById(R.id.numberinput);
        usernameinput =(EditText) findViewById(R.id.usernameinput);
        passwordinput = (EditText) findViewById(R.id.passwordinput);
        Button continuebutton = (Button) findViewById(R.id.continuebutton);
        continuebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstname = firstnameinput.getText().toString();
                lastname = lastnameinput.getText().toString();
                number = numberinput.getText().toString();
                username = usernameinput.getText().toString();
                password = passwordinput.getText().toString();
                Intent startintent2 = new Intent(getApplicationContext(), loginActivity.class);
                startActivity(startintent2);//when continue is clicked, it assigns the variables
                // and takes user to the login activity





            }
        });
        if (getIntent().hasExtra("com.example.pacpl.myapplication.occupation")){
            decision = getIntent().getExtras().getString("com.example.pacpl.myapplication.occupation");
            TextView occupationtext = (TextView) findViewById(R.id.occupationtext);
            occupationtext.setText(decision);//code to recieve information from back button of occupation activity after
            //occupation is selected


        }//code for occupation selctor to go to occupation activity
        Button skillselectorbutton = (Button)findViewById(R.id.skillselectorbutton);
        skillselectorbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), occupationActivity.class);
                startActivity(startintent);
            }
        });

    }
}
