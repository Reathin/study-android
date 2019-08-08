package com.chltec.module_day_11;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

/**
 * @author Rair
 * @date 2019/8/8
 * <p>
 * desc:
 */
public class MyIntentService extends IntentService {

    public MyIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

    }
}
