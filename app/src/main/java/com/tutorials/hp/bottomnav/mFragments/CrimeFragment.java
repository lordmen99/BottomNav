package com.tutorials.hp.bottomnav.mFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutorials.hp.bottomnav.R;

/**
 * Created by Oclemmy on 5/10/2016 for ProgrammingWizards Channel and http://www.Camposha.com.
 * Fragment shown when crim navigation item is clicked.
 */
public class CrimeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.crime_fragment,container,false);

        return rootView;
    }
}
