package ir.startup.mebus.Helpers;

import android.content.Context;
import android.view.View;

import java.util.Arrays;
import java.util.List;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ir.startup.mebus.Adapter.RvAdapter;
import ir.startup.mebus.R;

public class Utils {
    private static List<Object> list = Arrays.asList(new Object(),new Object(),new Object(),
            new Object(),new Object(),new Object(),new Object(),new Object(),
            new Object(),new Object(),new Object(),new Object(),new Object(),new Object());

    public static void setUpRecyclerView(View mainView, Context context, int layout) {
        final RecyclerView recyclerView = mainView.findViewById(R.id.rv);
        RecyclerView.Adapter adapter = new RvAdapter(list, layout);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(adapter);
    }

}
