package com.example.infomation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private EditText name, avatar, birthday, job, introduction;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("Activity 1");


        btn = (Button) findViewById(R.id.btnLoad1);
        name = (EditText) findViewById(R.id.name_box);
        avatar = (EditText) findViewById(R.id.avatar_box);
        birthday = (EditText) findViewById(R.id.birthday_box);
        job = (EditText) findViewById(R.id.job_box);
        introduction = (EditText) findViewById(R.id.introduction_box);


//       btn.setOnClickListener(view -> openMainActivity2());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickAddUser();
            }
        });

    }

    private void clickAddUser() {



    }


//    public void openMainActivity2() {
//
//        String name_box = name.getText().toString();
//        String birthday_box = birthday.getText().toString();
//        String avatar_box = avatar.getText().toString();
//        String job_box = job.getText().toString();
//        String introduction_box = introduction.getText().toString();
//
//        Intent intent = new Intent(this, MainActivity2.class);
//        intent.putExtra("keyname", name_box);
//        intent.putExtra("keybirthday", birthday_box);
//        intent.putExtra("keyavatar", avatar_box);
//        intent.putExtra("keyjob", job_box);
//        intent.putExtra("keyintroduction", introduction_box);
//
//        startActivity(intent);
//
//
//    }
}