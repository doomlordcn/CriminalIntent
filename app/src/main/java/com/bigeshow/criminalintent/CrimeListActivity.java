package com.bigeshow.criminalintent;


import android.support.v4.app.Fragment;

/**
 * Created by YinFei on 2016/12/23 0023.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
