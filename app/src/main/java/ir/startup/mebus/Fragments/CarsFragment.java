package ir.startup.mebus.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ir.startup.mebus.R;
import me.anwarshahriar.calligrapher.Calligrapher;

/**
 * A simple {@link Fragment} subclass.
 */
public class CarsFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cars, container, false);
        new Calligrapher(getContext()).setFont(view, "irsans-Regular.ttf");
        return view;
    }

}
