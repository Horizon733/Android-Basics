package com.example.news;

public class News {
    private String mHeadline;
    private String mSectionName;
    private String mDate;
    private String  mUrl;
    private String mPillarName;
    private String mAuthor;

    public News(String headline,String sectionName,String pillarName, String date,String author, String url){
        mHeadline = headline;
        mSectionName = sectionName;
        mPillarName = pillarName;
        mDate = date;
        mAuthor = author;
        mUrl = url;
    }

    public String getHeadlineName(){ return mHeadline;}
    public String getSectionName(){ return mSectionName;}
    public String getPillarName(){return mPillarName;}
    public String getDate(){ return mDate;}
    public String getAuthor(){return mAuthor;}
    public String getUrl(){return mUrl;}
}
