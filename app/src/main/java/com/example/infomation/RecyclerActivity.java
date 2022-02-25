package com.example.infomation;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;

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
    List<User> list = new ArrayList();
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

        rcvUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity2();
            }
        });


        // chỗ này đây

        rcvUser.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                ConfirmDelete();

                return false;
            }
        });

        }

    public void openMainActivity2() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        // check if the request code is same as what is passed  here it is 2
        if (requestCode == 2) {
            String receivedData = data.getStringExtra("strName");
            addItem(new User(R.drawable.avatar_2, receivedData));
            //list.add(new User(R.drawable.avatar_2, receivedData));
            //userAdapter.setSingleData(new User(R.drawable.avatar_2, receivedData));
            //textView1.setText(receivedData);
        }
    }


    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        startActivityForResult(intent, 2);
    }


    private List<User> getListUser() {
       list = new ArrayList<>();
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
    }
    private void addItem(User item) {
        list.add(item);
        userAdapter.notifyDataSetChanged();
       // addItem("New Item");
    }

    private void ConfirmDelete() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.delete);
        builder.setIcon(R.mipmap.ic_launcher);

        builder.show();

    }
}

