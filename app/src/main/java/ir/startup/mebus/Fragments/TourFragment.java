package ir.startup.mebus.Fragments;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.crowdfire.cfalertdialog.CFAlertDialog;

import ir.startup.mebus.Helpers.Utils;
import ir.startup.mebus.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TourFragment extends Fragment {


    public TourFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tour, container, false);
        Utils.setUpRecyclerView(view, getContext(), R.layout.item_tour, () -> {
            CFAlertDialog.Builder builder = new CFAlertDialog.Builder(getContext()).setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT);
            builder.setTextGravity(Gravity.CENTER_HORIZONTAL)
                    .setHeaderView(R.layout.item_tour);
            builder.addButton("دیدن", getResources().getColor(R.color.white), getResources().getColor(R.color.BlueMartina),
                    CFAlertDialog.CFAlertActionStyle.POSITIVE,
                    CFAlertDialog.CFAlertActionAlignment.JUSTIFIED,
                    (dialog, which) -> dialog.dismiss());
            builder.addButton("ویرایش", -1, -1,
                    CFAlertDialog.CFAlertActionStyle.DEFAULT,
                    CFAlertDialog.CFAlertActionAlignment.JUSTIFIED,
                    (dialog, which) -> {
                        dialog.dismiss();
                    });
            builder.addButton("حذف", -1, -1,
                    CFAlertDialog.CFAlertActionStyle.NEGATIVE,
                    CFAlertDialog.CFAlertActionAlignment.JUSTIFIED,
                    (dialog, which) -> dialog.dismiss());
            builder.show();
        });
        return view;
    }

}
