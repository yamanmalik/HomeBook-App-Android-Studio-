package com.example.pacpl.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

import java.util.ArrayList;
import android.content.Intent;
public class occupationActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_occupation);

        ArrayList list = new ArrayList(20);
        list.add("Appliance install");
        list.add("carpet cleaning");
        list.add("moving");
        list.add("plumbing");
        list.add("appliance repair");
        list.add("furniture assembly");
        list.add("Locksmith");
        list.add("Painting");
        list.add("Window Cleaning");
        list.add("Electrical");
        list.add("Mould Remediation");
        list.add("Pest control");
        list.add("Junk Removal");
        list.add("Handyman Services");


        try{EditText input = (EditText) findViewById(R.id.occupationinput);
        String a= input.getText().toString();

        final int select = Integer.parseInt(a);
        final Object o = list.get(select);
        final String selection = (String) o;


        Button occupationbackbutton = (Button)findViewById(R.id.occupationbackbutton);
        occupationbackbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), profileActivity.class);
                startIntent.putExtra("com.example.pacpl.myapplication.occupation",selection);
                startActivity(startIntent);
            }
        });
        }
        catch(NumberFormatException e)
        {
            System.out.println("Enter integer");
        }


    }
}
