package com.yubdduk.mbti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YesterdayActivity extends Activity {
    public static int yesterday=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yesterday);

        Intent getIntent=getIntent();
        int flavor=getIntent.getIntExtra("flavor",0);
        int hungry=getIntent.getIntExtra("hungry",0);

        Button friedbtn=(Button)findViewById(R.id.Button_fried);
        Button flourbtn=(Button)findViewById(R.id.Button_flour);
        Button meatbtn=(Button)findViewById(R.id.Button_meat);
        Button etcbtn=(Button)findViewById(R.id.Button_etc);

        friedbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yesterday=1;
                Intent intent=new Intent(YesterdayActivity.this,WillNotCook_ResultActivity.class);
                intent.putExtra("flavor",flavor);
                intent.putExtra("hungry",hungry);
                intent.putExtra("yesterday",yesterday);
                startActivity(intent);
            }
        });

        flourbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yesterday=2;
                Intent intent=new Intent(YesterdayActivity.this,WillNotCook_ResultActivity.class);
                intent.putExtra("flavor",flavor);
                intent.putExtra("hungry",hungry);
                intent.putExtra("yesterday",yesterday);
                startActivity(intent);
            }
        });

        meatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yesterday=3;
                Intent intent=new Intent(YesterdayActivity.this,WillNotCook_ResultActivity.class);
                intent.putExtra("flavor",flavor);
                intent.putExtra("hungry",hungry);
                intent.putExtra("yesterday",yesterday);
                startActivity(intent);
            }
        });

        etcbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yesterday=4;
                Intent intent=new Intent(YesterdayActivity.this,WillNotCook_ResultActivity.class);
                intent.putExtra("flavor",flavor);
                intent.putExtra("hungry",hungry);
                intent.putExtra("yesterday",yesterday);
                startActivity(intent);
            }
        });
    }
}
