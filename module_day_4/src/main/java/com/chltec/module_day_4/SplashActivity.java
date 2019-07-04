package com.chltec.module_day_4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView tvTime;
    private int time = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        tvTime = findViewById(R.id.tv_time);
//        tvTime.setText(String.valueOf(time));
        //1
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 3; i > 0; i--) {
//                    try {
//                        Thread.sleep(1000);
//                        time--;
//                        tvTime.post(new Runnable() {
//                            @Override
//                            public void run() {
//                                tvTime.setText(String.valueOf(time));
//                            }
//                        });
//                        if (time == 0) {
//                            runOnUiThread(new Runnable() {
//                                @Override
//                                public void run() {
//                                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
//                                    startActivity(intent);
//                                    finish();
//                                }
//                            });
//                        }
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//
//        }).start();

        //2
//        CountDownTimer countDownTimer = new CountDownTimer(3000, 1000) {
//            @Override
//            public void onTick(long millisUntilFinished) {
//                Log.i("yoju", "(SplashActivity.java:58)-onTick:->" + millisUntilFinished);
//                tvTime.setText(String.valueOf(millisUntilFinished / 1000));
//            }
//
//            @Override
//            public void onFinish() {
//                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        };
//        countDownTimer.start();

        //3
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivityForResult(intent, 200);
            }
        }, 3000);
//        Intent intent = new Intent(SplashActivity.this, MainActivity.class);
//        startActivityForResult(intent, 200);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 200 && resultCode == RESULT_OK) {
//            Student student = (Student) data.getSerializableExtra("q");
            Student student = StudentController.getInstance().getStudent();
            tvTime.setText(student.toString());
        }
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }
}
