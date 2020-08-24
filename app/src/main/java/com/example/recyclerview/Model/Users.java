package com.example.recyclerview.Model;

public class Users {
    private String mUserName;
    private int mImageId;

    public Users(String userName, int imageId) {
        mUserName = userName;
        mImageId = imageId;
    }

    public String getUserName() {
        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }
}
