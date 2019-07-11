package com.chltec.module_day_6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.gridView);


//        ArrayList<String> datas = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            datas.add("第" + i + "项");
//        }
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, datas);
//        gridView.setAdapter(adapter);
//
        ArrayList<HashMap<String, Object>> datas = new ArrayList<>();
        HashMap<String, Object> map = new HashMap<>();
        map.put("icon", R.mipmap.ic_launcher);
        map.put("content", "涧水弯弯绕郡城，老蝉嘶作车轮声。西风吹客上马去，夕阳满川红叶明。");
        datas.add(map);

        map.put("icon", R.mipmap.ic_launcher);
        map.put("content", "山有木兮木有枝，心悦君兮君不知。——佚名《越人歌》");
        datas.add(map);

        map.put("icon", R.mipmap.ic_launcher);
        map.put("content", "玲珑骰子安红豆，入骨相思知不知。——温庭筠《南歌子词二首 / 新添声杨柳枝词》");
        datas.add(map);

        map.put("icon", R.mipmap.ic_launcher);
        map.put("content", "山无陵，江水为竭。冬雷震震，夏雨雪。天地合，乃敢与君绝。——佚名《上邪》");
        datas.add(map);

        map.put("icon", R.mipmap.ic_launcher);
        map.put("content", "少年不识愁滋味，爱上层楼。爱上层楼。为赋新词强说愁。——辛弃疾《丑奴儿·书博山道中壁》");
        datas.add(map);

        SimpleAdapter simpleAdapter = new SimpleAdapter(this, datas, R.layout.layout_simple_item_1,
                new String[]{"icon", "content"}, new int[]{R.id.iv_icon, R.id.tv_content});
        gridView.setAdapter(simpleAdapter);

//        final ArrayList<WechatMessage> datas = new ArrayList<>();
//        for (int i = 0; i < 500000; i++) {
//            datas.add(new WechatMessage().setAvatar(R.mipmap.ic_launcher)
//                    .setName("中国银行信用卡").setDate("7月11日").setMessage("为中国奥运健儿加油！"));
//        }
//        datas.add(new WechatMessage().setAvatar(R.mipmap.ic_launcher)
//                .setName("中国银行信用卡").setDate("7月11日").setMessage("为中国奥运健儿加油！"));
//        datas.add(new WechatMessage().setAvatar(R.mipmap.ic_launcher)
//                .setName("肯德基").setDate("7月10日").setMessage("李宇春转笔啦！"));
//        datas.add(new WechatMessage().setAvatar(R.mipmap.ic_launcher)
//                .setName("中国银行").setDate("7月12日").setMessage("加油！"));
//        datas.add(new WechatMessage().setAvatar(R.mipmap.ic_launcher)
//                .setName("信用卡").setDate("7月19日").setMessage("奥运健儿加油！"));
//        datas.add(new WechatMessage().setAvatar(R.mipmap.ic_launcher)
//                .setName("银行信用卡").setDate("7月01日").setMessage("中国奥运健儿加油！"));

//        MyAdapter adapter = new MyAdapter(this, datas);
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                WechatMessage wechatMessage = datas.get(position);
//                Toast.makeText(MainActivity.this, wechatMessage.getMessage(), Toast.LENGTH_SHORT).show();
//            }
//        });
//        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
//                WechatMessage wechatMessage = datas.get(position);
//                Toast.makeText(MainActivity.this, wechatMessage.getName(), Toast.LENGTH_SHORT).show();
//                return true;
//            }
//        });
    }
}
