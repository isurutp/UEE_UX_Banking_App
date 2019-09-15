package com.example.uee_banking_app_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class bank_transfer extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager ;
    BankTransferPagesAdapter pageAdapter ;
    TabItem ownAccTab ;
    TabItem hnbTab;
    TabItem otherBankTab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_transfer);

        tabLayout = findViewById(R.id.tabLayoutbill) ;
        ownAccTab = findViewById(R.id.ownAccTab);
        hnbTab = findViewById(R.id.hnbTab);
        otherBankTab = findViewById(R.id.otherBankTab);
        viewPager = findViewById(R.id.transferViewPager);

        pageAdapter = new BankTransferPagesAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}
