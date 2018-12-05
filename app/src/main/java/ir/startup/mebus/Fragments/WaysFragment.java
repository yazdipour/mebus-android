package ir.startup.mebus.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ir.startup.mebus.Helpers.Utils;
import ir.startup.mebus.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WaysFragment extends Fragment {


    public WaysFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ways, container, false);
        Utils.setUpRecyclerView(view, getContext(), R.layout.item_ways);
        return view;
    }

}
