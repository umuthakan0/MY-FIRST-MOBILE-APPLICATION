package com.demirgroup.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int i=0;
    public void photochange(View view)
    {
        ImageView imageView =findViewById(R.id.imageview);
        imageView.setImageResource(R.drawable.img_1);
        i=i+1;
        if(i==2)
        {
            imageView.setImageResource(R.drawable.img);
            i=0;
        }
    }
}