package com.yubdduk.mbti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LevelActivity extends Activity {
    public static int level=0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        Intent getIntent=getIntent();
        int nation=getIntent.getIntExtra("nation",0);
        int time=getIntent.getIntExtra("time",0);

        Button lowbtn=(Button)findViewById(R.id.Button_low);
        Button highbtn=(Button)findViewById(R.id.Button_high);

        lowbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level=1;
                Intent intent=new Intent(LevelActivity.this, ReceipeActivity.class);
                intent.putExtra("nation",nation);
                intent.putExtra("time",time);
                intent.putExtra("level",level);
                startActivity(intent);
            }
        });

        highbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level=2;
                Intent intent=new Intent(LevelActivity.this, ReceipeActivity.class);
                intent.putExtra("nation",nation);
                intent.putExtra("time",time);
                intent.putExtra("level",level);
                startActivity(intent);
            }
        });
    }
}
