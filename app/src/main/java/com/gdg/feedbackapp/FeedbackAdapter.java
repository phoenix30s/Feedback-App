package com.gdg.feedbackapp;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FeedbackAdapter extends RecyclerView.Adapter {

ArrayList<GDGFeedback> gdgFeedbackList;
Context context;

public FeedbackAdapter(Context context,ArrayList<GDGFeedback>feedbackList){
    gdgFeedbackList = feedbackList;
    this.context=context;
}

  class FeedBackViewHolder extends  RecyclerView.ViewHolder{

    TextView name,occupation,qualification,rating;
      public FeedBackViewHolder(@NonNull View itemView) {
          super(itemView);
          name = (TextView)itemView.findViewById(R.id.nameTV);
          occupation=(TextView)itemView.findViewById(R.id.occupationTV);
          qualification=(TextView)itemView.findViewById(R.id.qualificationTV);
          rating=(TextView)itemView.findViewById(R.id.ratingTV);

      }
  }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new FeedBackViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

      GDGFeedback gf = gdgFeedbackList.get(position);
      
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
