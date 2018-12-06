package ir.startup.mebus.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.TypedValue;
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
public class WaysFragment extends Fragment {


    public WaysFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ways, container, false);
        Utils.setUpRecyclerView(view, getContext(), R.layout.item_ways, () -> {
            CFAlertDialog.Builder builder = new CFAlertDialog.Builder(getContext()).setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT);
//            ImageView img = new ImageView(getContext());
//            img.setImageDrawable(getContext().getDrawable(R.drawable.demo_map));
            builder.setHeaderView(R.layout.item_ways);
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
