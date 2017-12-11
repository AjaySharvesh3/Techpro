package com.example.ajaysharvesh.techqpro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.ajaysharvesh.techqpro1.Lists.BasicSyntax;
import com.example.ajaysharvesh.techqpro1.Lists.DataTypes;
import com.example.ajaysharvesh.techqpro1.Lists.ObjectClass;

public class BasicOperators extends AppCompatActivity {

    public ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9,
            imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17, imageView18;

    public Button nxt5, pre5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_operators);

        getSupportActionBar().setTitle("Basic Operators");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pre5 = (Button) findViewById(R.id.btn_pre5);
        nxt5 = (Button) findViewById(R.id.btn_nxt5);

        imageView = (ImageView) findViewById(R.id.bo1);
        imageView1 = (ImageView) findViewById(R.id.bo2);
        imageView2 = (ImageView) findViewById(R.id.bo3);
        imageView3 = (ImageView) findViewById(R.id.bo4);
        imageView4 = (ImageView) findViewById(R.id.bo5);
        imageView5 = (ImageView) findViewById(R.id.bo6);
        imageView6 = (ImageView) findViewById(R.id.bo7);
        imageView7 = (ImageView) findViewById(R.id.bo8);
        imageView8 = (ImageView) findViewById(R.id.bo9);
        imageView9 = (ImageView) findViewById(R.id.bo10);
        imageView10 = (ImageView) findViewById(R.id.bo11);
        imageView11 = (ImageView) findViewById(R.id.bo12);
        imageView12 = (ImageView) findViewById(R.id.bo13);
        imageView13 = (ImageView) findViewById(R.id.bo14);
        imageView14 = (ImageView) findViewById(R.id.bo15);
        imageView15 = (ImageView) findViewById(R.id.bo16);
        imageView16 = (ImageView) findViewById(R.id.bo17);
        imageView17 = (ImageView) findViewById(R.id.bo18);
        imageView18 = (ImageView) findViewById(R.id.bo19);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Operators%2Fbo1.PNG?alt=media&token=ca8f591f-f4e2-4510-8612-099b1981a116";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Operators%2Fbo2.PNG?alt=media&token=ebf8839a-7516-475f-8e0a-fb4f7dc6ea58";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Operators%2Fbo3.PNG?alt=media&token=2fdd0eee-426f-4116-84e7-f80dedf279d7";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Operators%2Fbo4.PNG?alt=media&token=5bf7232a-f676-46d9-a0c8-9c0e8876577a";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Operators%2Fbo5.PNG?alt=media&token=145575a9-d0a5-46c6-b51f-70973af62b6e";
        String url6 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Operators%2Fbo6.PNG?alt=media&token=ba371d5c-1bea-41fc-877b-fe85d3a3ac02";
        String url7 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Operators%2Fbo7.PNG?alt=media&token=2276f4eb-d072-4203-813e-f0de11659248";
        String url8 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Operators%2Fbo8.PNG?alt=media&token=6e451d30-e499-4371-84f4-316c4f93c521";
        String url9 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Operators%2Fbo9.PNG?alt=media&token=dd324274-572b-4f27-9d15-1e489dd71508";
        String url10 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Operators%2Fbo10.PNG?alt=media&token=62699f95-a06e-40f7-b22e-68121c261fc9";
        String url11 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Operators%2Fbo11.PNG?alt=media&token=0197d8e5-adbf-408c-b0b4-d152f393b191";
        String url12 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Operators%2Fbo12.PNG?alt=media&token=0dcf5b09-c5ab-48a9-bb50-11973d2c48f7";
        String url13 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Operators%2Fbo13.PNG?alt=media&token=b91dfad8-34b0-4f59-97c7-40c0da90037b";
        String url14 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Operators%2Fbo14.PNG?alt=media&token=8fd0544b-8f23-4558-b0b5-8b36ec188f11";
        String url15 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Operators%2Fbo15.PNG?alt=media&token=fa9b5d48-b46e-4323-b4d0-4d66e3bbdf3e";
        String url16 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Operators%2Fbo16.PNG?alt=media&token=184eff79-4c47-4188-bfb3-4fa626ca0b7d";
        String url17 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Operators%2Fbo17.PNG?alt=media&token=8576abff-82fa-4d7e-ad68-d4b357949228";
        String url18 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Operators%2Fbo18.PNG?alt=media&token=a8bd07e0-b82c-4123-80a2-9867d7ac724e";
        String url19 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Basic%20Operators%2Fbo19.PNG?alt=media&token=18f1f239-3e70-4180-ac58-121d2bce535d";

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
        Glide.with(getApplicationContext()).load(url19).into(imageView18);

        nxt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BasicOperators.this, LoopControls.class) ;
                startActivity(i);
            }
        });

        pre5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(BasicOperators.this, VariableTypes.class) ;
                startActivity(j);
            }
        });

    }
}
