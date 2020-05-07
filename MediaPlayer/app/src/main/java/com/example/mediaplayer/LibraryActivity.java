package com.example.mediaplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity {
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);


        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(R.string.song1, R.string.s1_artist, 400000, R.drawable.beach));
        songs.add(new Song(R.string.song2, R.string.s2_artist, 320000));
        songs.add(new Song(R.string.song3, R.string.s3_artist, 308000));
        songs.add(new Song(R.string.song4, R.string.s4_artist, 250000));
        songs.add(new Song(R.string.song5, R.string.s5_artist, 200000));
        songs.add(new Song(R.string.song6, R.string.s6_artist, 500000));
        songs.add(new Song(R.string.song7, R.string.s7_artist, 367000));
        songs.add(new Song(R.string.song8, R.string.s8_artist, 120000));
        songs.add(new Song(R.string.song9, R.string.s9_artist, 490000));
        songs.add(new Song(R.string.song10, R.string.s10_artist, 434000));

        SongAdapter adapter = new SongAdapter(this, songs, R.color.category_colors);
        recyclerView = (RecyclerView) findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        now_playing();


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        return;
    }

    private void now_playing() {
        CardView nowPlaying = (CardView) findViewById(R.id.now_playing_library);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent nowPlayingIntent = new Intent(LibraryActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);

            }
        });
    }
}
