package com.example.packard.aplikacja;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class SensorList extends AppCompatActivity {

    SensorManager smm;
    List<Sensor> sensor;
    ListView lv;

    private boolean [] saveBool;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_list);

        smm = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        lv = (ListView) findViewById (R.id.listView1);
        sensor = smm.getSensorList(Sensor.TYPE_ALL);

        initSensorListView();
    }

    private void initSensorListView(){
        lv.setAdapter(new ArrayAdapter<Sensor>(this, android.R.layout.simple_list_item_1,  sensor));
        int count = lv.getCount();
        saveBool = new boolean[count];
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int pos, long id) {
                saveBool[pos]=!saveBool[pos];
            }
        });
    }
}
