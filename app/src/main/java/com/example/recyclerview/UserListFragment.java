package com.example.recyclerview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyclerview.Adapter.UserAdapter;
import com.example.recyclerview.Database.UsersInfo;
import com.example.recyclerview.Model.Users;

import java.util.ArrayList;
import java.util.List;


public class UserListFragment extends Fragment {
    RecyclerView mRecyclerView;
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
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        List<Users> usersList=UsersInfo.getInstance().getUsersList();
        mRecyclerView.setAdapter(new UserAdapter(getContext(),usersList));
        return view;

    }
}