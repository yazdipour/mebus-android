package ir.startup.mebus.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RvAdapter extends RecyclerView.Adapter<RvViewHolder> {
    private final List<Object> data;
    private final int xmlLayout;

    public RvAdapter(List<Object> data, int xmlLayout) {
        this.data = data;
        this.xmlLayout = xmlLayout;
    }

    @NonNull
    @Override
    public RvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext()).inflate(xmlLayout, parent, false);
        return new RvViewHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull RvViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

