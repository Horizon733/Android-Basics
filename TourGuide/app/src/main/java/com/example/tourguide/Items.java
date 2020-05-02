package com.example.tourguide;

public class Items {
    private String mItemNames;
    private String mDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int  NO_IMAGE_PROVIDED = -1;

    public Items(String itemNames,String description){
        mItemNames = itemNames;
        mDescription = description;
    }
    public Items(String itemNames,String description,int imageResourceId){
        mItemNames = itemNames;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public String getItemNames(){
        return mItemNames;
    }
    public String getDescription(){return mDescription;}
    public int getImageResourceId(){return mImageResourceId;}

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
