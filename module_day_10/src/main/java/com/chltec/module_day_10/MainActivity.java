package com.chltec.module_day_10;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        ArrayList<WechatMessage> datas = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            datas.add(new WechatMessage().setAvatar(R.mipmap.ic_launcher)
                    .setName("中国银行信用卡").setDate("7月11日").setMessage("为中国奥运健儿加油！"));
        }
        datas.add(new WechatMessage().setAvatar(R.mipmap.ic_launcher)
                .setName("中国银行信用卡").setDate("7月11日").setMessage("为中国奥运健儿加油！"));
        datas.add(new WechatMessage().setAvatar(R.mipmap.ic_launcher)
                .setName("肯德基").setDate("7月10日").setMessage("李宇春转笔啦！"));
        datas.add(new WechatMessage().setAvatar(R.mipmap.ic_launcher)
                .setName("中国银行").setDate("7月12日").setMessage("加油！"));
        datas.add(new WechatMessage().setAvatar(R.mipmap.ic_launcher)
                .setName("信用卡").setDate("7月19日").setMessage("奥运健儿加油！"));
        datas.add(new WechatMessage().setAvatar(R.mipmap.ic_launcher)
                .setName("银行信用卡").setDate("7月01日").setMessage("中国奥运健儿加油！"));

        MyAdapter adapter = new MyAdapter(this, datas);
        recyclerView.setAdapter(adapter);
    }
}
