package com.example.pacpl.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button user = (Button) findViewById(R.id.userbutton);
        Button serviceprovider = (Button) findViewById(R.id.serviceproviderbutton);

        serviceprovider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent3;
                startintent3 = new Intent(getApplicationContext(), profileActivity.class);
                startActivity(startintent3);
            }
        });
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent2 = new Intent(getApplicationContext(), searchActivity.class);
                startActivity(startintent2);
            }
        });







    }
}
