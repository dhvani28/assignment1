package com.example.eatcakegame;

import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Random;

public class SetsGridAdapter extends BaseAdapter {

    private int setList;




    public SetsGridAdapter(int setList) {
        this.setList = setList;
    }

    public SetsGridAdapter() {
    }

    @Override
    public int getCount() {
        return setList;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;

        if (convertView == null)
        {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_sets_layout,parent,false);
        }
        else
        {
            view = convertView;
        }

       // ((ImageView) view.findViewById(R.id.imageView)).setb;
        //Random rnd = new Random();
        //int color = Color.argb(255, rnd.nextInt(255),rnd.nextInt(255),rnd.nextInt(255));
        //view.setBackgroundColor(color);


        return view;
    }
}