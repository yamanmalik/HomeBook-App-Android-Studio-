
package com.example.pacpl.myapplication;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.text.TextUtils;

public class searchActivity extends AppCompatActivity {

    String firstName, role;
    EditText firstNameInput;
    EditText roleInput;
    EditText addressInput;
    EditText companyInput;
    EditText phoneInput;
    EditText lastNameInput;
    EditText emailInput;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        firstNameInput = (EditText) findViewById(R.id.firstname);
        roleInput = (EditText) findViewById(R.id.confirm1);
        addressInput = (EditText) findViewById(R.id.addressinput);//Changed by salty
        companyInput = (EditText) findViewById(R.id.companyinput);//Changed by salty
        phoneInput = (EditText) findViewById(R.id.phonenumber2);//Changed by salty
        lastNameInput = (EditText) findViewById(R.id.lastname);//Changed by salty
        emailInput = (EditText) findViewById(R.id.emailinput);//Changed by salty


        Button servicecontinue1 = (Button) findViewById(R.id.servicecontinue); //service Provider
        servicecontinue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(firstNameInput.getText().toString())) {
                    firstNameInput.setError("Enter a valid name");
                    return;
                }
                if (TextUtils.isEmpty(lastNameInput.getText().toString())) {
                    lastNameInput.setError("Enter a valid name");
                    return;
                }
                if (TextUtils.isEmpty(phoneInput.getText().toString())
                        ||!isNumeric(phoneInput.getText().toString())
                        ||phoneInput.getText().toString().length()!=10) {
                    phoneInput.setError("Enter a valid phone number");
                    return;
                }
                if (TextUtils.isEmpty(addressInput.getText().toString())) {
                    addressInput.setError("Enter a valid address");
                    return;
                }
                if (TextUtils.isEmpty(companyInput.getText().toString())) {
                    companyInput.setError("Enter a valid company name");
                    return;
                }
                if (TextUtils.isEmpty(emailInput.getText().toString())) {
                    emailInput.setError("Enter a valid email");
                    return;
                }

                Intent startintent = new Intent(getApplicationContext(), WelcomeSP.class);
                startActivity(startintent);
                firstName = firstNameInput.getText().toString();
                role = roleInput.getText().toString();

                Intent intent = new Intent(searchActivity.this, WelcomeSP.class);

                intent.putExtra("jim", role);
                intent.putExtra("jimmy", firstName);
                startActivity(intent);

            }
            public boolean isNumeric(String strNum) {
                try {
                    double d = Double.parseDouble(strNum);
                } catch (NumberFormatException | NullPointerException nfe) {
                    return false;
                }
                return true;
            }
        });

    }
}
//        Button servicecontinue1 = (Button) findViewById(R.id.servicecontinue); //service Provider
//        servicecontinue1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//
//                Intent startintent = new Intent(getApplicationContext(), WelcomeSP.class);
//                startActivity(startintent);
//                firstName = firstNameInput.getText().toString();
//                role = roleInput.getText().toString();
//
//                Intent intent = new Intent(searchActivity.this, WelcomeSP.class);
//
//                intent.putExtra("jim", role);
//                intent.putExtra("jimmy", firstName);
//                startActivity(intent);
//
//            }
//        });
//    }
//}
