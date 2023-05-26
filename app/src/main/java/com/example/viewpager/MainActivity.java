package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    ArrayList<Integer> arrayList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=findViewById(R.id.viewPager);
        arrayList.add(R.drawable.viewone);
        arrayList.add(R.drawable.viewtwo);
        arrayList.add(R.drawable.viewthree);
        arrayList.add(R.drawable.viewfour);
        arrayList.add(R.drawable.viewfive);


        Adapter adapter=new Adapter(MainActivity.this,arrayList);
        viewPager.setAdapter(adapter);







    }
}