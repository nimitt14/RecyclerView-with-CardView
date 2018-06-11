package com.example.nimitt.movie;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

        private Context mContext;
        private List<Movie> mData;

    public RecyclerViewAdapter(Context mContext, List<Movie> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater mInflater=LayoutInflater.from(mContext);
        View view=mInflater.inflate(R.layout.cardview_item_movie,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
            holder.movieTitle.setText(mData.get(position).getTitle());
            holder.imgThumbnail.setImageResource(mData.get(position).getPoster());
            holder.cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(mContext,Movie_Activity.class);
                    intent.putExtra("Title",mData.get(position).getTitle());
                    intent.putExtra("Release",mData.get(position).getRelease_date());
                    intent.putExtra("Vote",mData.get(position).getVote());
                    intent.putExtra("Plot",mData.get(position).getPlot());
                    intent.putExtra("Poster",mData.get(position).getPoster());
                    mContext.startActivity(intent);
                }
            });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{
        TextView movieTitle;
        ImageView imgThumbnail;
        CardView cardView;
        public MyViewHolder(View itemView) {
            super(itemView);
            movieTitle=(TextView)itemView.findViewById(R.id.movie_title_id);
            imgThumbnail=(ImageView)itemView.findViewById(R.id.movie_img_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);

        }
    }
}
