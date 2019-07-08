package com.chltec.module_day_5;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * todo
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /*todo*/
    private Button btnContextMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //todo 我要加个菜单
        btnContextMenu = findViewById(R.id.btn_context_menu);
        btnContextMenu.setOnClickListener(this);
//        registerForContextMenu(btnContextMenu);

//        PopupMenu popupMenu = new PopupMenu(this, btnContextMenu);
//        getMenuInflater().inflate(R.menu.menu_main, popupMenu.getMenu());
//        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                return false;
//            }
//        });
//        popupMenu.show();

//        Student student = new Student().setName("张三").setAge(45);
//        String json = new Gson().toJson(student);

        SharedPreferences ss = getSharedPreferences("ss", MODE_PRIVATE);
        int i = ss.getInt("i", 0);
        Log.i("yoju", i+"");
    }

    @Override
    public void onClick(View v) {
//        View view = getLayoutInflater().inflate(R.layout.layout_progress, new LinearLayout(this));
//        TextView tvMessage = view.findViewById(R.id.tv_message);
//        tvMessage.setText("加载中...");
//        AlertDialog alertDialog = new AlertDialog.Builder(this)
//                .setView(view).show();
//        alertDialog.dismiss();

//        ProgressDialog progressDialog = new ProgressDialog(this);
//        progressDialog.setTitle("加载中");
//        progressDialog.setMessage("加载中...");
//        progressDialog.setCanceledOnTouchOutside(false);
//        progressDialog.show();

//        progressDialog.dismiss();
//        SharedPreferences preferences = getSharedPreferences("ss", MODE_PRIVATE);
//        SharedPreferences.Editor edit = preferences.edit();
//        edit.putInt("i", 10).apply();
    }

//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//        super.onCreateContextMenu(menu, v, menuInfo);
//        menu.setHeaderIcon(R.mipmap.ic_launcher);
//        menu.setHeaderTitle("ContextMenu");
//        menu.add(1, 0, 0, "菜单一");
//        menu.add(1, 1, 1, "菜单二");
//        menu.add(1, 2, 2, "菜单三");
//    }
//
//    @Override
//    public boolean onContextItemSelected(MenuItem item) {
//
//        return super.onContextItemSelected(item);
//    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return super.onCreateOptionsMenu(menu);
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.menu_1:
//                Toast.makeText(this, "菜单一", Toast.LENGTH_SHORT).show();
//                break;
////            case R.id.menu_2:
////                Toast.makeText(this, "菜单二", Toast.LENGTH_SHORT).show();
////                break;
//            default:
//                break;
//        }
//        return super.onOptionsItemSelected(item);

//    }

}
