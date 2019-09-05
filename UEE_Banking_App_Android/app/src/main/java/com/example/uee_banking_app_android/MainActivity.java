package com.example.uee_banking_app_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        Intent intent = new Intent(this,sms_verification.class);
        startActivity(intent);
    }

    public void forgotPassword(View view)
    {
        Intent intent = new Intent(this,ForgotPassword.class);
        startActivity(intent);

    }

    public void dontHaveAccount(View view)
    {
        Intent intent = new Intent(this,Register.class);
        startActivity(intent);
    }

//    /**
//     * Disabling back button
//     */
//    @Override
//    public void onBackPressed() {
//        Toast.makeText(getApplicationContext(), "Back button is disabled in this Screen", Toast.LENGTH_LONG).show();
//    }
}
