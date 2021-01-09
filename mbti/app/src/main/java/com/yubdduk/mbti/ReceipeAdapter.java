package com.yubdduk.mbti;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ReceipeAdapter extends RecyclerView.Adapter<ReceipeAdapter.ViewHolder> {
    private ArrayList<ReceipeInfo> mData;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public ViewHolder(View v) {

            super(v);
            imageView = v.findViewById(R.id.image);
            textView = v.findViewById(R.id.title);
        }
    }

    public ReceipeAdapter(ArrayList<ReceipeInfo> mData) {
        this.mData = mData;
    }

    public ReceipeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(R.layout.recom_receipe, parent, false);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(ViewHolder holder, int position){
        holder.imageView.setImageResource(mData.get(position).getImg());
        holder.textView.setText(mData.get(position).getName());
    }

    public int getItemCount(){
        return mData.size();
    }
}

