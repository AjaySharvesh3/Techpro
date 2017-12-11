package com.example.ajaysharvesh.techqpro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class RegularExpression extends AppCompatActivity {

    public ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8,
    imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17;
    public Button nxt12, pre12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular_expression);

        getSupportActionBar().setTitle("Regular Expression");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pre12 = (Button) findViewById(R.id.btn_pre12);
        nxt12 = (Button) findViewById(R.id.btn_nxt12);

        imageView = (ImageView) findViewById(R.id.re1);
        imageView1 = (ImageView) findViewById(R.id.re2);
        imageView2 = (ImageView) findViewById(R.id.re3);
        imageView3 = (ImageView) findViewById(R.id.re4);
        imageView4 = (ImageView) findViewById(R.id.re5);
        imageView5 = (ImageView) findViewById(R.id.re6);
        imageView6 = (ImageView) findViewById(R.id.re7);
        imageView7 = (ImageView) findViewById(R.id.re8);
        imageView8 = (ImageView) findViewById(R.id.re9);
        imageView9 = (ImageView) findViewById(R.id.re10);
        imageView10 = (ImageView) findViewById(R.id.re11);
        imageView11 = (ImageView) findViewById(R.id.re12);
        imageView12 = (ImageView) findViewById(R.id.re13);
        imageView13 = (ImageView) findViewById(R.id.re14);
        imageView14 = (ImageView) findViewById(R.id.re15);
        imageView15 = (ImageView) findViewById(R.id.re16);
        imageView16 = (ImageView) findViewById(R.id.re17);
        imageView17 = (ImageView) findViewById(R.id.re18);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Reg.%20Experssion%2Fre1.PNG?alt=media&token=05931074-907d-4126-868d-9ecd7cf4a29d";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Reg.%20Experssion%2Fre2.PNG?alt=media&token=dbe62c37-9784-45b6-bad7-8e3a799ae4c6";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Reg.%20Experssion%2Fre3.PNG?alt=media&token=8985724d-6765-4cf5-9c27-e8d4cb2a6d14";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Reg.%20Experssion%2Fre4.PNG?alt=media&token=baa8301f-44db-4cb0-9c7b-086a3a64bbb0";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Reg.%20Experssion%2Fre5.PNG?alt=media&token=2f12ad28-7f0f-4eb1-b0c2-aec38ff26e3c";
        String url6 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Reg.%20Experssion%2Fre6.PNG?alt=media&token=08020b2c-b1ad-4565-9715-38406d6e3788";
        String url7 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Reg.%20Experssion%2Fre7.PNG?alt=media&token=39f9f4e1-dc3d-484e-880a-b145a8b09a7d";
        String url8 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Reg.%20Experssion%2Fre8.PNG?alt=media&token=0a3567a4-4eda-4bf8-9525-d35b400b1609";
        String url9 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Reg.%20Experssion%2Fre9.PNG?alt=media&token=3ee4f74c-b23e-42f6-9a77-9b8721f5ddf1";
        String url10 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Reg.%20Experssion%2Fre10.PNG?alt=media&token=9e60500f-29c9-4f26-882d-4ac5b7f9fc1a";
        String url11 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Reg.%20Experssion%2Fre11.PNG?alt=media&token=d9f50382-5788-4e64-b3b5-0b6374dcfbe5";
        String url12 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Reg.%20Experssion%2Fre12.PNG?alt=media&token=dd196b95-0548-41ec-bd73-6db6a8159654";
        String url13 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Reg.%20Experssion%2Fre13.PNG?alt=media&token=f3ba01bf-4441-4499-9dc0-127bb9d0c1e3";
        String url14 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Reg.%20Experssion%2Fre14.PNG?alt=media&token=87529d4a-a299-475d-984a-01b7d77e8a45";
        String url15 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Reg.%20Experssion%2Fre15.PNG?alt=media&token=a0148ab4-5624-49da-9593-4625950a3216";
        String url16 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Reg.%20Experssion%2Fre16.PNG?alt=media&token=7c4da3c8-0b7d-47d8-9a92-899c6283bedb";
        String url17 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Reg.%20Experssion%2Fre17.PNG?alt=media&token=1b6491b3-982c-403e-af52-c8180582abfd";
        String url18 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Reg.%20Experssion%2Fre18.PNG?alt=media&token=faf0edba-6497-4023-8b81-d78bb353babc";

        Glide.with(getApplicationContext()).load(url1).into(imageView);
        Glide.with(getApplicationContext()).load(url2).into(imageView1);
        Glide.with(getApplicationContext()).load(url3).into(imageView2);
        Glide.with(getApplicationContext()).load(url4).into(imageView3);
        Glide.with(getApplicationContext()).load(url5).into(imageView4);
        Glide.with(getApplicationContext()).load(url6).into(imageView5);
        Glide.with(getApplicationContext()).load(url7).into(imageView6);
        Glide.with(getApplicationContext()).load(url8).into(imageView7);
        Glide.with(getApplicationContext()).load(url9).into(imageView8);
        Glide.with(getApplicationContext()).load(url10).into(imageView9);
        Glide.with(getApplicationContext()).load(url11).into(imageView10);
        Glide.with(getApplicationContext()).load(url12).into(imageView11);
        Glide.with(getApplicationContext()).load(url13).into(imageView12);
        Glide.with(getApplicationContext()).load(url14).into(imageView13);
        Glide.with(getApplicationContext()).load(url15).into(imageView14);
        Glide.with(getApplicationContext()).load(url16).into(imageView15);
        Glide.with(getApplicationContext()).load(url17).into(imageView16);
        Glide.with(getApplicationContext()).load(url18).into(imageView17);

        /**nxt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegularExpression.this, Methods.class) ;
                startActivity(i);
            }
        });*/

        pre12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(RegularExpression.this, DateAndTime.class) ;
                startActivity(j);
            }
        });
    }
}
