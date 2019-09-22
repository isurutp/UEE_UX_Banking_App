package com.example.uee_banking_app_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Confirm_New_Account extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm__new__account);
    }

    public void openPage1(View view){
        Intent intent = new Intent(this, CreateAccount.class);
        startActivity(intent);
    }
    public void openPage2(View view){
        Intent intent = new Intent(this, Create_Account_page2.class);
        startActivity(intent);
    }

    public void confirm(View view){
        Intent intent = new Intent(this, Select_Account.class);
        startActivity(intent);
    }
    public void cancel(View view){
        Intent intent = new Intent(this, Select_Account.class);
        startActivity(intent);
    }
}