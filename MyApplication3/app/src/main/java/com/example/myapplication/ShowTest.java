package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ShowTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_test);

        TextView sho = (TextView) findViewById(R.id.showTest);
        Intent I = getIntent();
        String name = I.getStringExtra("key_name");
        String phone = I.getStringExtra("key_phone");
        String formattedText = "<font color = 'black'>Hello every nyan~ \n</font><font color='red'><i>" + name + "</i></font><font color = 'black'>\nHow are you ?\n\nI am fine\nThanks you.\nI will disturb you by calling on </font><font color='blue'>" + phone + "</font> <font color = 'black'>\nat least 20 times a day\nBye ~</font>";
        // Set the formatted text to the TextView
        sho.setText(Html.fromHtml(formattedText, Html.FROM_HTML_MODE_LEGACY));
    }


}