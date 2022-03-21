package com.example.tenantfinder_new;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class OwnerActivity extends AppCompatActivity {
Button addnewproperty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner);
        addnewproperty=(Button) findViewById(R.id.addnewproperty);
        addnewproperty.setOnClickListener((view)->
        {
            Intent addproperty=new Intent(OwnerActivity.this,AddNewPropertyActivity.class);
            startActivity(addproperty);
        });
    }
}
