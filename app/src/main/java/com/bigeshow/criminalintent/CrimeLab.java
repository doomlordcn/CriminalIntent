package com.bigeshow.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by YinFei on 2016/12/23 0023.
 * 单例模式的类
 */

public class CrimeLab {
    private static CrimeLab sCrimeLab;

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    private List<Crime> mCrimes;

    public Crime getCrime(UUID uuid){
        for(Crime crime:mCrimes){
            if(crime.getId().equals(uuid))
                return crime;
        }
        return null;
    }
    public static CrimeLab get(Context context){
        if (sCrimeLab==null){
            sCrimeLab=new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context){
        mCrimes=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Crime crime=new Crime();
            crime.setTitle("Crime #"+i);
            crime.setSolved(i%2==0);
            mCrimes.add(crime);
        }
    }


}
