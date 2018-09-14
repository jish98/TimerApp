package com.example.jish.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.provider.MediaStore;
import android.widget.Toast;



public class Alarm extends BroadcastReceiver {
    @Override

    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context,"Wake up da Lazzy Payya",Toast.LENGTH_LONG).show();
        Vibrator v=(Vibrator)context.getSystemService(context.VIBRATOR_SERVICE);
        v.vibrate(100000);
//        mp.start();
    }
}