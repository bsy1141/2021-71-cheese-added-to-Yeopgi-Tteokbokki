package com.yubdduk.mbti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FlavorActivity extends Activity {
    public static int flavor=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flavor);

        Intent getintent = getIntent();
        getintent.getIntExtra("willcook",0);

        Button sweetbtn=(Button)findViewById(R.id.Button_flavor_sweet);
        Button saltybtn=(Button)findViewById(R.id.Button_flavor_salty);
        Button spicybtn=(Button)findViewById(R.id.Button_flavor_spicy);
        Button oilybtn=(Button)findViewById(R.id.Button_flavor_oily);

        /*
        sweetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flavor=1;
                Intent intent=new Intent(FlavorActivity.this,YesterdayActivity.this);
            }
        });
         */
    }
}
