package com.sumon.firestoredemo.rv;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.sumon.firestoredemo.R;
import com.sumon.firestoredemo.db.MyData;

import java.util.List;
import java.util.Random;

/**
 * Created by Ravi Tamada on 18/05/16.
 */
public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.MyViewHolder> {

    private Context mContext;
    private List<MyData> albumList;
    private final int[] backgroundColors = {
            R.color.google_teal,
            R.color.google_green,
            R.color.google_blue_grey,
            R.color.google_cyan};


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public RelativeLayout relativeLayout;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            relativeLayout = view.findViewById(R.id.recycler_view);

        }
    }


    public AlbumsAdapter(Context mContext, List<MyData> albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        MyData myData = albumList.get(position);
        holder.title.setText(myData.getA() + "// position " + position);

        Random rnd = new Random();
        int currentColor = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

        int bgColor = ContextCompat.getColor(mContext, backgroundColors[position % 4]);
        holder.relativeLayout.setBackgroundColor(bgColor);

    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }
}