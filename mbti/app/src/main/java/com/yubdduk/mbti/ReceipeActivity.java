package com.yubdduk.mbti;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.facebook.drawee.backends.pipeline.Fresco;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
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

        // RecyclerView 변수 정의
        recyclerView = (RecyclerView) findViewById(R.id.receipe_recycler_view);

        recyclerView.setHasFixedSize(true);

        // RecyclerView Manager 지정
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        mData = new ArrayList<>();

        foodJsonParser();

        mAdapter = new ReceipeAdapter(mData, ReceipeActivity.this);
        recyclerView.setAdapter(mAdapter);

        /*List Add
        mData.add(new ReceipeInfo("떡볶이"));
        mData.add(new ReceipeInfo("엽떡"));
        mData.add(new ReceipeInfo("71개"));
        */

        //foodJsonParser();
    }

    void foodJsonParser(){
        // json 파일 읽어와서 분석하기
        // 창고관리자 얻어오기
        AssetManager am = getAssets();

        // assets/ test.json 파일 읽기 위한 InputStream
        try{
            InputStream is = am.open("receipe_base.json");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr);

            //ArrayList<ReceipeInfo> ri = new ArrayList<>;

            StringBuffer buffer = new StringBuffer();
            String line = reader.readLine();

            while(line!=null){
                buffer.append(line+'\n');
                line=reader.readLine();
            }

            String jsonData = buffer.toString();

            JSONObject jsonObject = new JSONObject(jsonData);
            String data = jsonObject.getString("data");

            JSONArray jsonArray = new JSONArray(data);

            for(int i=0;i<jsonArray.length();i++){
                JSONObject jo = jsonArray.getJSONObject(i);

                String name = jo.getString("RECIPE_NM_KO");
                String imgSrc = jo.getString("IMG_URL");

                mData.add(new ReceipeInfo(name, imgSrc));

            }
        } catch(IOException e) { e.printStackTrace(); }
        catch(JSONException e) { e.printStackTrace(); }

    }

}
