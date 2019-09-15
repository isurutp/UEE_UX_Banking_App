package com.example.uee_banking_app_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
    }

    public void openNext(View view){
        Intent intent = new Intent(this, Create_Account_page2.class);
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
