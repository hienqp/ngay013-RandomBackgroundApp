package com.hienqp.randombackgroundapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    LinearLayout background;
    ArrayList<Integer> imageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background = (LinearLayout) findViewById(R.id.manhinh);
        imageList = new ArrayList<>();
        imageList.add(R.drawable.background1);
        imageList.add(R.drawable.background2);
        imageList.add(R.drawable.background3);
        imageList.add(R.drawable.background4);
        imageList.add(R.drawable.background5);
        imageList.add(R.drawable.background6);
        imageList.add(R.drawable.background7);

        Random random = new Random();
        int index = random.nextInt(imageList.size());

        background.setBackgroundResource(imageList.get(index));
    }
}