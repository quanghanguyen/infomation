package com.example.infomation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnLoad1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("Add Infomation");


        btnLoad1 = (Button) findViewById(R.id.btnLoad1);

        btnLoad1.setOnClickListener(view -> openMainActivity2());

    }

    public void openMainActivity2()
        {
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);


        }
}