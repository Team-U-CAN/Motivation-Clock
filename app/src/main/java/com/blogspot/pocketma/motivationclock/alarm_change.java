package com.blogspot.pocketma.motivationclock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class alarm_change extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm_change);
    }
    public void openHome(View view)
    {
        Intent newIntent = new Intent(this, home.class);
        startActivity(newIntent);
    }
    public void openAlarm(View view)
    {
        Intent newIntent = new Intent(this, alarm_change.class);
        startActivity(newIntent);
    }
    public void openBored(View view)
    {
        Intent newIntent = new Intent(this, choose_task.class);
        startActivity(newIntent);
    }
    public void openAchievements(View view)
    {
        Intent newIntent = new Intent(this, achievements.class);
        startActivity(newIntent);
    }

    public void open_Add_Alarm(View view)
    {
        Intent newIntent = new Intent(this, add_alarm.class);
        startActivity(newIntent);
    }
}