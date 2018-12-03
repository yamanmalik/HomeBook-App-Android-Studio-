package com.example.pacpl.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class search extends Activity {
    Button listOfServices;
    TextView addedServices;
    String[] listOfItems;
    boolean[] checkedItems;
    ArrayList<Integer> selectedItems = new ArrayList<>();

    Button listOfServices1;
    TextView addedServices1;
    String[] listOfItems1;
    boolean[] checkedItems1;
    ArrayList<Integer> selectedItems1 = new ArrayList<>();

    Button listOfServices2;
    TextView addedServices2;
    String[] listOfItems2;
    boolean[] checkedItems2;
    ArrayList<Integer> selectedItems2 = new ArrayList<>();

    Button listOfServices3;
    TextView addedServices3;
    String[] listOfItems3;
    boolean[] checkedItems3;
    ArrayList<Integer> selectedItems3 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        listOfServices3 = (Button) findViewById(R.id.listofavail2);
        addedServices3 = (TextView) findViewById(R.id.availdisplay2);
        listOfItems3 = getResources().getStringArray(R.array.DaysOfWeek);
        checkedItems3 = new boolean[listOfItems3.length];

        listOfServices3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(search.this);
                builder.setTitle("Select Day of Availability");
                builder.setMultiChoiceItems(listOfItems3, checkedItems3, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int position, boolean isChecked) {
                        if(isChecked){
                            if(!selectedItems3.contains(position)){
                                selectedItems3.add(position);
                            }
                        }
                        else if(selectedItems3.contains(position)){
                            selectedItems3.remove((Integer)position);
                        }
                    }
                });
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String item = "";
                        for(int i = 0; i<selectedItems3.size();i++){
                            item = item + listOfItems3[selectedItems3.get(i)];
                            if(i != selectedItems3.size() -1){
                                item = item + ", ";

                            }
                        }
                        addedServices3.setText(item);
                    }
                });

                builder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                builder.setNeutralButton("Clear All", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        for(int i = 0; i<checkedItems3.length;i++){
                            checkedItems3[i] = false;
                            selectedItems3.clear();
                            addedServices3.setText("");
                        }
                    }
                });

                AlertDialog mDialog = builder.create();
                mDialog.show();
            }
        });









        listOfServices2 = (Button) findViewById(R.id.listofavail);
        addedServices2 = (TextView) findViewById(R.id.availdisplay);
        listOfItems2 = getResources().getStringArray(R.array.Time_Slots);
        checkedItems2 = new boolean[listOfItems2.length];

        listOfServices2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(search.this);
                builder.setTitle("Select Availability");
                builder.setMultiChoiceItems(listOfItems2, checkedItems2, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int position, boolean isChecked) {
                        if(isChecked){
                            if(!selectedItems2.contains(position)){
                                selectedItems2.add(position);
                            }
                        }
                        else if(selectedItems2.contains(position)){
                            selectedItems2.remove((Integer)position);
                        }
                    }
                });
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String item = "";
                        for(int i = 0; i<selectedItems2.size();i++){
                            item = item + listOfItems2[selectedItems2.get(i)];
                            if(i != selectedItems2.size() -1){
                                item = item + ", ";

                            }
                        }
                        addedServices2.setText(item);
                    }
                });

                builder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                builder.setNeutralButton("Clear All", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        for(int i = 0; i<checkedItems2.length;i++){
                            checkedItems2[i] = false;
                            selectedItems2.clear();
                            addedServices2.setText("");
                        }
                    }
                });

                AlertDialog mDialog = builder.create();
                mDialog.show();
            }
        });





        listOfServices1 = (Button) findViewById(R.id.listofservices2);
        addedServices1 = (TextView) findViewById(R.id.removedservicesdisplayed);
        listOfItems1 = getResources().getStringArray(R.array.Services_Provided);
        checkedItems1 = new boolean[listOfItems1.length];

        listOfServices1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(search.this);
                builder.setTitle("Services Available To Be Removed");
                builder.setMultiChoiceItems(listOfItems1, checkedItems1, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int position, boolean isChecked) {
                        if(isChecked){
                            if(!selectedItems1.contains(position)){
                                selectedItems1.add(position);
                            }
                        }
                        else if(selectedItems1.contains(position)){
                            selectedItems1.remove((Integer)position);
                        }
                    }
                });
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String item = "";
                        for(int i = 0; i<selectedItems1.size();i++){
                            item = item + listOfItems1[selectedItems1.get(i)];
                            if(i != selectedItems1.size() -1){
                                item = item + ", ";

                            }
                        }
                        addedServices1.setText(item);
                    }
                });

                builder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                builder.setNeutralButton("Clear All", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        for(int i = 0; i<checkedItems1.length;i++){
                            checkedItems1[i] = false;
                            selectedItems1.clear();
                            addedServices1.setText("");
                        }
                    }
                });

                AlertDialog mDialog = builder.create();
                mDialog.show();
            }
        });






























        listOfServices = (Button) findViewById(R.id.listofservices);
        addedServices = (TextView) findViewById(R.id.addedservicesdisplayed);
        listOfItems = getResources().getStringArray(R.array.Services_Provided);
        checkedItems = new boolean[listOfItems.length];

        listOfServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(search.this);
                builder.setTitle("Services Available To Be Added");
                builder.setMultiChoiceItems(listOfItems, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int position, boolean isChecked) {
                        if(isChecked){
                            if(!selectedItems.contains(position)){
                                selectedItems.add(position);
                            }
                        }
                        else if(selectedItems.contains(position)){
                            selectedItems.remove((Integer)position);
                        }
                    }
                });
                builder.setCancelable(false);
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String item = "";
                        for(int i = 0; i<selectedItems.size();i++){
                            item = item + listOfItems[selectedItems.get(i)];
                            if(i != selectedItems.size() -1){
                                item = item + ", ";

                            }
                        }
                        addedServices.setText(item);
                    }
                });

                builder.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                builder.setNeutralButton("Clear All", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        for(int i = 0; i<checkedItems.length;i++){
                            checkedItems[i] = false;
                            selectedItems.clear();
                            addedServices.setText("");
                        }
                    }
                });

                AlertDialog mDialog = builder.create();
                mDialog.show();
            }
        });


    }

}

