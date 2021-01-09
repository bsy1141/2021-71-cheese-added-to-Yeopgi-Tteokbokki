package com.yubdduk.mbti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class HungryActivity extends Activity{
    public static int hungry=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hungry);

        Intent getIntent=getIntent();
        int flavor=getIntent.getIntExtra("flavor",0);

        RelativeLayout littlebitbtn=(RelativeLayout)findViewById(R.id.RelativeLayout_little_bit);
        RelativeLayout sosobtn=(RelativeLayout)findViewById(R.id.RelativeLayout_soso);
        RelativeLayout almostdiebtn=(RelativeLayout)findViewById(R.id.RelativeLayout_almost_die);

        littlebitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hungry=1;
                Intent intent=new Intent(HungryActivity.this,YesterdayActivity.class);
                intent.putExtra("flavor",flavor);
                intent.putExtra("hungry",hungry);
                startActivity(intent);
            }
        });

        sosobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hungry=2;
                Intent intent=new Intent(HungryActivity.this,YesterdayActivity.class);
                intent.putExtra("flavor",flavor);
                intent.putExtra("hungry",hungry);
                startActivity(intent);
            }
        });

        almostdiebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hungry=2;
                Intent intent=new Intent(HungryActivity.this,YesterdayActivity.class);
                intent.putExtra("flavor",flavor);
                intent.putExtra("hungry",hungry);
                startActivity(intent);
            }
        });
    }
}
