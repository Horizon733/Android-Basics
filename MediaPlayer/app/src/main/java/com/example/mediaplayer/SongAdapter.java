package com.example.mediaplayer;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;


public class SongAdapter extends RecyclerView.Adapter<SongAdapter.ViewHolder> {
    private ArrayList<Song> songs = new ArrayList<Song>();
    private Context mContext;
    private int mColorResourceId;

    public SongAdapter(Context context, ArrayList<Song> song, int colorResourceId) {
        songs = song;
        mContext = context;
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.song_list, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        Log.d(TAG, "Song added");
        final Song currentSong = songs.get(position);
        if (currentSong.hasImage()) {
            holder.albumImage.setImageResource(currentSong.getImageResourceId());
        } else {
            holder.albumImage.setImageResource(R.drawable.ellipse);
        }
        holder.albumName.setText(currentSong.getAlbumName());
        holder.artistName.setText(currentSong.getArtistName());
        int time = currentSong.getTime();
        holder.timings.setText(time(time));

        int color = ContextCompat.getColor(mContext, mColorResourceId);
        holder.parentLayout.setBackgroundColor(color);
        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "" + songs.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        Log.d(TAG, "songs size: " + songs.size());
        return songs.size();
    }

    private String time(int time) {
        String timeLabel = "";
        int min = time / 1000 / 60;
        timeLabel += min + ":";
        int sec = time / 1000 % 60;
        if (sec < 10) timeLabel += "0";
        timeLabel += sec;
        return timeLabel;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView albumName, artistName, timings;
        public ImageView albumImage;
        public LinearLayout parentLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            albumName = (TextView) itemView.findViewById(R.id.album_name);
            artistName = (TextView) itemView.findViewById(R.id.artist_name);
            albumImage = (ImageView) itemView.findViewById(R.id.image);
            timings = (TextView) itemView.findViewById(R.id.time);
            parentLayout = (LinearLayout) itemView.findViewById(R.id.song_container);
        }
    }


}


