package ir.startup.mebus.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.crowdfire.cfalertdialog.CFAlertDialog;

import androidx.fragment.app.Fragment;
import ir.startup.mebus.Activities.AddCarActivity;
import ir.startup.mebus.Helpers.Utils;
import ir.startup.mebus.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CarsFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cars, container, false);
        view.findViewById(R.id.fab).setOnClickListener(view1 -> startActivity(new Intent(getActivity(), AddCarActivity.class)));
        Utils.setUpRecyclerView(view, getContext(), R.layout.item_car, () -> {
            CFAlertDialog.Builder builder = new CFAlertDialog.Builder(getContext()).setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT);
            ImageView img = new ImageView(getContext());
            img.setImageDrawable(getContext().getDrawable(R.drawable.demo_bus));
            builder.setTitle(R.string.demo_bus)
                    .setMessage(R.string.demo_bus2)
                    .setTextGravity(Gravity.CENTER_HORIZONTAL)
                    .setHeaderView(img);
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
