package com.example.ajaysharvesh.techqpro1.Functions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ajaysharvesh.techqpro1.ArraysLists;
import com.example.ajaysharvesh.techqpro1.BasicOperators;
import com.example.ajaysharvesh.techqpro1.DateAndTime;
import com.example.ajaysharvesh.techqpro1.DecisionMaking;
import com.example.ajaysharvesh.techqpro1.Lists.BasicSyntax;
import com.example.ajaysharvesh.techqpro1.Lists.DataTypes;
import com.example.ajaysharvesh.techqpro1.Lists.ObjectClass;
import com.example.ajaysharvesh.techqpro1.LoopControls;
import com.example.ajaysharvesh.techqpro1.Numbers;
import com.example.ajaysharvesh.techqpro1.R;
import com.example.ajaysharvesh.techqpro1.RegularExpression;
import com.example.ajaysharvesh.techqpro1.Strings;
import com.example.ajaysharvesh.techqpro1.VariableTypes;

public class Topics extends AppCompatActivity {

    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);

        getSupportActionBar().setTitle("Topics");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listview = (ListView) findViewById(R.id.listview);
        CustomAdapter adapter = new CustomAdapter(this);

        listview.setAdapter(adapter);

         listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                /**Intent intent = new Intent(getApplicationContext(), TopicList.class);
                intent.putExtra("Position", position);

                startActivity(intent); */

                if (position == 0) {
                    Intent i = new Intent(view.getContext(), BasicSyntax.class);
                    startActivityForResult(i, 0);
                } if (position == 1) {
                    Intent i = new Intent(view.getContext(), ObjectClass.class);
                    startActivityForResult(i, 1);
                } if (position == 2) {
                    Intent i = new Intent(view.getContext(), DataTypes.class);
                    startActivityForResult(i, 2);
                } if (position == 3) {
                    Intent i = new Intent(view.getContext(), VariableTypes.class);
                    startActivityForResult(i, 3);
                } if (position == 4) {
                    Intent i = new Intent(view.getContext(), BasicOperators.class);
                    startActivityForResult(i, 4);
                } if (position == 5) {
                    Intent i = new Intent(view.getContext(), LoopControls.class);
                    startActivityForResult(i, 5);
                } if (position == 6) {
                    Intent i = new Intent(view.getContext(), DecisionMaking.class);
                    startActivityForResult(i, 6);
                } if (position == 7) {
                    Intent i = new Intent(view.getContext(), Numbers.class);
                    startActivityForResult(i, 7);
                } if (position == 8) {
                    Intent i = new Intent(view.getContext(), Strings.class);
                    startActivityForResult(i, 8);
                }  if (position == 9) {
                    Intent i = new Intent(view.getContext(), ArraysLists.class);
                    startActivityForResult(i, 9);
                } if(position == 10 ) {
                    Intent i = new Intent(view.getContext(), DateAndTime.class);
                    startActivityForResult(i, 10);
                } if(position == 11 ) {
                    Intent i = new Intent(view.getContext(), RegularExpression.class);
                    startActivityForResult(i, 11);
                }

            }
            
        });

    }
}
