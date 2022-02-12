package com.example.infomation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    private RecyclerView rcvUser;
    private AdapterUser userAdapter;
    private UserViewModel userViewModel;

    private Button btnAdddata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        rcvUser = findViewById(R.id.rcvUser);


        btnAdddata = (Button) findViewById(R.id.btnAddData);

        btnAdddata.setOnClickListener(view -> openMainActivity());

        userAdapter = new AdapterUser(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvUser.setLayoutManager(linearLayoutManager);

        // Viết một hàm riêng bên ngoài?
        userAdapter.setData(getListUser());
        rcvUser.setAdapter(userAdapter);

        userViewModel = new ViewModelProvider(this).get(UserViewModel.class);
        userViewModel.getmListUserLiveData().observe((this, new Observer<List<User>>() {
            @Override
            public void onChanged(List<User> users) {
                userAdapter = new AdapterUser(users);
                rcvUser.setAdapter(userAdapter);
            }
        }));

    }

    public void openMainActivity() {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }



    private List<User> getListUser()
    {
        List<User> list = new ArrayList<>();
        list.add(new User(R.drawable.avatar_2, "Jordan"));
        list.add(new User(R.drawable.avatar_3, "Belle"));
        list.add(new User(R.drawable.avatar_4, "Jane"));
        list.add(new User(R.drawable.avatar_5, "Matt"));
        list.add(new User(R.drawable.avata_6, "Winx"));
        list.add(new User(R.drawable.avatar_7, "Jack"));
        list.add(new User(R.drawable.avatar_8, "Peter"));
        list.add(new User(R.drawable.avatar_9, "Elon"));

        return list;
    }
}