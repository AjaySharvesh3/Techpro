package com.example.ajaysharvesh.techqpro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.nio.file.Files;

public class FilesIo extends AppCompatActivity {

    public ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8,
            imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17, imageView18,
            imageView19, imageView20, imageView21, imageView22, imageView23;
    public Button nxt14, pre14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_files_io);

        getSupportActionBar().setTitle("Files and IO");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pre14 = (Button) findViewById(R.id.btn_pre14);
        nxt14 = (Button) findViewById(R.id.btn_nxt14);

        imageView = (ImageView) findViewById(R.id.f1);
        imageView1 = (ImageView) findViewById(R.id.f2);
        imageView2 = (ImageView) findViewById(R.id.f3);
        imageView3 = (ImageView) findViewById(R.id.f4);
        imageView4 = (ImageView) findViewById(R.id.f5);
        imageView5 = (ImageView) findViewById(R.id.f6);
        imageView6 = (ImageView) findViewById(R.id.f7);
        imageView7 = (ImageView) findViewById(R.id.f8);
        imageView8 = (ImageView) findViewById(R.id.f9);
        imageView9 = (ImageView) findViewById(R.id.f10);
        imageView10 = (ImageView) findViewById(R.id.f11);
        imageView11 = (ImageView) findViewById(R.id.f12);
        imageView12 = (ImageView) findViewById(R.id.f13);
        imageView13 = (ImageView) findViewById(R.id.f14);
        imageView14 = (ImageView) findViewById(R.id.f15);
        imageView15 = (ImageView) findViewById(R.id.f16);
        imageView16 = (ImageView) findViewById(R.id.f17);
        imageView17 = (ImageView) findViewById(R.id.f18);
        imageView18 = (ImageView) findViewById(R.id.f19);
        imageView19 = (ImageView) findViewById(R.id.f20);
        imageView20 = (ImageView) findViewById(R.id.f21);
        imageView21 = (ImageView) findViewById(R.id.f22);
        imageView22 = (ImageView) findViewById(R.id.f23);
        imageView23 = (ImageView) findViewById(R.id.f24);

        String url1 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff1.PNG?alt=media&token=25a504d4-26f6-4f5c-b384-92d9b60538b1";
        String url2 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff2.PNG?alt=media&token=481d357e-4c02-4a10-a498-2dd2563fabce";
        String url3 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff3.PNG?alt=media&token=a0e85e6d-017c-404e-a170-e547d9c522fa";
        String url4 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff4.PNG?alt=media&token=77cfa06e-08e0-4205-b954-59b1928e6d38";
        String url5 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff5.PNG?alt=media&token=446d5f5a-1469-429c-8209-5699b6b6a886";
        String url6 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff6.PNG?alt=media&token=dc5b6ebc-7587-41ea-b0a8-121316d71ab2";
        String url7 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff7.PNG?alt=media&token=450a7f0a-2923-443f-a637-d977a10a9685";
        String url8 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff8.PNG?alt=media&token=dbe954ef-e28f-4e5d-aeb7-4f7baa1bf0a1";
        String url9 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff9.PNG?alt=media&token=0db28e80-0b40-4d6d-bedc-362b6227fa57";
        String url10 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff10.PNG?alt=media&token=8fd56656-3fac-4e80-b704-be2d51094591";
        String url11 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff11.PNG?alt=media&token=6a49fc10-94f7-4bc7-8cff-3653a584a958";
        String url12 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff12.PNG?alt=media&token=0c069413-fe8a-4b61-ad6b-7130e37f2693";
        String url13 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff13.PNG?alt=media&token=5092886c-037f-417f-863b-14b02a09900d";
        String url14 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff14.PNG?alt=media&token=02d74ad2-f5c4-4989-bf08-b1f21d14c824";
        String url15 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff15.PNG?alt=media&token=e34d47cc-6669-4fe5-aecd-4dde5349d22f";
        String url16 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff16.PNG?alt=media&token=9a041907-e48e-49fd-b0d9-c130d5c99979";
        String url17 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff17.PNG?alt=media&token=63f22a70-a378-4cf9-9e45-ed7846413b49";
        String url18 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff18.PNG?alt=media&token=e9e8584e-d5e8-4338-8c8b-d24b11bd721c";
        String url19 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff19.PNG?alt=media&token=ab3a7090-4be0-4aed-98d3-f97e15f6697f";
        String url20 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff20.PNG?alt=media&token=1dc60972-886c-4304-9e0f-17c60478e298";
        String url21 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff21.PNG?alt=media&token=78cea976-bcc5-47c3-ac0e-6a37a414f1f7";
        String url22 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff22.PNG?alt=media&token=9b1f5126-802e-49a3-9a3c-500a29531aad";
        String url23 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff23.PNG?alt=media&token=d148f3d5-f366-4ac1-8b58-351321120d02";
        String url24 = "https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/Files%20and%20I%2Ff24.PNG?alt=media&token=b1a0270e-579f-4dda-989e-8f2536860531";

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

        nxt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FilesIo.this, ExceptionHandling.class) ;
                startActivity(i);
            }
        });

        pre14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(FilesIo.this, Methods.class) ;
                startActivity(j);
            }
        });
    }
}
