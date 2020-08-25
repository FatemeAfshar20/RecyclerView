package com.example.recyclerview.Controller;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyclerview.Adapter.UserAdapter;
import com.example.recyclerview.Database.UsersInfo;
import com.example.recyclerview.Model.Users;
import com.example.recyclerview.R;

import java.util.ArrayList;
import java.util.List;


public class UserListFragment extends Fragment {
    RecyclerView mRecyclerView;
    Configuration mConfig=new Configuration();
    public UserListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_user_list, container, false);
        mRecyclerView=view.findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        List<Users> usersList=UsersInfo.getInstance().getUsersList();
        mRecyclerView.setAdapter(new UserAdapter(getContext(),usersList));
        return view;
    }


}