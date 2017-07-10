package com.teamtreehouse;

/**
 * Created by kayla.flynn on 7/5/2017.
 */

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class Treet implements Comparable, Serializable {
    private static final long serialVersionUID = -4540222542462795273L;
    // Generated serial ID from
    // https://stackoverflow.com/questions/12912287/intellij-idea-generating-serialversionuid
   //private static final long serialVersionUID = 3612921695316004281L;
    //private boolean mBreakIt = true;
    private String mAuthor;
    private String mDescription;
    private Date mCreationDate;

    // constructor that we want everyone to be able to use
    public Treet(String author, String description, Date creationDate){
        mAuthor = author;
        mDescription = description;
        mCreationDate = creationDate;
    }

    // So the compiler knows that we are overriding the output to say what we wrote below
    @Override
    // "\" adds quotes in a string!
    public String toString(){
        //return "Treet: \"" + mDescription + "\" - @" + mAuthor;
        return String.format("Treet: \"%s\" by %s on %s", mDescription, mAuthor, mCreationDate);
    }

    @Override
    public int compareTo(Object obj){
        Treet other = (Treet) obj;
        // returning a treet to itself
        if (equals(other)) {
            return 0;
        }
        // comparing dates
        int dateCmp = mCreationDate.compareTo(other.mCreationDate);
        // if they happen at the same time, we want to make sure they are different tweets
        if (dateCmp == 0){
            return mDescription.compareTo(other.mDescription);
        }
        return dateCmp;
    }
    // Adding getters
    // create method
    // By not creating the setter, we made it immutable so it cannot be changed
    public String getAuthor(){
        return mAuthor;
    }
    public String getDescription(){
        return mDescription;
    }
    public Date getCreationDate(){
        return mCreationDate;
    }
    public List<String> getWords() {
        String[] words = mDescription.toLowerCase().split("[^\\w#@']+");
        return Arrays.asList(words);
    }

    // to create ones for @, we copied and pasted and changed
    // the string to @, which is a red flag! Use private method instead!

    public List<String> getMentions(){
        return getWordsPrefixedWith("@");
    }

    public List<String> getHashTags(){
        return getWordsPrefixedWith("#");
    }


    private List<String> getWordsPrefixedWith(String prefix){
        List<String> results = new ArrayList<String>();
        for (String word : getWords()){
            if (word.startsWith(prefix)){
                results.add(word);
            }
        }
        return results;
    }


}
