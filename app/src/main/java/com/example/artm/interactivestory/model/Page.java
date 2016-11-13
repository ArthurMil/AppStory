package com.example.artm.interactivestory.model;

import android.provider.ContactsContract;

/**
 * Created by artm on 12/11/16.
 */

public class Page {

    private int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setFinal(boolean aFinal) {
        mIsFinal = aFinal;
    }

    private boolean mIsFinal = false;

    public Page(int ImageId, String text, Choice choice1, Choice choice2) {
        mImageId = ImageId;
        mText = text;
        mChoice1 = choice1;
        mChoice2 = choice2;
    }

    public Page(int ImageId, String text) {
        mImageId = ImageId;
        mText = text;
        mChoice1 = null;
        mChoice2 = null;
        mIsFinal = true;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int id) {
        mImageId = id;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }
}
