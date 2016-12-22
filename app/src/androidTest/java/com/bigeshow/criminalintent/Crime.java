package com.bigeshow.criminalintent;

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

    public Crime(){
        mId=UUID.randomUUID();
    }
}
