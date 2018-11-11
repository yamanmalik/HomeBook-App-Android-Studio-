package com.example.pacpl.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class welcome extends AppCompatActivity {
    //try{EditText input = (EditText) findViewById(R.id.hourlyrate);

    TextView firstName;
    TextView firstName1;
    TextView firstName2;

    String nameofservice;
    int hourlyrate;

    EditText servicename;
    EditText ratehourly;

    TextView role1;
    TextView role2;
    TextView role3;

    final ArrayList<Service> list = new ArrayList(10);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent intent = getIntent();
        Intent intent2 = getIntent();
        Intent intent3 = getIntent();
        Intent intent4 = getIntent();
        Intent intent5 = getIntent();
        Intent intent6 = getIntent();

        firstName = (TextView) findViewById(R.id.firstname1);
        String str = intent.getStringExtra("jimmy");//FOR ADMIN
        firstName.setText(str);
//
//        firstName1 = (TextView)findViewById(R.id.firstname1);
//        String str1 = intent2.getStringExtra("jimmy");
//        firstName1.setText(str1);
//
//        firstName2 = (TextView)findViewById(R.id.firstname1);
//        String str2 = intent3.getStringExtra("jimmy");
//        firstName2.setText(str2);

        role1 = (TextView) findViewById(R.id.role1);
        String str3 = intent4.getStringExtra("jim");
        role1.setText(str3);

        role2 = (TextView) findViewById(R.id.role1);
        String str4 = intent5.getStringExtra("jim");
        role2.setText(str4);

        role3 = (TextView) findViewById(R.id.role1);
        String str5 = intent6.getStringExtra("jim");
        role3.setText(str5);


        //This section of code is for adding new services so it retrieves information
        //from the text inputs and then using the addservice button
        //It creates a new instance of service and stores it in the list
        servicename = (EditText) findViewById(R.id.nameofservice);
        ratehourly = (EditText) findViewById(R.id.hourlyrate);
        nameofservice = servicename.getText().toString();
        String temporary = ratehourly.getText().toString();
        hourlyrate = Integer.parseInt(temporary);


        //This section of code adds the service to the actual list containgint the jobs
        Button addservice = (Button) findViewById(R.id.addservicebtn);
        addservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Service service = new Service(nameofservice, hourlyrate);
                list.add(service);
            }
        });

        //This section of code retrieves the user info for removing services
        servicename = (EditText) findViewById(R.id.servicenameremoval);
        nameofservice = servicename.getText().toString();


        //This section when clicked removes the service from the list
        final Button removeservice = (Button) findViewById(R.id.removeservicebtn);
        removeservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i <= list.size(); i++) {
                    if (list.get(i).getNameofService().equals(nameofservice)) {
                        list.remove(i);
                    }
                }

            }
        });

        //This section of code retrieves the text information
        servicename = (EditText) findViewById(R.id.nameofserviceedit);
        ratehourly = (EditText) findViewById(R.id.hourlyrate);
        nameofservice = servicename.getText().toString();
        String temporary2 = ratehourly.getText().toString();
        hourlyrate = Integer.parseInt(temporary);
        //This button adds the object to the list
        Button editservice = (Button) findViewById(R.id.editservicebtn);
        editservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i <= list.size(); i++) {
                    if (list.get(i).getNameofService().equals(nameofservice)) {
                        list.get(i).sethourlyprice(hourlyrate);
                    }
                }
            }
        });

    }catch(NumberFormatException e)
        {
            System.out.println("Enter integer");
        }
    }


}