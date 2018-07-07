package com.example.android.letsplaymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openHitSongList(View view) {
        Intent todaysPopularHits = new Intent(this, TodaysPopularHits.class);
        startActivity(todaysPopularHits);
    }

    public void openSongListForDriving(View view) {
        Intent musicForDriving = new Intent(this, MusicForDriving.class);
        startActivity(musicForDriving);
    }

    public void openTopAlbumSongList(View view) {
        Intent topAlbums = new Intent(this, TopAlbums.class);
        startActivity(topAlbums);
    }

    public void openFeelingLucky(View view) {
        Intent fellingLucky = new Intent(this, FeelingLucky.class);
        startActivity(fellingLucky);
    }


}
