package com.example.uee_banking_app_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
    }

    public void closeMenu(View view) {
        Intent intent = new Intent(this,sms_verification.class);
        startActivity(intent);
    }

    public void logoutBttn(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
