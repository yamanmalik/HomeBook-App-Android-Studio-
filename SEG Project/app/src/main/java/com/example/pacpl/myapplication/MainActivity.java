package com.example.pacpl.myapplication;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        DatabaseReference databaseProducts;
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        databaseProducts = FirebaseDatabase.getInstance().getReference("persons");


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button profilebutton = (Button) findViewById(R.id.profilebutton); //user

        Button searchbutton = (Button) findViewById(R.id.searchbutton); //service provider

        Button occupationbutton = (Button) findViewById(R.id.AdminButton);


        occupationbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent1 = new Intent(getApplicationContext(), occupationActivity.class);
                startActivity(startintent1);
            }
        });

        profilebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent = new Intent(getApplicationContext(), profileActivity.class);
                startActivity(startintent);
            }
        });

        searchbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startintent2 = new Intent(getApplicationContext(), searchActivity.class);
                startActivity(startintent2);
            }
        });
        ArrayList list = new ArrayList(10);
    protected void Onstart(){

        super.onStart();
        databaseProducts.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                    String person = postSnapshot.getValue(String.class);
                    persons.add(person);

                }
                PersonList productsAdapter = new ProductList(MainActivity.this, products);
                listViewProducts.setAdapter(productsAdapter);
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.w(Tag, "Failed t read value", databaseError.toException());
            }
        });


    }
}}
