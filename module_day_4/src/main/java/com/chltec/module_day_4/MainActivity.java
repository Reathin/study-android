package com.chltec.module_day_4;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.chltec.module_day_4.work.LoginActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvResult;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tv_result);
        btnLogin = findViewById(R.id.btn_tologin);
        btnLogin.setOnClickListener(this);

//        Student student = (Student) getIntent().getSerializableExtra("student");
//        tvText.setText(student.toString());

//        Student student = new Student("李四", 34);
//        StudentController.getInstance().setStudent(student);
//
//
//        Intent intent = new Intent();
//        intent.putExtra("q", student);
//        Bundle bundle = new Bundle();
//        setResult(RESULT_OK, intent);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivityForResult(intent, 200);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 200 && resultCode == RESULT_OK) {
            String name = data.getStringExtra("name");
            String password = data.getStringExtra("password");
            tvResult.setText("账号是：" + name + "密码是：" + password);
            btnLogin.setVisibility(View.GONE);
        }

    }
}
