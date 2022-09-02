package com.moonhox.irremote1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    EditText powerText, nextChText, pastChText,volUpText, volDownText, muteText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        powerText = (EditText) findViewById(R.id.power);
        nextChText = (EditText) findViewById(R.id.nextCh);
        pastChText = (EditText) findViewById(R.id.pastCh);
        volUpText = (EditText) findViewById(R.id.volUp);
        volDownText = (EditText) findViewById(R.id.volDown);
        muteText = (EditText) findViewById(R.id.mute);

        powerText.setText(MainActivity2.CMD_POWER);
        nextChText.setText(MainActivity2.CMD_CH_NEXT);
        pastChText.setText(MainActivity2.CMD_CH_PREV);
        volUpText.setText(MainActivity2.CMD_VOLUP);
        volDownText.setText(MainActivity2.CMD_VOLDOWN);
        muteText.setText(MainActivity2.CMD_MUTE);
    }

    public void updateCodes(View view) {

        MainActivity2.CMD_POWER = String.valueOf(powerText.getText());
        MainActivity2.CMD_POWER = String.valueOf(nextChText.getText());
        MainActivity2.CMD_POWER = String.valueOf(pastChText.getText());
        MainActivity2.CMD_POWER = String.valueOf(volUpText.getText());
        MainActivity2.CMD_POWER = String.valueOf(volDownText.getText());
        MainActivity2.CMD_POWER = String.valueOf(muteText.getText());

        startActivity(new Intent(MainActivity3.this, MainActivity2.class));
    }
}