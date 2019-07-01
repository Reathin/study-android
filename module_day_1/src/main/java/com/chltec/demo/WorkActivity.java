package com.chltec.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;

public class WorkActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView ivEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        ivEnter = findViewById(R.id.iv_enter);
        ivEnter.setOnClickListener(this);
        CheckBox cbAgree = findViewById(R.id.cb_agree);
        cbAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ivEnter.setVisibility(View.VISIBLE);
                } else {
                    ivEnter.setVisibility(View.GONE);
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "我同意", Toast.LENGTH_SHORT).show();
    }
}
