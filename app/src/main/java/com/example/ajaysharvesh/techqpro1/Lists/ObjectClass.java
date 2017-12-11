package com.example.ajaysharvesh.techqpro1.Lists;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.ajaysharvesh.techqpro1.R;

/**
 * Created by ajays on 12/9/2017.
 */

public class ObjectClass extends AppCompatActivity {

    public ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9,
            imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17, imageView18, imageView19,
            imageView20, imageView21, imageView22, imageView23, imageView24;

    public Button nxt2, pre2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_class);

        getSupportActionBar().setTitle("Objects and Class");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pre2 = (Button) findViewById(R.id.btn_pre2);
        nxt2 = (Button) findViewById(R.id.btn_nxt2);

        imageView = (ImageView) findViewById(R.id.co1);
        imageView1 = (ImageView) findViewById(R.id.co2);
        imageView2 = (ImageView) findViewById(R.id.co3);
        imageView3 = (ImageView) findViewById(R.id.co4);
        imageView4 = (ImageView) findViewById(R.id.co5);
        imageView5 = (ImageView) findViewById(R.id.co6);
        imageView6 = (ImageView) findViewById(R.id.co7);
        imageView7 = (ImageView) findViewById(R.id.co8);
        imageView8 = (ImageView) findViewById(R.id.co9);
        imageView9 = (ImageView) findViewById(R.id.co10);
        imageView10 = (ImageView) findViewById(R.id.co11);
        imageView11 = (ImageView) findViewById(R.id.co12);
        imageView12 = (ImageView) findViewById(R.id.co13);
        imageView13 = (ImageView) findViewById(R.id.co14);
        imageView14 = (ImageView) findViewById(R.id.co15);
        imageView15 = (ImageView) findViewById(R.id.co16);
        imageView16 = (ImageView) findViewById(R.id.co17);
        imageView17 = (ImageView) findViewById(R.id.co18);
        imageView18 = (ImageView) findViewById(R.id.co19);
        imageView19 = (ImageView) findViewById(R.id.co20);
        imageView20 = (ImageView) findViewById(R.id.co21);
        imageView21 = (ImageView) findViewById(R.id.co22);
        imageView22 = (ImageView) findViewById(R.id.co23);
        imageView23 = (ImageView) findViewById(R.id.co24);
        imageView24 = (ImageView) findViewById(R.id.co25);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco1.PNG?alt=media&token=3899abc8-6237-4f26-9581-ad3607c2a0b5";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco2.PNG?alt=media&token=64a111ac-336b-4238-a906-ca4e23805974";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco3.PNG?alt=media&token=a1c1bf0c-f83d-493b-8fab-322dc2abc20b";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco4.PNG?alt=media&token=db4f8de5-e8da-44d7-b90a-40fdb1df9024";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco5.PNG?alt=media&token=a5db1da7-10c9-419c-9cce-437683cd08fa";
        String url6 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco6.PNG?alt=media&token=2a6d39bd-2cab-4765-817b-aa38e79cf6de";
        String url7 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco7.PNG?alt=media&token=8729c8f6-2208-4822-8f98-b0959b50ee79";
        String url8 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco8.PNG?alt=media&token=5772c7f6-f091-4667-86ac-8d2ab2c511f9";
        String url9 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco9.PNG?alt=media&token=d0a98744-9d43-4037-a5c5-f4a05ce7cd5c";
        String url10 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco10.PNG?alt=media&token=303dd71b-7cba-4a10-a8a2-f3b0f3fd40a7";
        String url11 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fc11.PNG?alt=media&token=0ed78f80-18f1-4ca6-9b68-618a6e25fa94";
        String url12 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fc12.PNG?alt=media&token=4690d491-d540-45f3-a5d7-dbd792ea4e9d";
        String url13 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco13.PNG?alt=media&token=8a5b09bc-036a-41da-a195-8b4d4ccc6523";
        String url14 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco14.PNG?alt=media&token=7b0420b2-dd01-4b9c-898d-908f237859b7";
        String url15 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco15.PNG?alt=media&token=01d46382-cf87-4576-8e27-8fa4232b0037";
        String url16 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco16.PNG?alt=media&token=aeef9ccd-fbe7-49d3-8383-ca153f606619";
        String url17 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco17.PNG?alt=media&token=499bf5d9-7c2d-4fc5-a583-7e6181799f8b";
        String url18 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco18.PNG?alt=media&token=1a684bef-6f01-41b2-97cf-fad912bd5a73";
        String url19 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco19.PNG?alt=media&token=ca14f1b1-ab61-40d8-967e-1372dd99e06d";
        String url20 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco20.PNG?alt=media&token=79dcfdb5-422c-423f-b0d3-0769eb941966";
        String url21 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco21.PNG?alt=media&token=01cb0ea5-6200-4e0e-b0f4-91df21a1c399";
        String url22 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco22.PNG?alt=media&token=10924636-0a19-4813-88c1-c4d92bdef921";
        String url23 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco23.PNG?alt=media&token=0e2b7902-531c-4b1c-9a08-7561f1e69e3a";
        String url24 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco24.PNG?alt=media&token=cc80a6c2-19cb-41a0-a7da-fcc5e01249ad";
        String url25 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/classes%20and%20objects%2Fco25.PNG?alt=media&token=d5133ab4-9f64-4a81-8e11-0193aac1d25a";


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
        Glide.with(getApplicationContext()).load(url20).into(imageView19);
        Glide.with(getApplicationContext()).load(url21).into(imageView20);
        Glide.with(getApplicationContext()).load(url22).into(imageView21);
        Glide.with(getApplicationContext()).load(url23).into(imageView22);
        Glide.with(getApplicationContext()).load(url24).into(imageView23);
        Glide.with(getApplicationContext()).load(url25).into(imageView24);

        nxt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ObjectClass.this, DataTypes.class) ;
                startActivity(i);
            }
        });

        pre2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(ObjectClass.this, BasicSyntax.class) ;
                startActivity(j);
            }
        });
    }
}
