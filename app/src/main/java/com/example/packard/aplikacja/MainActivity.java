package com.example.packard.aplikacja;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //lv.setAdapter(new ArrayAdapter<Sensor>(this, android.R.layout.simple_list_item_1,  sensor));



    }

    public void sensorsList(View view){
        Context context;
        context = getApplicationContext();
        Intent intent = new Intent(context,SensorList.class);
        startActivity(intent);
    }

    public void readFile(View view){
        
    }
}