package com.gmu.tryx1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent();
        i.putExtra("thisValue", 3);
        i.putExtra("thisValue", 7);
        startActivity(i);
    }
}