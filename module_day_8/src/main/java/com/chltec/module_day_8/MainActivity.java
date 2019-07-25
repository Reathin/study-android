package com.chltec.module_day_8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.rairmmd.andsqlite.AndSQLiteInstance;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String imageUrl = "http://b-ssl.duitang.com/uploads/blog/201409/06/20140906090448_tfauZ.jpeg";
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        findViewById(R.id.btn_download).setOnClickListener(this);
        findViewById(R.id.btn_show).setOnClickListener(this);

//        MySqliteHelper sqliteHelper = new MySqliteHelper(this, "my.db", null, 1);
//        SQLiteDatabase database = sqliteHelper.getReadableDatabase();
//        database.execSQL("insert into my_table values (0,'张三', 'ewfafef', 'feawfawef');");
        AndSQLiteInstance.init(this, "my.db", false);

        Student student = new Student();
        for (int i = 0; i < 1000; i++) {
            student.setName("李四").setAge(i);
            AndSQLiteInstance.getInstance().save(student);
        }


//        Student student = new Student().setName("李四").setAge(10);
//        AndSQLiteInstance.getInstance().save(student);

//        ArrayList<Student> students = AndSQLiteInstance.getInstance().query(Student.class);
//        ArrayList<Student> students1 = AndSQLiteInstance.getInstance().query(new QueryBuilder<>(Student.class)
//                .whereGreaterThan("age", 10).appendOrderDescBy("age"));
//        AndSQLiteInstance.getInstance().update();
//        AndSQLiteInstance.getInstance().deleteDatabase();
    }


    private void doDownload() {
        try {
            URL url = new URL(imageUrl);
//            data/data/包名/cache/
//            File cacheDir = getCacheDir();
            //data/data/包名/files/

            File sdcard = Environment.getExternalStorageDirectory();
            File yoju = new File(sdcard, "yoju1");
            yoju.mkdirs();

//            File filesDir = getFilesDir();
            final File imageFile = new File(yoju, "image.jpg");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                InputStream is = httpURLConnection.getInputStream();
                FileOutputStream fos = new FileOutputStream(imageFile);
                byte[] bytes = new byte[1024];
                int length;
                while ((length = is.read(bytes)) != -1) {
                    fos.write(bytes, 0, length);
                }
                fos.flush();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(MainActivity.this, "下载完成", Toast.LENGTH_SHORT).show();
                        Bitmap bitmap = BitmapFactory.decodeFile(imageFile.getPath());
                        imageView.setImageBitmap(bitmap);
                    }
                });
            } else {
                Toast.makeText(this, "连接图片资源失败", Toast.LENGTH_SHORT).show();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(this, "下载失败", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_download:
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        doDownload();
                    }
                });
                thread.start();
                break;
            case R.id.btn_show:
                File sdcard = Environment.getExternalStorageDirectory();
                File yoju = new File(sdcard, "yoju1");
                final File imageFile = new File(yoju, "image.jpg");
                Bitmap bitmap = BitmapFactory.decodeFile(imageFile.getPath());
                imageView.setImageBitmap(bitmap);
                break;
            default:
                break;
        }
    }
}
