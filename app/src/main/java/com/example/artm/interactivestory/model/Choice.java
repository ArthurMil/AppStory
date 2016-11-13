package com.example.artm.interactivestory.model;

/**
 * Created by artm on 12/11/16.
 */

public class Choice {
    private String mText;
    private int mNextPage;

    public Choice(String text, int NextPage) {
        mText = text;
        mNextPage = NextPage;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
