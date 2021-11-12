package com.example.hw4androit1.Fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw4androit1.R;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder>{

    private ArrayList<MainModel> list = new ArrayList<>();
    Lisener lisener ;

    public void setLisener(Lisener lisener) {
        this.lisener = lisener;
    }

    public void setList(ArrayList<MainModel> list) {
        this.list = list;
        notifyDataSetChanged();
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView number;
        private TextView nameOfSong;
        private TextView nameOfSinger;
        private TextView time;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            number = itemView.findViewById(R.id.namberOfSong);
            nameOfSong = itemView.findViewById(R.id.nameOfSong);
            time = itemView.findViewById(R.id.timeOfSong);
            nameOfSinger = itemView.findViewById(R.id.nameOfSinger);
        }
        public void onBind(MainModel model) {
            nameOfSinger.setText(model.getNameofsinger());
            nameOfSong.setText(model.getNameofsong());
            time.setText(model.getTimeofsong());
            number.setText(model.getNamberofsong());

            itemView.setOnClickListener(v-> {
                lisener.onClik(model);
            });
    }

    }
    interface Lisener{
        void onClik(MainModel model);
    }
}
