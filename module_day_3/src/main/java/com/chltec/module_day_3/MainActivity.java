package com.chltec.module_day_3;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String text = getString(R.string.text);
        String text1 = getResources().getString(R.string.text);


        int color1 = Color.parseColor("#ffffff");


        int color = ContextCompat.getColor(this, R.color.colorAccent);

        TextView textView = new TextView(this);
        textView.setHeight(120);
        textView.setWidth(100);
        textView.setText("动态添加");
        textView.setGravity(Gravity.CENTER);
        textView.setBackgroundResource(R.drawable.button_selector);

        LinearLayout llContainer = findViewById(R.id.ll_container);
        llContainer.addView(textView);

    }
}
