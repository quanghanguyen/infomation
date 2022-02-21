package com.example.infomation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    private Button btn;
    private RecyclerView rcvUser;
    private AdapterUser userAdapter;

    //private TextView edtNameReceived;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        rcvUser = findViewById(R.id.rcvUser);
        btn = (Button) findViewById(R.id.btnAdd);

        //edtNameReceived = (TextView) findViewById(R.id.tv_sarah_name);

        userAdapter = new AdapterUser(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }

        });

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvUser.setLayoutManager(linearLayoutManager);

        // Viết một hàm riêng bên ngoài?
        userAdapter.setData(getListUser());
        rcvUser.setAdapter(userAdapter);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        // check if the request code is same as what is passed  here it is 2
        if(requestCode==2)
        {
            String receivedData = data.getStringExtra("strName");
            //textView1.setText(receivedData);
        }
    }



    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        startActivityForResult(intent, 2);
    }




    private List<User> getListUser()
    {
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.avatar_2, "Jordan"));
        list.add(new User(R.drawable.avatar_3, "Belle"));
        list.add(new User(R.drawable.avatar_4, "Jane"));
        list.add(new User(R.drawable.avatar_5, "Jack"));
        //list.add(new User(R.drawable.avata_6, "Winx"));
        //list.add(new User(R.drawable.avatar_7, "Jack"));
        //list.add(new User(R.drawable.avatar_8, "Peter"));
        //list.add(new User(R.drawable.avatar_9, "Elon"));
        //list.add(new User(R.drawable.avatar_2, receivedData));

        return list;

//        findViewById(R.id.btnLoad1).setOnClickListener(view -> {
//            list.add(new User(R.drawable.avata_6, "Quang"));
//            userAdapter.notifyDataSetChanged();
//        });

        private void addItem(String item) {
        list.add(item);
        userAdapter.notifyDataSetChanged();
    }

        addItem("New Item");
    }

}