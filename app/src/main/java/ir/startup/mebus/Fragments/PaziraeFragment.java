package ir.startup.mebus.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.crowdfire.cfalertdialog.CFAlertDialog;

import ir.startup.mebus.Activities.AddPaziraeActivity;
import ir.startup.mebus.Helpers.Utils;
import ir.startup.mebus.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PaziraeFragment extends Fragment {


    public PaziraeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pazirae, container, false);
        view.findViewById(R.id.fab).setOnClickListener(view1 -> startActivity(new Intent(getActivity(), AddPaziraeActivity.class)));
        Utils.setUpRecyclerView(view, getContext(), R.layout.item_pazirae, () -> {
            CFAlertDialog.Builder builder = new CFAlertDialog.Builder(getContext()).setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT);
            ImageView img = new ImageView(getContext());
            img.setImageDrawable(getContext().getDrawable(R.drawable.demo_food));
            builder.setTitle(R.string.demo_food).setMessage(R.string.demo_food2)
                    .setTextGravity(Gravity.CENTER_HORIZONTAL).setHeaderView(img);
            builder.addButton("درخواست", -1, -1,
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
