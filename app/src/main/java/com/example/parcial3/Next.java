package com.example.parcial3;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class Next extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
    }




    public void Siguente(View view) {
        Intent siguiente = new Intent(this, Menu.class);
        startActivity(siguiente);
    }
}