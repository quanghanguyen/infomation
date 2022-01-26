package com.example.infomation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity2 extends AppCompatActivity {

    Button btnLoad;
    ImageView imgHinh;
    String URL = "https://wallpapercave.com/wp/HFsWtAz.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);





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