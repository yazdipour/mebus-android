package ir.startup.mebus.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import ir.startup.mebus.Activities.RequestActivity;
import ir.startup.mebus.Helpers.Utils;
import ir.startup.mebus.R;

public class WayFragment extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_way, container, false);
        view.findViewById(R.id.fab).setOnClickListener(view1 -> {
            startActivity(new Intent(getActivity(), RequestActivity.class));
        });
        Utils.setUpRecyclerView(view, getContext(), R.layout.item_way);
        return view;
    }
}
