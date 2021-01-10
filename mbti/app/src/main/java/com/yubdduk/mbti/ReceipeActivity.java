package com.yubdduk.mbti;

import android.app.Activity;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
    private TextView TextView_reresult;

    public static String nation="";
    public static int time=0;
    public static int level=0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipe);

        Button homebtn=(Button)findViewById(R.id.going_home);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ReceipeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Intent getIntent=getIntent();
        nation=getIntent.getStringExtra("nation");
        time=getIntent.getIntExtra("time",0);
        level=getIntent.getIntExtra("level",0);

        // RecyclerView 변수 정의
        recyclerView = (RecyclerView) findViewById(R.id.receipe_recycler_view);
        TextView_reresult=(TextView) findViewById(R.id.TextView_reresult);

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
            if (time == 1 && level == 1) {

                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jo = jsonArray.getJSONObject(i);

                    String name = jo.getString("RECIPE_NM_KO");
                    String imgSrc = jo.getString("IMG_URL");

                    String nation_food=jo.getString("NATION_NM");
                    String time_food=jo.getString("COOKING_TIME");
                    String level_food=jo.getString("LEVEL_NM");

                    if (nation.equals(nation_food) && (time_food.equals("10분") || time_food.equals("20분") || time_food.equals("30분")) && level_food.equals("초보환영")){
                        mData.add(new ReceipeInfo(name, imgSrc));

                    }

                }
            }else if(time==1&&level==2){
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jo = jsonArray.getJSONObject(i);

                    String name = jo.getString("RECIPE_NM_KO");
                    String imgSrc = jo.getString("IMG_URL");

                    String nation_food=jo.getString("NATION_NM");
                    String time_food=jo.getString("COOKING_TIME");
                    String level_food=jo.getString("LEVEL_NM");

                    if (nation.equals(nation_food) &&(time_food.equals("10분") || time_food.equals("20분") || time_food.equals("30분")) && level_food.equals("초보환영")){
                        mData.add(new ReceipeInfo(name, imgSrc));

                    }
                }
            }else if(time==2&&level==1){
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jo = jsonArray.getJSONObject(i);

                    String name = jo.getString("RECIPE_NM_KO");
                    String imgSrc = jo.getString("IMG_URL");

                    String nation_food=jo.getString("NATION_NM");
                    String time_food=jo.getString("COOKING_TIME");
                    String level_food=jo.getString("LEVEL_NM");

                    if (nation.equals(nation_food) &&  (time_food.equals("40분") || time_food.equals("50분") || time_food.equals("60분")) &&level_food.equals("초보환영")){
                        mData.add(new ReceipeInfo(name, imgSrc));

                    }
                }
            }else if(time==2&&level==2) {
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject jo = jsonArray.getJSONObject(i);

                    String name = jo.getString("RECIPE_NM_KO");
                    String imgSrc = jo.getString("IMG_URL");

                    String nation_food = jo.getString("NATION_NM");
                    String time_food = jo.getString("COOKING_TIME");
                    String level_food = jo.getString("LEVEL_NM");
                    if (nation.equals(nation_food) && (time_food.equals("40분") || time_food.equals("50분") || time_food.equals("60분")) && (level_food.equals("보통") || level_food.equals("어려움"))) {
                        mData.add(new ReceipeInfo(name, imgSrc));
                    }
                }

            }
            if(mData.isEmpty()){
                TextView_reresult.setText("데이터가 부족하네 ;_;");
            }


        } catch(IOException e) { e.printStackTrace(); }
        catch(JSONException e) { e.printStackTrace(); }

    }

}
