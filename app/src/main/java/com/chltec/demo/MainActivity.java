package com.chltec.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    private EditText etName;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.et_name);
//        findViewById(R.id.btn_click).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String s = etName.getText().toString();
//                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
//            }
//        });
        button = findViewById(R.id.btn_click);
        button.setOnClickListener(this);
        findViewById(R.id.btn_click1).setOnClickListener(this);

        ImageView ivImage = findViewById(R.id.iv_image);
        ivImage.setImageResource(R.mipmap.image);
        ivImage.setOnClickListener(this);

        RadioButton rbMan = findViewById(R.id.rb_man);
        RadioButton rbWoman = findViewById(R.id.rb_woman);
        CheckBox cb1 = findViewById(R.id.cb_1);
        CheckBox cb2 = findViewById(R.id.cb_2);


        rbMan.setOnCheckedChangeListener(this);
        rbWoman.setOnCheckedChangeListener(this);
        cb1.setOnCheckedChangeListener(this);
        cb2.setOnCheckedChangeListener(this);


    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
        switch (compoundButton.getId()) {
            case R.id.rb_man:
                if (isChecked) {
                    showToast("选择了男");
                }
                break;
            case R.id.rb_woman:
                if (isChecked) {
                    showToast("选择了女");
                }
                break;
            case R.id.cb_1:
                if (isChecked) {
                    showToast("选择了1");
                    button.setVisibility(View.GONE);
                }else{
                    button.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.cb_2:
                if (isChecked) {
                    showToast("选择了2");
                }
                break;
            default:
                break;
        }
    }

    private void showToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_click:
                String s = etName.getText().toString();
                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_click1:
                Toast.makeText(MainActivity.this, "这是按钮2", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }

//    public void onClicked(View view) {
//        String s = etName.getText().toString();
//        Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
//    }
}
