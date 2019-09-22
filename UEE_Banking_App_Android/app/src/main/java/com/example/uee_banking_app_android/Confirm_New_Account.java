package com.example.uee_banking_app_android;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Confirm_New_Account extends AppCompatActivity {

    public TextView name;
    public TextView owner;
    public TextView branch;
    public TextView currency;
    public TextView interest;
    public TextView type;
    public TextView CLimit;
    public TextView dLimit;
    public TextView cInterest;
    public TextView dInterest;

    private String[] pageOneData;
    private String[]  pageTwoData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm__new__account);

        Bundle bundle = getIntent().getExtras();
        pageOneData = bundle.getStringArray("pageOneData");
        pageTwoData = bundle.getStringArray("pageTwoData");

        name = findViewById(R.id.header);
        //owner = findViewById(R.id.text_owner);
        branch = findViewById(R.id.text_branch);
        currency = findViewById(R.id.text_currency);
        interest = findViewById(R.id.text_interest);
        type = findViewById(R.id.text_account_type);
        CLimit = findViewById(R.id.text_credit_limit);
        dLimit = findViewById(R.id.text_debit_limit);
        cInterest = findViewById(R.id.text_credit_interest);
        dInterest = findViewById(R.id.text_debit_interest);

        init();
    }


    private void init(){
        name.setText(pageTwoData[0]);
//        owner.setText("John Doe");
//        branch.setText(pageOneData[2]);
//        currency.setText(pageTwoData[2]);
//        interest.setText(pageTwoData[5]);
//        type.setText(pageTwoData[1]);
//        CLimit.setText(pageTwoData[3]);
//        dLimit.setText(pageTwoData[4]);
//        cInterest.setText(pageTwoData[7]);
//        dInterest.setText(pageTwoData[6]);
    }



    public void openPage1(View view){
        Intent intent = new Intent(this, CreateAccount.class);
        intent.putExtra("pageoOneData",pageOneData);
        intent.putExtra("pageTwoData", pageTwoData);
        startActivity(intent);
    }
    public void openPage2(View view){
        Intent intent = new Intent(this, Create_Account_page2.class);
        intent.putExtra("pageoOneData",pageOneData);
        intent.putExtra("pageTwoData", pageTwoData);
        startActivity(intent);
    }

    public void confirm(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Confromation Message");
        builder.setMessage("Account Repuest has been made an e-mail will be sent to your email within 3 to 5 working days");
        builder.setPositiveButton("confirm", null);
        builder.show();
        Intent intent = new Intent(this, Select_Account.class);
        startActivity(intent);
    }
    public void cancel(View view){
        Intent intent = new Intent(this, Select_Account.class);
        startActivity(intent);
    }
}








