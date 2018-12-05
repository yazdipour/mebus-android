package ir.startup.mebus.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import ir.startup.mebus.Helpers.Utils;
import ir.startup.mebus.R;

public class ServiceFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_service, container, false);
        Utils.setUpRecyclerView(view, getContext(), R.layout.item_service);
        return view;
    }
}
