package com.sumit.viewpagerwithcircleindigater;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class sliderAdapter extends RecyclerView.Adapter<sliderAdapter.MyViewHolder> {
    int list[];

    public  sliderAdapter(int[] list){
        this.list = list;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.view.setBackgroundColor(list[position]);
    }

    @Override
    public int getItemCount() {
        return list.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        View view;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView.findViewById(R.id.view);
        }
    }

}