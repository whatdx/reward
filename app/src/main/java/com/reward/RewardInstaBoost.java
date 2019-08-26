package com.reward;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

import static android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND;
import static android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_VISIBLE;

public class RewardInstaBoost {
    public void success(final Context context, final String pka, long delay) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (foregrounded()) {
                    Intent intent = new Intent();
                    intent.setAction("what.blf.okela");
                    intent.putExtra("package_name", pka);
                    context.sendBroadcast(intent);
                }
            }
        }, delay);
    }

    private boolean foregrounded() {
        ActivityManager.RunningAppProcessInfo appProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(appProcessInfo);
        return (appProcessInfo.importance == IMPORTANCE_FOREGROUND || appProcessInfo.importance == IMPORTANCE_VISIBLE);
    }
}
