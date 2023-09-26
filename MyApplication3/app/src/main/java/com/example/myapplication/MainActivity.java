package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @SuppressLint("SetTextI18n")
    public void handleSubmit(View V){
        Button b = ((Button)findViewById(R.id.submit));


        ((Button)findViewById(R.id.submit)).setText("Submitted");
        String name = ((TextView)findViewById(R.id.id_name)).getText().toString();
        String phone = ((TextView)findViewById(R.id.id_phone)).getText().toString();
        Log.d("successful","Button Clicked " + name + phone);
        Intent I = new Intent(this, ShowTest.class);
        I.putExtra("key_name", name);
        I.putExtra("key_phone", phone);
        startActivity(I);
    }
}