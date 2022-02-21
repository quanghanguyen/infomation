package com.example.infomation;

import androidx.annotation.Nullable;
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
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

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

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strName = name.getText().toString().trim();
                String strAvatar = name.getText().toString().trim();
                String strBirthday = name.getText().toString().trim();
                String strJob = name.getText().toString().trim();
                String strIntroduction = name.getText().toString().trim();

                Intent intent = new Intent();
                intent.putExtra("strName", strName);
                intent.putExtra("strAvatar", strAvatar);
                intent.putExtra("strBirthday", strBirthday);
                intent.putExtra("strJob", strJob);
                intent.putExtra("avatar", strIntroduction);
                openRecyclerActivity();

                setResult(2, intent);
                finish();

//                putNameData(strName);
//                putAvatarData(strAvatar);
//                putBirthdayData(strBirthday);
//                putJobData(strJob);
//                putIntroductionData(strIntroduction);

            }
        });

    }

//    private void putNameData(String strName) {
//        Intent intent = new Intent(this, RecyclerActivity.class);
//        intent.putExtra("strName", strName);
//        startActivityForResult(intent, 2);
//
//    }
//
//    private void putAvatarData(String strAvatar) {
//        Intent intent = new Intent(this, RecyclerActivity.class);
//        intent.putExtra("strAvatar", strAvatar);
//        startActivityForResult(intent, 2);
//    }
//
//    private void putBirthdayData(String strBirthday) {
//        Intent intent = new Intent(this, RecyclerActivity.class);
//        intent.putExtra("strBirthday", strBirthday);
//        startActivityForResult(intent, 2);
//    }
//
//    private void putJobData(String strJob) {
//        Intent intent = new Intent(this, RecyclerActivity.class);
//        intent.putExtra("strJob", strJob);
//        startActivityForResult(intent, 2);
//    }
//
//    private void putIntroductionData(String strIntroduction) {
//        Intent intent = new Intent(this, RecyclerActivity.class);
//        intent.putExtra("avatar", strIntroduction);
//        startActivityForResult(intent, 2);
//    }




    private void openRecyclerActivity() {
        String name_box = name.getText().toString();
        String birthday_box = birthday.getText().toString();
        String avatar_box = avatar.getText().toString();
        String job_box = job.getText().toString();
        String introduction_box = introduction.getText().toString();

        Intent intent = new Intent(this, RecyclerActivity.class);
        intent.putExtra("keyname", name_box);
        intent.putExtra("keybirthday", birthday_box);
        intent.putExtra("keyavatar", avatar_box);
        intent.putExtra("keyjob", job_box);
        intent.putExtra("keyintroduction", introduction_box);

        startActivity(intent);


    }
}