package com.example.mafiarolegame.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.mafiarolegame.R;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CurrentGameScreen extends AppCompatActivity {
    private TextView timeLeftText;
    private int timeLeft = 60;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_game_screen);

        timeLeftText = findViewById(R.id.timeLeftText);
        startCountdown();
    }

    public void startCountdown()
    {
        final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                countdown();
            }
            }, 0, 1, TimeUnit.SECONDS);
    }

    public void countdown()
    {
        timeLeft--;
        timeLeftText.setText(Integer.toString(timeLeft));
        if (timeLeft == 0)
        {
            // do sth useful
        }
    }
}