package com.example.infomation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.google.android.material.tabs.TabLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity2 extends AppCompatActivity {

//    Button btnLoad;
//    ImageView imgHinh;
//    String URL = "https://wallpapercave.com/wp/HFsWtAz.jpg";

    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    this.setTitle("Infomation");

        mTabLayout = findViewById(R.id.tab_layout);
        mViewPager = findViewById(R.id.view_pager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager.setAdapter(viewPagerAdapter);

        mTabLayout.setupWithViewPager(mViewPager);



//        btnLoad = (Button)findViewById(R.id.btnLoad);
//        imgHinh = (ImageView)findViewById(R.id.imgHinh);
//        btnLoad.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Glide.with(getApplicationContext()).load(URL).into(imgHinh);
//            }
//        });

    }
}