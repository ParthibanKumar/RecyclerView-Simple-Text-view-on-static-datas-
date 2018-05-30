package com.example.saran.simple_recycler_view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.myViewholder>


    {
        Context context;
        ArrayList<ListModel>arrayList=new ArrayList<>();

        public CustomAdapter(Context context, ArrayList<ListModel> arrayList)
        {
            this.context = context;
            this.arrayList = arrayList;
        }



    @NonNull
    @Override
    public myViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View appearence = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_row,parent,false);
        myViewholder myViewHolder = new myViewholder(appearence);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull myViewholder holder, int position)
    {
        ListModel listModel = arrayList.get(position);
       holder.tv.setText(listModel.getTextuals());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class myViewholder extends RecyclerView.ViewHolder
    {
        TextView tv;
        public myViewholder(View itemView)
        {
            super(itemView);
            tv= itemView.findViewById(R.id.textView);

        }
    }

    }
