package com.chltec.module_day_4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvText = findViewById(R.id.tv_text);

//        Student student = (Student) getIntent().getSerializableExtra("student");
//        tvText.setText(student.toString());

        Student student = new Student("李四", 34);
        StudentController.getInstance().setStudent(student);


        Intent intent = new Intent();
        intent.putExtra("q", student);
        Bundle bundle = new Bundle();
        setResult(RESULT_OK, intent);


        new AlertDialog.Builder(this).setTitle("标题").setMessage("消息").create().show();
    }
}
