package com.example.blog.Activities;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import com.example.blog.Activities.Fragments.NewMissionActivity1;
import com.example.blog.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MissionActivity extends AppCompatActivity
{
    FirebaseAuth author;
    FirebaseUser curUser;
    Button otherMissionPage, myPostPage;
    ImageView noPostImg;
    TextView missionNoPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_post);
        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //ini

        author = FirebaseAuth.getInstance();
        curUser = author.getCurrentUser();

        FloatingActionButton fab1 = findViewById(R.id.add_new_post);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewMissionActivity1();
            }
        });
    }

    private void openNewMissionActivity1() {
        Intent intent = new Intent(this, NewMissionActivity1.class);
        startActivity(intent);
    }

    //TODO: Once first post is saved, make image and sentence invisible
    //TODO: Display the Post, make sure the page is scrollable
    //TODO: Link to Other Post
    //TODO: Other Post needs to display all the posts from all the accounts

}
