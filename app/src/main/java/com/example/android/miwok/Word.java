package com.example.android.miwok;

/**
 * Created by droberts2 on 2016-10-13.
 */
public class Word {
    private String mDefaultWord;
    private String mMiwokWord;
    private int mSound;
    private int mImage = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    public Word(String defaultWord, String miwokWord, int img,int sound) {
        this.mDefaultWord = defaultWord;
        this.mMiwokWord = miwokWord;
        this.mImage = img;
        this.mSound = sound;
    }
    public Word(String defaultWord, String miwokWord,int sound) {
        this.mDefaultWord = defaultWord;
        this.mMiwokWord = miwokWord;
        this.mSound=sound;
    }

    public int getSound() {
        return mSound;
    }

    public String getDefaultWord() {

        return mDefaultWord;
    }

    public String getMiwokWord() {
        return mMiwokWord;
    }

    public int getImage() {
        return mImage;
    }
    public boolean hasImage() {
        //return getImage() != null;
        return mImage != NO_IMAGE;
    }
}
