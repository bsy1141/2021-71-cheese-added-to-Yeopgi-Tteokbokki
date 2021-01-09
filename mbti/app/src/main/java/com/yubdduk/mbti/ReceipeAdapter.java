package com.yubdduk.mbti;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.facebook.common.util.UriUtil;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequest;

import java.net.URI;
import java.util.ArrayList;


public class ReceipeAdapter extends RecyclerView.Adapter<ReceipeAdapter.ViewHolder> {
    private ArrayList<ReceipeInfo> mData;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        SimpleDraweeView imgView;

        public ViewHolder(View v) {
            super(v);
            //imageView = v.findViewById(R.id.image);
            textView = v.findViewById(R.id.title);
            imgView = (SimpleDraweeView) v.findViewById(R.id.image);
        }
    }

    public ReceipeAdapter(ArrayList<ReceipeInfo> mData, Context context) {
        this.mData = mData;
        Fresco.initialize(context);
    }

    public ReceipeAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(R.layout.recom_receipe, parent, false);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(ViewHolder holder, int position){

        ReceipeInfo ri = mData.get(position);

        //Uri uri = Uri.parse(ri.getImgsrc());
        Uri uri = new Uri.Builder()
                .scheme(UriUtil.LOCAL_RESOURCE_SCHEME)
                .path("/Users/syexn/Desktop/m/mbti/2021-71-cheese-added-to-Yeopgi-Tteokbokki/mbti/app/src/main/res/drawable/carbonara.jpg")
                .build();
        holder.imgView.setImageURI(uri);

        //Log.d("uri", uri.toString());
        //Log.d("imgView", holder.imgView.toString());

        holder.textView.setText(mData.get(position).getName());

    }

    public int getItemCount(){
        return mData.size();
    }
}

