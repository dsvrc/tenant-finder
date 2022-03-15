package com.example.tenantfinder_new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView newuser2 = (TextView) findViewById(R.id.newuser);
        newuser2.setOnClickListener((view) ->
        {
            Intent registerintent=new Intent(MainActivity.this,RegisterActivity.class);
            startActivity(registerintent);
        });
    }
}