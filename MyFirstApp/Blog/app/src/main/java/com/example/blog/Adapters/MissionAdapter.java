package com.example.blog.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.blog.Activities.Models.Mission;
import com.example.blog.R;

import java.util.List;

public class MissionAdapter extends RecyclerView.Adapter<MissionAdapter.MyViewHolder> {

    Context mContext;
    List<Mission> mData;

    public MissionAdapter(Context mContext, List<Mission> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View row = LayoutInflater.from(mContext).inflate(R.layout.row_mission_item, parent, false);
        return new MyViewHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.mTitle.setText(mData.get(position).getTitle());
        holder.mDate.setText(mData.get(position).getDate());
        holder.mTime.setText(mData.get(position).getTime());
        holder.mDesc.setText(mData.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView mBackground;
        TextView mTitle;
        TextView mDate;
        TextView mTime;
        TextView mDesc;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mBackground = itemView.findViewById(R.id.mission_background);
            mTitle = itemView.findViewById(R.id.row_mission_title);
            mDate = itemView.findViewById(R.id.row_mission_date);
            mTime = itemView.findViewById(R.id.row_mission_time);
            mDesc = itemView.findViewById(R.id.row_mission_desc);
        }
    }
}
