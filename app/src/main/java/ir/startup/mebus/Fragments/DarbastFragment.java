package ir.startup.mebus.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ir.startup.mebus.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DarbastFragment extends Fragment {


    public DarbastFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_darbast, container, false);
    }

}
