package com.chltec.module_day_7;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private PopupWindow popupWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_show).setOnClickListener(this);
        findViewById(R.id.btn_show1).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_show:
                new AlertDialog.Builder(this).setTitle("温馨提示").setMessage("efefefafafwaefwaefwae")
                        .setPositiveButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).setNegativeButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).show();

                break;
            case R.id.btn_show1:
                showPopupWindow(v);
                break;
            case R.id.tv_1:
                Toast.makeText(this, "我是选项1", Toast.LENGTH_SHORT).show();
                popupWindow.dismiss();
                break;
            case R.id.tv_2:
                Toast.makeText(this, "我是选项2", Toast.LENGTH_SHORT).show();
                popupWindow.dismiss();
                break;
            case R.id.tv_3:
                Toast.makeText(this, "我是选项3", Toast.LENGTH_SHORT).show();
                popupWindow.dismiss();
                break;
            default:
                break;
        }

    }

    private void showPopupWindow(View v) {
        View contentView = getLayoutInflater().inflate(R.layout.layout_content_view, null);
        contentView.findViewById(R.id.tv_1).setOnClickListener(this);
        contentView.findViewById(R.id.tv_2).setOnClickListener(this);
        contentView.findViewById(R.id.tv_3).setOnClickListener(this);

        popupWindow = new PopupWindow();
        popupWindow.setContentView(contentView);
        popupWindow.setWidth(dp2px(80));
        popupWindow.setHeight(dp2px(145));
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setAnimationStyle(R.style.pop_animation);
//        popupWindow.showAsDropDown(v);
//        popupWindow.showAsDropDown(v, 0, -dp2px(145));
        popupWindow.showAsDropDown(v, -dp2px(10), 0, Gravity.END);
//        popupWindow.showAtLocation(v, Gravity.END, -60, 100);
    }

    public int dp2px(float dp) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }

    public int px2dp(float px) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (px / scale + 0.5f);
    }
}
