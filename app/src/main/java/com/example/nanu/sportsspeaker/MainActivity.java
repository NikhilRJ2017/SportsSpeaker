package com.example.nanu.sportsspeaker;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton boxingBtn,karateBtn,judoBtn,kickboxingBtn,taekwondoBtn,aikidoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boxingBtn = findViewById(R.id.boxingBtn);
        aikidoBtn = findViewById(R.id.aikidoBtn);
        karateBtn = findViewById(R.id.karateBtn);
        judoBtn = findViewById(R.id.judoBtn);
        kickboxingBtn = findViewById(R.id.kickboxingBtn);
        taekwondoBtn = findViewById(R.id.taekwondoBtn);

        boxingBtn.setOnClickListener(MainActivity.this);
        aikidoBtn.setOnClickListener(MainActivity.this);
        karateBtn.setOnClickListener(MainActivity.this);
        judoBtn.setOnClickListener(MainActivity.this);
        kickboxingBtn.setOnClickListener(MainActivity.this);
        taekwondoBtn.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View imageBtnView) {

        switch (imageBtnView.getId()){

            case R.id.boxingBtn:
                playSportName(boxingBtn.getTag().toString());
                break;

            case R.id.aikidoBtn:
                playSportName(aikidoBtn.getTag().toString());
                break;

            case R.id.karateBtn:
                playSportName(karateBtn.getTag().toString());
                break;

            case R.id.judoBtn:
                playSportName(judoBtn.getTag().toString());
                break;

            case R.id.kickboxingBtn:
                playSportName(kickboxingBtn.getTag().toString());
                break;

            case R.id.taekwondoBtn:
                playSportName(taekwondoBtn.getTag().toString());
                break;

        }

    }

    private void playSportName(String sportName){

        MediaPlayer mediaPlayer = MediaPlayer.create
                (this,getResources().getIdentifier(sportName,"raw",getPackageName()));
        mediaPlayer.start();
    }
}
