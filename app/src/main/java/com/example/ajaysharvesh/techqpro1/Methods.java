package com.example.ajaysharvesh.techqpro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Methods extends AppCompatActivity {

    public ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8,
            imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17, imageView18,
    imageView19, imageView20, imageView21, imageView22, imageView23;
    public Button nxt13, pre13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_methods);

        getSupportActionBar().setTitle("Methods and Functions");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pre13 = (Button) findViewById(R.id.btn_pre13);
        nxt13 = (Button) findViewById(R.id.btn_nxt13);

        imageView = (ImageView) findViewById(R.id.mf1);
        imageView1 = (ImageView) findViewById(R.id.mf2);
        imageView2 = (ImageView) findViewById(R.id.mf3);
        imageView3 = (ImageView) findViewById(R.id.mf4);
        imageView4 = (ImageView) findViewById(R.id.mf5);
        imageView5 = (ImageView) findViewById(R.id.mf6);
        imageView6 = (ImageView) findViewById(R.id.mf7);
        imageView7 = (ImageView) findViewById(R.id.mf8);
        imageView8 = (ImageView) findViewById(R.id.mf9);
        imageView9 = (ImageView) findViewById(R.id.mf10);
        imageView10 = (ImageView) findViewById(R.id.mf11);
        imageView11 = (ImageView) findViewById(R.id.mf12);
        imageView12 = (ImageView) findViewById(R.id.mf13);
        imageView13 = (ImageView) findViewById(R.id.mf14);
        imageView14 = (ImageView) findViewById(R.id.mf15);
        imageView15 = (ImageView) findViewById(R.id.mf16);
        imageView16 = (ImageView) findViewById(R.id.mf17);
        imageView17 = (ImageView) findViewById(R.id.mf18);
        imageView18 = (ImageView) findViewById(R.id.mf19);
        imageView19 = (ImageView) findViewById(R.id.mf20);
        imageView20 = (ImageView) findViewById(R.id.mf21);
        imageView21 = (ImageView) findViewById(R.id.mf22);
        imageView22 = (ImageView) findViewById(R.id.mf23);
        imageView23 = (ImageView) findViewById(R.id.mf24);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf1.PNG?alt=media&token=94ed65eb-5027-4414-9783-9fda1a5ac85a";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf2.PNG?alt=media&token=a6e65573-62ff-40c0-bc4e-2054a2c5479b";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf3.PNG?alt=media&token=72420369-ffc4-4085-a6ee-fb5af68df15f";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf4.PNG?alt=media&token=fbff86d2-4f4a-432e-a919-5b1e4b122ed1";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf5.PNG?alt=media&token=276f83d2-aa35-4b3b-9b1f-45d6b38d5f90";
        String url6 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf6.PNG?alt=media&token=aa28ece3-5a27-465d-a8c2-26a01265acff";
        String url7 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf7.PNG?alt=media&token=5195f90c-cab0-4bf1-ae5f-c89110ebb63b";
        String url8 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf8.PNG?alt=media&token=bac540f4-6737-412a-b565-947214a2eed1";
        String url9 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf9.PNG?alt=media&token=378b2ed5-6d41-4e08-97ab-52560d9e9d64";
        String url10 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf10.PNG?alt=media&token=f0f479af-c9fe-487f-8e30-8e52ffdd7267";
        String url11 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf11.PNG?alt=media&token=a5a3afb0-e4c6-400a-bf77-83a24a844002";
        String url12 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf12.PNG?alt=media&token=13cffb53-ad5c-4b6a-9fe9-1c9e6096c3b4";
        String url13 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf13.PNG?alt=media&token=b332198e-e63a-4185-90c1-f3ef508c38a7";
        String url14 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf14.PNG?alt=media&token=5f555b03-3dda-4fa5-8cf2-90b2439a8995";
        String url15 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf15.PNG?alt=media&token=efb0a1b9-8d95-4f15-8d02-1ba8002d3644";
        String url16 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf16.PNG?alt=media&token=6ad55c0e-c1d4-4c4d-b172-520c8b1ea1b3";
        String url17 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf17.PNG?alt=media&token=b5db4763-851a-48bf-a805-3c1692d5d68c";
        String url18 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf18.PNG?alt=media&token=65660e21-1c5f-4425-b6cb-406aa86e74c2";
        String url19 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf19.PNG?alt=media&token=1a2b6add-d619-4ab6-9135-d201b632b6c6";
        String url20 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf20.PNG?alt=media&token=6f041c57-b634-44a1-bd26-69c2182c453b";
        String url21 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf21.PNG?alt=media&token=453016bc-cdd5-47ca-8bbf-f47c436d4ab9";
        String url22 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf22.PNG?alt=media&token=68b673d7-e99a-46ef-bde6-e7a239da0580";
        String url23 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf23.PNG?alt=media&token=bce8fdab-1ac4-43e9-98f2-55bdb01ebfaf";
        String url24 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Methods%2Fmf24.PNG?alt=media&token=64e02360-a80f-4434-8cb3-a40e49645edd";

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

        nxt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Methods.this, FilesIo.class) ;
                startActivity(i);
            }
        });

        pre13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(Methods.this, RegularExpression.class) ;
                startActivity(j);
            }
        });
    }
}
