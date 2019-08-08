package com.chltec.module_day_11;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * @author Rair
 * @date 2019/8/8
 * <p>
 * desc:
 */
public class MyService extends Service {

    private MediaPlayer mediaPlayer;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("yoju", "服务启动");
        //得到音乐播放对象
        mediaPlayer = MediaPlayer.create(this, R.raw.music);
        mediaPlayer.start();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("yoju", "服务销毁");
        mediaPlayer.stop();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
