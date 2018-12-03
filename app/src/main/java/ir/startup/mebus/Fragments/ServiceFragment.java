package ir.startup.mebus.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
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
//        BoomMenuButton bmb = view.findViewById(R.id.bmb2);
//        String[] labels = new String[]{"ویرایش", "حذف"};
//        String[] subLabel = new String[]{"ویرایش گزینه", "حذف گزینه"};
//        int[] icons = new int[]{R.drawable.ic_edit_black_24dp, R.drawable.ic_delete_forever_black_24dp};
//        int[] colors = new int[]{R.color.semiblack, R.color.RedPigment};
//        OnBMClickListener[] listeners = new OnBMClickListener[]{
//                index -> Toast.makeText(this.getContext(), "Edit", Toast.LENGTH_SHORT).show(),
//                index ->Toast.makeText(this.getContext(), "Remove", Toast.LENGTH_SHORT).show()
//        };
//        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {
//            HamButton.Builder builder = new HamButton.Builder()
//                    .normalImageRes(icons[i])
//                    .normalText(labels[i])
//                    .normalColorRes((colors[i]))
//                    .subNormalText(subLabel[i])
//                    .listener(listeners[i]);
//            bmb.addBuilder(builder);
//        }
        return view;
    }
}
