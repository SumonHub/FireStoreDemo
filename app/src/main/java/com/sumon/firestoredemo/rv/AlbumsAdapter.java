package com.sumon.firestoredemo.rv;

import android.content.Context;
import android.content.res.ColorStateList;
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

/**
 * Created by Ravi Tamada on 18/05/16.
 */
public class AlbumsAdapter extends RecyclerView.Adapter<AlbumsAdapter.MyViewHolder> {

    private Context mContext;
    private List<MyData> albumList;

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

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        MyData myData = albumList.get(position);
        holder.title.setText(myData.getA());
       // holder.count.setText(myData.getB() + " songs");

        // loading myData cover using Glide library
     //   Glide.with(mContext).load(myData.getThumbnail()).into(holder.thumbnail);

       /* holder.overflow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPopupMenu(holder.overflow);
            }
        });*/

        if (position == 0) {
            holder.relativeLayout.setBackgroundTintList(ColorStateList.valueOf(mContext.getResources().getColor(R.color.google_blue)));
        } else if (position % 2 == 0) {
            holder.relativeLayout.setBackgroundTintList(ColorStateList.valueOf(mContext.getResources().getColor(R.color.google_green)));
        } else if (position % 3 == 0) {
            holder.relativeLayout.setBackgroundTintList(ColorStateList.valueOf(mContext.getResources().getColor(R.color.google_yellow)));
        } else if (position % 4 == 0) {
            holder.relativeLayout.setBackgroundTintList(ColorStateList.valueOf(mContext.getResources().getColor(R.color.google_red)));
        } else {
            holder.relativeLayout.setBackgroundTintList(ColorStateList.valueOf(mContext.getResources().getColor(R.color.colorPrimary)));
        }



    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }
}