package com.example.meituan_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by 悦儿 on 2016/9/12.
 */
public class GuidesActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guides);
        initvVIew();
    }

    private void initvVIew() {
        Timer timer = new Timer();//timer中有一个线程,这个线程不断执行task

        TimerTask  task = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(GuidesActivity.this, MainActivity.class);
                startActivity(intent);
                GuidesActivity.this.finish();
            }
        };
        timer.schedule(task, 1000 * 3);//设置这个task在延迟三秒之后自动执行
    }

}
