package com.example.pacpl.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class searchActivity extends AppCompatActivity {

    String firstName, lastName, emailAddress, role;
    EditText firstNameInput;
    EditText roleInput;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        firstNameInput = (EditText) findViewById(R.id.firstname);
        roleInput = (EditText) findViewById(R.id.confirm1);


        Button servicecontinue1 = (Button) findViewById(R.id.servicecontinue); //user
        servicecontinue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent startintent = new Intent(getApplicationContext(), welcome.class);
                startActivity(startintent);
                firstName = firstNameInput.getText().toString();
                role = roleInput.getText().toString();

                Intent intent = new Intent(searchActivity.this, welcome.class);

                intent.putExtra("jim", role);
                intent.putExtra("jimmy", firstName);
                startActivity(intent);

            }
        });
    }
}
