package com.yubdduk.mbti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WillCookActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activy_willcook);

        Button canbtn=(Button)findViewById(R.id.Button_can);
        Button cannotbtn=(Button)findViewById(R.id.Button_cant);

        canbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WillCookActivity.this,FlavorActivity.class);
                startActivity(intent);
            }
        });

        /*
        cannotbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WillCookActivity.this, NationActivity.class);
                startActivity(intent);
            }
        });
         */
    }
}
