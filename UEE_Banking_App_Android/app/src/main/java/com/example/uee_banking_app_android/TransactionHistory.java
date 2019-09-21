package com.example.uee_banking_app_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.uee_banking_app_android.util.RecycerViewAdapterTHistory;

import java.util.ArrayList;

public class TransactionHistory extends AppCompatActivity {


    ArrayList<String> type ;
    ArrayList<String>  payment;
    ArrayList<String>  amount ;
    ArrayList<String>  balance;
    ArrayList<String>  date;
    ArrayList<Number>  positions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction_history);
        init();
        initValues();
        initRecyclerView();
    }

    private void init(){
        type = new ArrayList<>();
        payment = new ArrayList<>();
        amount = new ArrayList<>();
        balance = new ArrayList<>();
        date = new ArrayList<>();
        positions = new ArrayList<>();
    }


    private void filter(){

    }

    private void setFilterPosition(String key){
        ArrayList positions = new ArrayList<Number>();
        for(int i = 0; i >= type.size(); i++){
            if(type.get(i).matches("(.*)"+ key +"(.*)")||
            payment.get(i).matches("(.*)"+ key +"(.*)")  ||
            balance.get(i).matches("(.*)"+ key +"(.*)")  ||
            amount.get(i).matches("(.*)"+ key +"(.*)") ||
            date.get(i).matches("(.*)"+ key +"(.*)")){
                positions.add(i);
            }
        }
        this.positions = positions;
    }

    private void alterArray(){

    }



    private void initValues(){
        //
        type.add("ATM");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Credit");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Transfer");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Debit");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Payment");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Transfer");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Deposited");
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
        type.add("Credit");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Credit");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Payment");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Transfer");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Payment");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Debit");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Payment");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Debit");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Credit");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Transfer");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Debit");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Payment");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Transfer");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Deposited");
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
        type.add("Credit");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Credit");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Payment");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Transfer");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Credit");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Transfer");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Debit");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Payment");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Transfer");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Deposited");
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
        type.add("Credit");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Credit");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Payment");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Transfer");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Credit");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Transfer");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Debit");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Payment");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Transfer");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Deposited");
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
        type.add("Credit");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Credit");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Payment");
        payment.add("Withdrawal");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("ATM");
        payment.add("Deposited");
        amount.add("20,000");
        balance.add("234,678");
        date.add("12/12/19");
        type.add("Transfer");
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

    private void filterRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecycerViewAdapterTHistory adapter = new RecycerViewAdapterTHistory(this, type,
                payment, amount, balance, date);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


}
