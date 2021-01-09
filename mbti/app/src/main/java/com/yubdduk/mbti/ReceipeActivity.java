package com.yubdduk.mbti;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ReceipeActivity extends Activity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<ReceipeInfo> mData;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipe);

        recyclerView = (RecyclerView) findViewById(R.id.receipe_recycler_view);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //mAdapter = new mAdapter(mData);
        //recyclerView.setAdapter(mAdapter);

        // specify an adapter (see also next example)
        mData = new ArrayList<>();
        mAdapter = new ReceipeAdapter(mData);
        recyclerView.setAdapter(mAdapter);

        mData.add(new ReceipeInfo("떡볶이"));
        mData.add(new ReceipeInfo("엽떡"));
        mData.add(new ReceipeInfo("71개"));

    }
}
