package com.example.tenantfinder_new;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TenantpropertiesMainActivity extends AppCompatActivity {
    List<List<String>> properties;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_recycler);
        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvproperties);
properties=PropertiesDataActivity.method();
        TenantpropertiesActivity adapter=new TenantpropertiesActivity(properties);
        rvContacts.setAdapter(adapter);
        rvContacts.setLayoutManager(new LinearLayoutManager(this));
    }
}
