package com.example.uee_banking_app_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class CreateAccount extends AppCompatActivity {

    public EditText nic;
    public EditText owner;
    public EditText branch;



    private String[] pageOneData = new String[3];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        owner = findViewById(R.id.text_name);
        nic = findViewById(R.id.text_nic);
        branch = findViewById(R.id.text_branch);
    }

    public void openNext(View view){
        pageOneData[0] = owner.getText().toString().trim();
        pageOneData[1] = nic.getText().toString().trim();
        pageOneData[2] = branch.getText().toString().trim();
        Intent intent = new Intent(this, Create_Account_page2.class);
        intent.putExtra("pageOneData",pageOneData);
        startActivity(intent);
    }

//    public void openJoint(View view){
//        Intent intent = new Intent(this, Create_Account_page2.class);
//        startActivity(intent);
//    }

    public void openback(View view){

        Intent intent = new Intent(this, Select_Account.class);
        startActivity(intent);
    }

}
