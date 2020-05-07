package com.example.tourguide;

public class Items {
    private int mItemNames;
    private int mDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int  NO_IMAGE_PROVIDED = -1;

    public Items(int itemNames,int description){
        mItemNames = itemNames;
        mDescription = description;
    }
    public Items(int itemNames, int description, int imageResourceId){
        mItemNames = itemNames;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public int getItemNames(){
        return mItemNames;
    }
    public int getDescription(){return mDescription;}
    public int getImageResourceId(){return mImageResourceId;}

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
