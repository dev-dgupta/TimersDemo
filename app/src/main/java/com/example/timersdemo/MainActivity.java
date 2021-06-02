package com.example.timersdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.i("Seconds Left::", String.valueOf(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
                Log.i("Finished!!!!!", "We are done.");
            }
        }.start();


//        Alternative way
       /* //it runs the runnable
        final Handler handler = new Handler();

        Runnable run = new Runnable() {
            @Override
            public void run() {
                Log.i("Timer demo::", "A second passed by");
                handler.postDelayed(this, 1000);
            }
        };
        //it kicks off the runnable
        handler.post(run);*/

    }
}