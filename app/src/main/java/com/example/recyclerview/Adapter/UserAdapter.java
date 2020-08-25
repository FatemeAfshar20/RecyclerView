package com.example.recyclerview.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.Model.Users;
import com.example.recyclerview.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.Holder> {

    Context mContext;
    List<Users> mUsersList;
    public UserAdapter(Context context, List<Users> usersList) {
        mContext = context;
        mUsersList = usersList;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(mContext);
        View view=layoutInflater.inflate(R.layout.item_view,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
            holder.bind(mUsersList.get(position));
    }



    @Override
    public int getItemCount() {
        return mUsersList.size();
    }

    class Holder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private CircleImageView mProfileImage;
        private TextView mProfileName;
        private Users mUser;

        public Holder(@NonNull View itemView) {
            super(itemView);
            findElem(itemView);
            itemView.setOnClickListener(this);
        }

        private void findElem(View view){
            mProfileImage=view.findViewById(R.id.profile_image);
            mProfileName=view.findViewById(R.id.profile_name);
        }

        public void bind(Users user){
            mUser=user;
            mProfileName.setText(user.getUserName());
            mProfileImage.setImageResource(user.getImageId());
        }


        @Override
        public void onClick(View v) {
            Snackbar snackbar =Snackbar.make(v,mUser.getUserName(),Snackbar.LENGTH_SHORT);
            snackbar.setTextColor(Color.RED);
            snackbar.setBackgroundTint(Color.YELLOW);
            snackbar.show();
        }
    }

}
