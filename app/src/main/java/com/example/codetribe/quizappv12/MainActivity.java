package com.example.codetribe.quizappv12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button java;
    Button android;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        java = (Button)findViewById(R.id.cat1);
        android = (Button)findViewById(R.id.cat2);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this, Java.class);
                startActivity(j);

            }
        });

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, Android.class);
                startActivity(a);
            }
        });
    }
}
