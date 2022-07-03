package com.example.placement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener;

public class CseActivity extends AppCompatActivity
{
    TabLayout tabLayout;
    TabItem tabItem1,tabItem2;
    ViewPager2 viewPager;

    PageAdapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse);

        tabLayout = (TabLayout) findViewById(R.id.tablayout1);

        viewPager = (ViewPager2) findViewById(R.id.vpager);

//        tabLayout.addTab(tabLayout.newTab().setText("Resources"));
//        tabLayout.addTab(tabLayout.newTab().setText("Scheduler"));

        FragmentManager  fragmentManager =getSupportFragmentManager();
        pageAdapter = new PageAdapter(fragmentManager , getLifecycle());

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

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });



    }
    }
