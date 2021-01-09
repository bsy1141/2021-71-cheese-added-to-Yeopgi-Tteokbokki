package com.yubdduk.mbti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class WillNotCook_ResultActivity extends Activity {
    public static String foods[][]={{"촉촉한 크로플이","달짝지근한 호르몬동이","짭짤한 갈비천왕 치킨이","새콤한 칠리새우가"},
            {"간편한 샌드위치가","치즈가 고소한 피자가","수버거제가","토마토 리조또가"},
            {"떡꼬치가","마라수치가 낮네요!! 마라탕이","땀날만큼 매운 족발이", "쫄깃한 떡볶이가"},
            {"맥 앤 치즈가","크림가득 까르보나라가","바삭한 튀김이 가득한 텐동이","마늘향 가득 알리오올리오가"}};


    public static Integer photos[][]={{R.drawable.croffle, R.drawable.daechang_rice, R.drawable.galbiking, R.drawable.chili_shrimp},
        {R.drawable.sandwich,R.drawable.pizza, R.drawable.hamburger, R.drawable.tomato_risotto},
        {R.drawable.tteok_stick, R.drawable.maratang, R.drawable.hot_porkfeet, R.drawable.tteokbokki},
        {R.drawable.mack_cheese, R.drawable.carbonara, R.drawable.tendon, R.drawable.aglio}};

    public static int random_number=0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_willnotcook);

        Intent getIntent=getIntent();
        int flavor=getIntent.getIntExtra("flavor",0);
        int hungry=getIntent.getIntExtra("hungry",0);
        int yesterday=getIntent.getIntExtra("yesterday",0);

        ImageView foodImage=(ImageView)findViewById(R.id.food_image);
        TextView foodTitle=(TextView)findViewById(R.id.food_title);
        //TextView foodDescription=(TextView)findViewById(R.id.food_description);

        Button homebtn=(Button)findViewById(R.id.gohome);
        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WillNotCook_ResultActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        if(hungry==1){
            if(flavor==1) {
                foodTitle.setText(foods[0][0]);
                foodImage.setImageResource(photos[0][0]);
            }
            else if(flavor==2) {
                foodTitle.setText(foods[1][0]);
                foodImage.setImageResource(photos[1][0]);
            }
            else if(flavor==3) {
                foodTitle.setText(foods[2][0]);
                foodImage.setImageResource(photos[2][0]);
            }
            else if(flavor==4) {
                foodTitle.setText(foods[3][0]);
                foodImage.setImageResource(photos[3][0]);
            }
        }
        else if(hungry==2){
            if(flavor==1){
                if(yesterday==1){
                    foodTitle.setText(foods[0][1]);
                    foodImage.setImageResource(photos[0][1]);
                }
                else if(yesterday==2){
                    foodTitle.setText(foods[0][2]);
                    foodImage.setImageResource(photos[0][2]);
                }
                else if(yesterday==3){
                    foodTitle.setText(foods[0][3]);
                    foodImage.setImageResource(photos[0][3]);
                }
                else if(yesterday==4){
                    random_number=(int)(Math.random()*3)+1;
                    foodTitle.setText(foods[0][random_number]);
                    foodImage.setImageResource(photos[0][random_number]);
                }
            }
            else if(flavor==2){
                if(yesterday==1){
                    foodTitle.setText(foods[1][1]);
                    foodImage.setImageResource(photos[1][1]);
                }
                else if(yesterday==2){
                    foodTitle.setText(foods[1][2]);
                    foodImage.setImageResource(photos[1][2]);
                }
                else if(yesterday==3){
                    foodTitle.setText(foods[1][3]);
                    foodImage.setImageResource(photos[1][3]);
                }
                else if(yesterday==4){
                    random_number=(int)(Math.random()*3)+1;
                    foodTitle.setText(foods[1][random_number]);
                    foodImage.setImageResource(photos[1][random_number]);
                }
            }
            else if(flavor==3) {
                if(yesterday==1){
                    foodTitle.setText(foods[2][1]);
                    foodImage.setImageResource(photos[2][1]);
                }
                else if(yesterday==2){
                    foodTitle.setText(foods[2][2]);
                    foodImage.setImageResource(photos[2][2]);
                }
                else if(yesterday==3){
                    foodTitle.setText(foods[2][3]);
                    foodImage.setImageResource(photos[2][3]);
                }
                else if(yesterday==4) {
                    random_number=(int)(Math.random()*3)+1;
                    foodTitle.setText(foods[2][random_number]);
                    foodImage.setImageResource(photos[2][random_number]);
                }
            }
            else if(flavor==4){
                if(yesterday==1){
                    foodTitle.setText(foods[3][1]);
                    foodImage.setImageResource(photos[3][1]);
                }
                else if(yesterday==2){
                    foodTitle.setText(foods[3][2]);
                    foodImage.setImageResource(photos[3][2]);
                }
                else if(yesterday==3){
                    foodTitle.setText(foods[3][3]);
                    foodImage.setImageResource(photos[3][3]);
                }
                else if(yesterday==4){
                    random_number=(int)(Math.random()*3)+1;
                    foodTitle.setText(foods[3][random_number]);
                    foodImage.setImageResource(photos[3][random_number]);
                }
            }
        }
    }
}
