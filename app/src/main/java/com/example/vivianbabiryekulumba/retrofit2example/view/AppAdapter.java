package com.example.vivianbabiryekulumba.retrofit2example.view;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.vivianbabiryekulumba.retrofit2example.R;
import com.example.vivianbabiryekulumba.retrofit2example.pojos.Data;

import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by vivianbabiryekulumba on 7/11/18.
 */

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.AppViewHolder>{

    private List<Data> dataList;

    public AppAdapter(List<Data> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public AppViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_view, parent, false);
        return new AppViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AppViewHolder holder, int position) {
        holder.onBind(dataList.get(position));
        Log.d(TAG, "onBindViewHolder: " + dataList.size());
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class AppViewHolder extends RecyclerView.ViewHolder{

        private TextView characters;
        private TextView locations;
        private TextView episodes;


        public AppViewHolder(View itemView) {
            super(itemView);
            characters = itemView.findViewById(R.id.characters_tv);
            locations = itemView.findViewById(R.id.locations_tv);
            episodes = itemView.findViewById(R.id.episode_tv);

        }


        public void onBind(Data data) {
            characters.setText(data.getCharacters());
            locations.setText(data.getLocations());
            episodes.setText(data.getEpisodes());
        }
    }
}
