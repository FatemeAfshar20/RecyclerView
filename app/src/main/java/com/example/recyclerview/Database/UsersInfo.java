package com.example.recyclerview.Database;

import com.example.recyclerview.Model.Users;
import com.example.recyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class UsersInfo {
    private static UsersInfo mInstance;

    private UsersInfo() {
        generateUsers();
    }

    private Users mUsers;
    private List<Users> mUsersList=new ArrayList<>();

    private String[] mNames={
       "Artemis",
       "Leila",
       "Mona",
       "Tarane",
       "Utab",
       "Katayon",
       "Negin",
       "Anahita",
       "Mehrimah",
       "Sama",
       "Nahid",
       "Tina"
    };

    private int[] mImageIds={
            R.drawable.img_0,
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4,
            R.drawable.img_5,
            R.drawable.img_6,
            R.drawable.img_7,
            R.drawable.img_8,
            R.drawable.img_9,
            R.drawable.img_10,
            R.drawable.img_11,
    };

    public void generateUsers(){
        for (int i = 0; i <mNames.length ; i++) {
            mUsersList.add(new Users(mNames[i],mImageIds[i]));
        }
    }

    public static UsersInfo getInstance(){
        if(mInstance==null)
            mInstance=new UsersInfo();
        return mInstance;
    }

    public List<Users> getUsersList() {
        return mUsersList;
    }

}
