package com.bigeshow.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by YinFei on 2016/12/22 0022.
 */

public class Crime {
    public UUID getId() {
        return mId;
    }

    private UUID mId;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    private String mTitle;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    private Date mDate;

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    private boolean mSolved;
    public Crime(){

        mId=UUID.randomUUID();
        mDate=new Date();
        mSolved=false;
    }
}
