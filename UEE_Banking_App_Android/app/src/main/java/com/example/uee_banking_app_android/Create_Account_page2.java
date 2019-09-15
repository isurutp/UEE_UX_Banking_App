package com.example.uee_banking_app_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Create_Account_page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create__account_page2);
    }


    public void openNext(View view){
        Intent intent = new Intent(this, Confirm_New_Account.class);
        startActivity(intent);
    }

    public void back(View view){
        Intent intent = new Intent(this, Select_Account.class);
        startActivity(intent);
    }

}
