package com.example.uee_banking_app_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.uee_banking_app_android.util.RecycerViewAdapterTHistory;

import java.util.ArrayList;

public class TransactionHistory extends AppCompatActivity {


    ArrayList<String> type = new ArrayList<>();
    ArrayList<String>  payment = new ArrayList<>();
    ArrayList<String>  amount = new ArrayList<>();
    ArrayList<String>  balance = new ArrayList<>();
    ArrayList<String>  date = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_history);
    }


    private void initValues(){
        //
        type.add("ATM");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Credit");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Transfer");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Debit");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("payment");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");


    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecycerViewAdapterTHistory adapter = new RecycerViewAdapterTHistory(this, type,
                payment, amount, balance, date);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
