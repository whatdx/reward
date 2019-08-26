package com.reward;

import android.content.Context;
import android.content.Intent;

public class RewardInstaBoost {
    public static void success(Context context, String pka) {
        Intent intent = new Intent();
        intent.setAction("what.blf.okela");
        intent.putExtra("package_name", pka);
        context.sendBroadcast(intent);
    }
}
