package com.example.uee_banking_app_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Create_Account_page2 extends AppCompatActivity {

    public EditText name;
    public EditText type;
    public EditText CLimit;
    public EditText dLimit;
    public EditText currency;

    private String[] pageOneData;
    private String[]  pageTwoData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create__account_page2);

        name =  findViewById(R.id.text_account_name);
        type =  findViewById(R.id.text_account_type);
        CLimit =  findViewById(R.id.text_credit_limit);
        dLimit =  findViewById(R.id.text_debit_limit);
        currency =  findViewById(R.id.text_currency);

        pageTwoData = new String[8];
        Bundle bundle = getIntent().getExtras();
        pageOneData = bundle.getStringArray("pageOneData");
    }


    public void openNext(View view){

        pageTwoData[0] = name.getText().toString().trim();
        pageTwoData[1] = type.getText().toString().trim();
        pageTwoData[2] = currency.getText().toString().trim();
        pageTwoData[3] = dLimit.getText().toString().trim();
        pageTwoData[4] = CLimit.getText().toString().trim();
        pageTwoData[5] = getInterest(pageTwoData[1]);
        pageTwoData[6] = getDebitInterest();
        pageTwoData[7] = "34%";

        Intent intent = new Intent(this, Confirm_New_Account.class);
        intent.putExtra("pageoOneData",pageOneData);
        intent.putExtra("pageTwoData", pageTwoData);
        startActivity(intent);
    }

    public void back(View view){
        Intent intent = new Intent(this, Select_Account.class);
        intent.putExtra("pageoOneData",pageOneData);
        startActivity(intent);
    }

    public String getCreditInterest(double creditLimit){
        if(creditLimit < 10000)
            return "34.0%";
        else if(creditLimit < 50000)
            return "32.5%";
        else if(creditLimit < 100000)
            return "30.9%";
        else if(creditLimit < 250000)
            return "30.0%";
        else if(creditLimit < 750000)
            return "29.3%";
        else if(creditLimit < 1000000)
            return "28.5%";
        else if(creditLimit < 1500000)
            return "29.4%";
        else if(creditLimit < 5000000)
            return "25.9%";

        return "34.0%";
    }

    public String getInterest(String type){
        if(type.trim().equals("Presonal"))
            return "4.9%";
        else if(type.trim().equals("Fixed"))
            return "6.7%";
        else if(type.trim().equals("Market"))
            return "0%";
        else if(type.trim().equals("Savings"))
            return "9.0%";

        return "0%";
    }

    public String getDebitInterest(){
        return "0.9%";
    }

}
