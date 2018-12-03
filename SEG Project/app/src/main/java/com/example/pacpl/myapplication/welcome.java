package com.example.pacpl.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;





public class welcome extends AppCompatActivity {
//    TextView firstName;
//    TextView firstName1;
//    TextView firstName2;
//
//    TextView role1;
//    TextView role2;
//    TextView role3;

    final ArrayList<Service> list = new ArrayList(10);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try{
            TextView firstName;
            TextView firstName1;
            TextView firstName2;



            final String nameofservice;
            final String nameofservice2;
            final String nameofservice3;
            final String hourlyrate;

            EditText servicename;
            EditText ratehourly;



            TextView role1;
            TextView role2;
            TextView role3;

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_welcome);

            Intent intent = getIntent();
            Intent intent2 = getIntent();
            Intent intent3 = getIntent();
            Intent intent4 = getIntent();
            Intent intent5 = getIntent();
            Intent intent6 = getIntent();







//            nameOfService = (EditText) findViewById(R.id.nameofservice);
//            display1 = (TextView)findViewById(R.id.servicedisplay);
//            //String str1 = intent2.getStringExtra("jimmy");
//            display1.setText(nameOfService);




            firstName = (TextView) findViewById(R.id.firstname1);
            String str = intent.getStringExtra("jimmy");//FOR ADMIN
            firstName.setText(str);

            firstName1 = (TextView)findViewById(R.id.firstname1);
            String str1 = intent2.getStringExtra("jimmy");
            firstName1.setText(str1);

            firstName2 = (TextView)findViewById(R.id.firstname1);
            String str2 = intent3.getStringExtra("jimmy");
            firstName2.setText(str2);

//            role1 = (TextView) findViewById(R.id.role1);
//            String str3 = intent4.getStringExtra("jim");
//            role1.setText(str3);
//
//            role2 = (TextView) findViewById(R.id.role1);
//            String str4 = intent5.getStringExtra("jim");
//            role2.setText(str4);
//
//            role3 = (TextView) findViewById(R.id.role1);
//            String str5 = intent6.getStringExtra("jim");
//            role3.setText(str5);

            //This section of code is for adding new services so it retrieves information
            //from the text inputs and then using the addservice button
            //It creates a new instance of service and stores it in the list
            servicename = (EditText) findViewById(R.id.nameofservice);
            ratehourly = (EditText) findViewById(R.id.hourlyrate);
            nameofservice = servicename.getText().toString();
            hourlyrate = ratehourly.getText().toString();
            //hourlyrate = Integer.parseInt(temporary);

            //This section of code adds the service to the actual list containgint the jobs
            Button addservice = (Button) findViewById(R.id.addservicebtn);
            addservice.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    EditText nameOfService;
                    TextView display1;

                    nameOfService = (EditText) findViewById(R.id.nameofservice);
                    display1 = (TextView) findViewById(R.id.servicedisplay);
                    display1.setText(nameOfService.getText());


                }
            });

            //This section of code retrieves the user info for removing services
            servicename = (EditText) findViewById(R.id.servicenameremoval);
            nameofservice2 = servicename.getText().toString();

            //This section when clicked removes the service from the list
            Button removeservice = (Button) findViewById(R.id.removeservicebtn);
            removeservice.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    EditText nameOfService2;
                    TextView display2;

                    nameOfService2 = (EditText) findViewById(R.id.servicenameremoval);
                    display2 = (TextView) findViewById(R.id.servicedisplay2);
                    display2.setText(nameOfService2.getText());


                }
            });

            //This section of code retrieves the text information
            servicename = (EditText) findViewById(R.id.nameofservice);
            ratehourly = (EditText) findViewById(R.id.hourlyrate);
            nameofservice3 = servicename.getText().toString();
            final String temporary2 = ratehourly.getText().toString();
            // hourlyrate = Integer.parseInt(temporary);
            //This button adds the object to the list
            Button editservice = (Button) findViewById(R.id.editservicebtn);
            editservice.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    for (int i = 0; i <= list.size(); i++) {
                        if (list.get(i).getNameofService().equals(nameofservice3)) {
                            list.get(i).sethourlyprice(temporary2);
                        }
                    }
                }
            });




        }
        catch (NumberFormatException e) {
            System.out.println("Enter integer");
        }
    }

//    public void buttonOnClick(View addservicebtn){
//        EditText nameOfService;
//        TextView display1;
//
//        nameOfService = (EditText) findViewById(R.id.nameofservice);
//        display1 = (TextView) findViewById(R.id.servicedisplay);
//        display1.setText(nameOfService.getText());
//
//    }

}

//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_welcome);
//
//        Intent intent = getIntent();
//        Intent intent2 = getIntent();
//        Intent intent3 = getIntent();
//        Intent intent4 = getIntent();
//        Intent intent5 = getIntent();
//        Intent intent6 = getIntent();
//
//
//
//
//        firstName = (TextView)findViewById(R.id.firstname1);
//        String str = intent.getStringExtra("jimmy");//FOR ADMIN
//        firstName.setText(str);
////
////        firstName1 = (TextView)findViewById(R.id.firstname1);
////        String str1 = intent2.getStringExtra("jimmy");
////        firstName1.setText(str1);
////
////        firstName2 = (TextView)findViewById(R.id.firstname1);
////        String str2 = intent3.getStringExtra("jimmy");
////        firstName2.setText(str2);
//
//        role1 = (TextView)findViewById(R.id.role1);
//        String str3 = intent4.getStringExtra("jim");
//        role1.setText(str3);
//
//        role2 = (TextView)findViewById(R.id.role1);
//        String str4 = intent5.getStringExtra("jim");
//        role2.setText(str4);
//
//        role3 = (TextView)findViewById(R.id.role1);
//        String str5 = intent6.getStringExtra("jim");
//        role3.setText(str5);
//
//        Button addservice = (Button) findViewById(R.id.addservicebtn);
//        addservice.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent startintent = new Intent(getApplicationContext(), addserviceactivity.class);
//                startActivity(startintent);
//                Intent intent = new Intent(welcome.this, addserviceactivity.class);
//                startActivity(intent);
//            }   });
//
//        final Button removeservice = (Button) findViewById(R.id.removeservicebtn);
//        removeservice.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent startintent2 = new Intent (getApplicationContext(),removeserviceactivity.class);
//                startActivity(startintent2);
//                Intent intent2 = new Intent (welcome.this, removeserviceactivity.class);
//                startActivity(intent2);
//            }
//        });
//
//        Button editservice = (Button) findViewById(R.id.editservicebtn);
//        editservice.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent startintent3 = new Intent (getApplicationContext(), editserviceactivity.class);
//                startActivity(startintent3);
//                Intent intent3 = new Intent (welcome.this, editserviceactivity.class);
//                startActivity(intent3);
//
//            }
//        });
//        }
//}
//

