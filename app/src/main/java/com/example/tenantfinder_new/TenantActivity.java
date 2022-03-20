package com.example.tenantfinder_new;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TenantActivity extends AppCompatActivity {
    Spinner spinner,spinner2;
    TextView viewall;
    List<List<String>> properties;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenantrecycler);
        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvtenantproperties);
        properties=PropertiesDataActivity.method();

        TenantpropertieshomeActivity adapterobj=new TenantpropertieshomeActivity(properties);
        rvContacts.setAdapter(adapterobj);
        rvContacts.setLayoutManager(new LinearLayoutManager(this));

   spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter2);


     spinner2 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.planets_array, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter3);

        viewall =(TextView) findViewById(R.id.viewall);
        viewall.setOnClickListener((view)->{
                    Intent viewallintent=new Intent(TenantActivity.this,TenantpropertiesMainActivity.class);
                    startActivity(viewallintent);
                }
                );


    }
}
