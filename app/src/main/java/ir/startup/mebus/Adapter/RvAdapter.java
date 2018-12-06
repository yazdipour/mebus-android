package ir.startup.mebus.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RvAdapter extends RecyclerView.Adapter<RvViewHolder> {
    public interface Events {
        void onClick();
    }

    private final List<Object> data;
    private final int xmlLayout;
    private Events events;

    public RvAdapter(List<Object> data, int xmlLayout, Events events) {
        this.data = data;
        this.xmlLayout = xmlLayout;
        this.events = events;
    }

    @NonNull
    @Override
    public RvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext()).inflate(xmlLayout, parent, false);
        return new RvViewHolder(row);
    }

    @Override
    public void onBindViewHolder(@NonNull RvViewHolder holder, int position) {
        holder.bind(data.get(position), events, position);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}

