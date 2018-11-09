package com.example.pacpl.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;





public class welcome extends AppCompatActivity {
    TextView firstName;
    TextView firstName1;
    TextView firstName2;

    TextView role1;
    TextView role2;
    TextView role3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent intent = getIntent();
        Intent intent2 = getIntent();
        Intent intent3 = getIntent();
        Intent intent4 = getIntent();
        Intent intent5 = getIntent();
        Intent intent6 = getIntent();




        firstName = (TextView)findViewById(R.id.firstname1);
        String str = intent.getStringExtra("jimmy");
        firstName.setText(str);

        firstName1 = (TextView)findViewById(R.id.firstname1);
        String str1 = intent2.getStringExtra("jimmy");
        firstName1.setText(str1);

        firstName2 = (TextView)findViewById(R.id.firstname1);
        String str2 = intent3.getStringExtra("jimmy");
        firstName2.setText(str2);

        role1 = (TextView)findViewById(R.id.role1);
        String str3 = intent4.getStringExtra("jim");
        role1.setText(str3);

        role2 = (TextView)findViewById(R.id.role1);
        String str4 = intent5.getStringExtra("jim");
        role2.setText(str4);

        role3 = (TextView)findViewById(R.id.role1);
        String str5 = intent6.getStringExtra("jim");
        role3.setText(str5);


    }
}
