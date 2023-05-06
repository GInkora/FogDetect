package com.example.fogdetect;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    private AppCompatSpinner mSpinner;
    private ArrayAdapter<String> mSpAdapter;
    private String[] mCities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void initView() {
        mSpinner = findViewById(R.id.sp_city);
        mCities = getResources().getStringArray(R.array.cities);
        mSpAdapter = new ArrayAdapter<>(this,R.layout.sp_item_layout2,mCities);
        mSpinner.setAdapter(mSpAdapter);
        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}