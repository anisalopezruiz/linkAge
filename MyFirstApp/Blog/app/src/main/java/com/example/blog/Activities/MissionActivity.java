package com.example.blog.Activities;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import com.example.blog.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MissionActivity extends AppCompatActivity
{
    FirebaseAuth author;
    FirebaseUser curUser;
    Dialog addMission;
    Button otherMissionPage, myPostPage;
    ImageView noPostImg;
    TextView missionNoPost;

    private void addNewMission()
    {
        addMission = new Dialog(this);
        addMission.setContentView(R.layout.other_post);
        addMission.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        addMission.getWindow().setLayout(Toolbar.LayoutParams.MATCH_PARENT, Toolbar.LayoutParams.WRAP_CONTENT);
        addMission.getWindow().getAttributes().gravity = Gravity.TOP;

        //mission page widgets
        otherMissionPage = addMission.findViewById(R.id.mission_other_posts);
        myPostPage = addMission.findViewById(R.id.mission_my_post);
        noPostImg = addMission.findViewById(R.id.no_post_image);
        missionNoPost = addMission.findViewById(R.id.mission_no_post);

    }

}
