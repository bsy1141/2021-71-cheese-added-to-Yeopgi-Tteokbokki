package com.yubdduk.mbti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TimeActivity extends Activity {
    public static int time=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        Intent getIntent=getIntent();
        int nation=getIntent.getIntExtra("nation",0);

        Button slowbtn=(Button)findViewById(R.id.Button_slow);
        Button fastbtn=(Button)findViewById(R.id.Button_fast);

        slowbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time=1;
                Intent intent=new Intent(TimeActivity.this,LevelActivity.class);
                intent.putExtra("nation",nation);
                intent.putExtra("time",time);
                startActivity(intent);
            }
        });

        fastbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time=2;
                Intent intent=new Intent(TimeActivity.this,LevelActivity.class);
                intent.putExtra("nation",nation);
                intent.putExtra("time",time);
                startActivity(intent);
            }
        });
    }
}
