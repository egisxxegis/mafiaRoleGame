package com.example.mafiarolegame.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.mafiarolegame.R;
import com.example.mafiarolegame.gameElements.DBManager;

public class NewGameLobby extends AppCompatActivity {
    private DBManager DBM;
    String playerNameInfo = "";
    String uniquePlayerID = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game_lobby);

        TextView gamePin = (TextView) findViewById(R.id.game_pin_text);
        TextView player1 = (TextView) findViewById(R.id.textView8);
        //reading the name player wrote when he joined the room
        Bundle previousActivityInfo = getIntent().getExtras();
        if (previousActivityInfo != null) {
            String gamePinInfo = previousActivityInfo.getString("gamePinInfo");
            gamePin.setText(gamePinInfo);
            DBM = new DBManager(gamePinInfo);


            playerNameInfo = previousActivityInfo.getString("nameInfo");
            uniquePlayerID = previousActivityInfo.getString("uniquePlayerID");
        }



//        TextView player1 = (TextView) findViewById(R.id.player1);
    }
}
