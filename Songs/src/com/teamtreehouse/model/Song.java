package com.teamtreehouse.model;

/**
 * Created by kayla.flynn on 7/7/2017.
 */
public class Song {
    // users can't change
    // now the pacakge can use these!..protected
    // now the pacakge can use these!..protected
    protected String mArtist;
    protected String mTitle;
    protected String mVideoUrl;

    // constructor to give values
    public Song(String artist, String title, String videoUrl){
        mArtist = artist;
        mTitle = title;
        mVideoUrl = videoUrl;
    }

    // Now what do we want are users to see?
    public String getTitle(){
        return mTitle;
    }

    public String getArtist(){
        return mArtist;
    }

    public String getVideoUrl(){
        return mVideoUrl;
    }

    @Override
    public String toString(){
        return String.format("Song : %s by %s", mTitle, mArtist);
    }
}
