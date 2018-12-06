package ir.startup.mebus.Adapter;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RvViewHolder extends RecyclerView.ViewHolder {

    RvViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    void bind(Object o, RvAdapter.Events events, int position) {
        itemView.setOnClickListener(view -> events.onClick());
    }
}