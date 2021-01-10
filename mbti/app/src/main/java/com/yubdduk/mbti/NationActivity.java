package com.yubdduk.mbti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NationActivity extends Activity {
    public static String nation="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nation);

        Button chinabtn=(Button)findViewById(R.id.Button_china);
        Button japanbtn=(Button)findViewById(R.id.Button_japan);
        Button koreabtn=(Button)findViewById(R.id.Button_korea);
        Button westbtn=(Button)findViewById(R.id.Button_west);
        Button fusionbtn=(Button)findViewById(R.id.Button_fusion);

        chinabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nation="중국";
                Intent intent=new Intent(NationActivity.this,TimeActivity.class);
                intent.putExtra("nation",nation);
                startActivity(intent);
            }
        });

        japanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nation="일본";
                Intent intent=new Intent(NationActivity.this,TimeActivity.class);
                intent.putExtra("nation",nation);
                startActivity(intent);
            }
        });

        koreabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nation="한식";
                Intent intent=new Intent(NationActivity.this,TimeActivity.class);
                intent.putExtra("nation",nation);
                startActivity(intent);
            }
        });

        westbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nation="이탈리아";
                Intent intent=new Intent(NationActivity.this,TimeActivity.class);
                intent.putExtra("nation",nation);
                startActivity(intent);
            }
        });

        fusionbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nation="퓨전";
                Intent intent=new Intent(NationActivity.this,TimeActivity.class);
                intent.putExtra("nation",nation);
                startActivity(intent);
            }
        });
    }
}
