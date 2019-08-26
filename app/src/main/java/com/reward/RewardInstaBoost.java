package com.reward;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;

public class RewardInstaBoost {
    public static void success(final Context context, final String pka, long delay) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent();
                intent.setAction("what.blf.okela");
                intent.putExtra("package_name", pka);
                context.sendBroadcast(intent);
            }
        }, delay);
    }
}
