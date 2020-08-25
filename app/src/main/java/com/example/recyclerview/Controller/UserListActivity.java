package com.example.recyclerview.Controller;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.res.Configuration;
import android.os.Bundle;

import com.example.recyclerview.R;

public class UserListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager=getSupportFragmentManager();

        Fragment fragment=fragmentManager.findFragmentById(R.id.fragment_container);

        if(fragment==null)
            fragmentManager.beginTransaction()
                    .add(R.id.fragment_container,new UserListFragment())
                    .commit();
    }

}