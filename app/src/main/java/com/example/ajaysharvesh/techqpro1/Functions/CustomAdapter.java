package com.example.ajaysharvesh.techqpro1.Functions;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.ajaysharvesh.techqpro1.R;

/**
 * Created by ajays on 11/27/2017.
 */

public class CustomAdapter extends BaseAdapter {

    Context c;

    public String [] topics = {"Basic Syntax", "Objects and Class", "Data Types", "Variable Types", "Basic Operator", "Loop Controls",
            "Desicion Making", "Numbers", "Strings", "Arrays", "Data and Time", "Regular Expression", "Methods", "Files and I/O", "Exception Handling",
            "Inheritance", "Overriding", "Polymorphism", "Encapsulation", "Interfaces", "Packages", "Data Structures", "Collections", "Generics",
            "Serialization", "Networking", "Concept of sending e-mails", "Multithreading", "Applet Basics", "Documentations", "CGI Programming",
            "Database Access", "XML Process", "GUI Programming"};

    public String [] languages = {"Java - Python", "Java - Python", "Java", "Java - Python", "Java - Python", "Java - Python", "Java - Python",
            "Java - Python", "Java - Python", "Java - Python", "Java - Python", "Java - Python", "Java - Python", "Java - Python", "Java - Python",
            "Java", "Java", "Java", "Java", "Java", "Java", "Java", "Java", "Java", "Java", "Java - Python", "Java - Python", "Java - Python",
            "Java", "Java", "Python", "Python", "Python", "Python"};

    //public String [] url = {"https://firebasestorage.googleapis.com/v0/b/techqpro99100117.appspot.com/o/rating.png?alt=media&token=27e187eb-fbf3-463c-b44e-8cb22b86aa3a"};



    public CustomAdapter (Context ctx) {
        this.c = ctx;
    }

    @Override
    public int getCount() {
        return topics.length;
    }

    @Override
    public Object getItem(int position) {
        return topics[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {

            LayoutInflater inflater = (LayoutInflater) c.getSystemService(c.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.topics_jp, null);

        }


        //get view

        TextView t1 = (TextView) convertView.findViewById(R.id.head);
        TextView t2 = (TextView) convertView.findViewById(R.id.subhead);
        //ImageView iv = (ImageView) convertView.findViewById(R.id.image10);

        //set data

        t1.setText(topics[position]);
        t2.setText(languages[position]);

        return convertView;
    }
}
