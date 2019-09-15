package com.example.uee_banking_app_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class credit_cards extends AppCompatActivity {

    TabLayout tabLayout ;
    ViewPager viewPager ;
    CreditCardsPageAdapter pageAdapter ;
    TabItem myCardTab ;
    TabItem addCardTab ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_cards);

        tabLayout = findViewById(R.id.tabLayout) ;
        myCardTab = findViewById(R.id.myCards);
        addCardTab = findViewById(R.id.addCards);
        viewPager = findViewById(R.id.viewPager);

        pageAdapter = new CreditCardsPageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
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

    public void mainMenu(View v){
        Intent intent = new Intent(this,menu_screen.class);
        startActivity(intent);
    }


    //    /**
//     * Disabling back button
//     */
    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "Back button is disabled in this Screen", Toast.LENGTH_LONG).show();
    }
}
