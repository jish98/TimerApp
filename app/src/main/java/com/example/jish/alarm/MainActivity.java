package com.example.jish.alarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnSet;
    EditText etAlarm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSet = (Button)findViewById(R.id.btnSet);
        etAlarm = (EditText)findViewById(R.id.etAlarm);


        btnSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int time = Integer.parseInt(etAlarm.getText().toString());
                Intent intent=new Intent(MainActivity.this, Alarm.class);
                PendingIntent p1=PendingIntent.getBroadcast(getApplicationContext(),0, intent,0);
                AlarmManager a=(AlarmManager)getSystemService(ALARM_SERVICE);

                Toast.makeText(getApplicationContext(),"Happy sleeping :P",Toast.LENGTH_LONG).show();
                a.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis() + time*1000,p1);

            }
        });
    }

}