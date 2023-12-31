package com.example.parcial3;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Menu extends AppCompatActivity {
    Adapter mAdapter;
    ViewPager2 viewpager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        viewpager2 = findViewById(R.id.viewPager2);
        mAdapter =new Adapter(getSupportFragmentManager(),getLifecycle());
        mAdapter.addFragment(new HomeFragment());
        mAdapter.addFragment(new AccountFragment());
        mAdapter.addFragment(new SettingFragment());
        mAdapter.addFragment(new AccesoriosFragment());

        viewpager2.setAdapter(mAdapter);

        TabLayout tablayout =findViewById(R.id.tabLayout);

        new TabLayoutMediator(tablayout,viewpager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                    switch (position) {
                        case 0:
                            tab.setText("PC ESCRITORIO");
                            break;
                        case 1:
                            tab.setText("LAPTOPS");
                            break;

                        case 2:
                            tab.setText("SMARTPONES");
                            break;
                        case 3:
                            tab.setText("ACCESORIOS");
                            break;
                    }
            }
        }).attach();

    }
}