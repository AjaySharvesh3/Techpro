package com.example.ajaysharvesh.techqpro1.Functions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ajaysharvesh.techqpro1.Functions.CustomAdapter;
import com.example.ajaysharvesh.techqpro1.R;

public class TopicList extends AppCompatActivity {

    int position = 0;

    public Button btnnxt;
    public Button btnpre;
    //public ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_list);

        Intent intent = getIntent();
        position = intent.getExtras().getInt("Position");


        final CustomAdapter adapter = new CustomAdapter(this);
        final TextView t1 = (TextView) findViewById(R.id.head);
        final TextView t2 = (TextView) findViewById(R.id.subhead);
       // final ImageView iv = (ImageView) findViewById(R.id.image10);

        //set data

        t1.setText(adapter.topics[position]);
        t2.setText(adapter.languages[position]);
        //iv.setImageResource(adapter.);

       //btnnxt = (Button) findViewById(R.id.btn_nxt);
      //btnpre = (Button) findViewById(R.id.btn_pre);

        /** btnnxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int pos = position + 1;

                t1.setText(adapter.topics[position]);
                t2.setText(adapter.languages[position]);

                if(!(pos >= adapter.getCount() - 1)) {

                    pos = + 1 ;

                } else {

                    pos = - 1 ;

                }

            }
        });

        btnpre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int pos = position - 1;

                t1.setText(adapter.topics[position]);
                t2.setText(adapter.languages[position]);

                if(!(pos <= adapter.getCount() + 1)) {

                    pos = - 1;

                } else {

                    pos = + 1;

                }

            }
        });  */

    }
}
