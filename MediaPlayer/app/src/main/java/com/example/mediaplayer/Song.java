package com.example.mediaplayer;

public class Song {
        private int mAlbumName;
        private int mArtistName;
        private int mTime;
        private int mImageResourceId = NO_IMAGE_PROVIDED;
        private static final int  NO_IMAGE_PROVIDED = -1;
        private int mAudioResourceId;

    public Song(int albumName, int artistName, int time, int imageResourceId){
        mAlbumName = albumName;
        mArtistName = artistName;
        mTime = time;
        mImageResourceId = imageResourceId;

    }
    public Song(int albumName,int artistName,int time){
        mAlbumName = albumName;
        mArtistName = artistName;
        mTime = time;
    }

        public Song(int albumName,int artistName,int time,int imageResourceId,int audioResourceId){
            mAlbumName = albumName;
            mArtistName = artistName;
            mTime = time;
            mImageResourceId = imageResourceId;
            mAudioResourceId = audioResourceId;
        }


        public int getArtistName(){
            return mArtistName;
        }
        public int getAlbumName(){
            return mAlbumName;
        }
        public int getImageResourceId(){return mImageResourceId;}
        public int getTime(){return mTime;}

        public boolean hasImage(){
            return mImageResourceId != NO_IMAGE_PROVIDED;
        }

        public int getAudioResourceId() {return mAudioResourceId;}

}
