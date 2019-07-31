package com.chltec.module_day_9;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private OneFragment oneFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View view = getLayoutInflater().inflate(R.layout.activity_main, null);
        setContentView(view);

        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
        findViewById(R.id.btn_4).setOnClickListener(this);

        oneFragment = new OneFragment();
        Bundle bundle = new Bundle();
        bundle.putString("str", "字符串");
        oneFragment.setArguments(bundle);
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fl_container, oneFragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_1:
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, oneFragment).commit();
                break;
            case R.id.btn_2:
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, new TwoFragment()).commit();
                break;
            case R.id.btn_3:
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, new ThreeFragment()).commit();
                break;
            case R.id.btn_4:
                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, new FourFragment()).commit();
                break;
            default:
                break;
        }
    }
}
