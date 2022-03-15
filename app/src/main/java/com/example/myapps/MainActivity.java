package com.example.myapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilanutama);
    }

    public void clickRS(View view) {
        //gambar RS di click
        Intent i = new Intent(this,RS.class);
        startActivity(i);
    }
    public void clickPOL(View view) {
    //gambar RS di click
        Intent i = new Intent(this,POL.class);
        startActivity(i);
    }
    public void clickSEKOLAH(View view) {
        //gambar RS di click
        Intent i = new Intent(this, SEKOLAH.class);
        startActivity(i);
    }
    public void clickSM(View view) {
        //gambar RS di click
        Intent i = new Intent(this, SM.class);
        startActivity(i);
    }
}