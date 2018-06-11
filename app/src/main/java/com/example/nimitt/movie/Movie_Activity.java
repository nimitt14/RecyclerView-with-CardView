package com.example.nimitt.movie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Movie_Activity extends AppCompatActivity {

    private TextView title,release,vote,plot;
    private ImageView thumbnail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        title=(TextView)findViewById(R.id.title_id);
        release=(TextView)findViewById(R.id.release_date_id);
        vote=(TextView)findViewById(R.id.vote_id);
        plot=(TextView)findViewById(R.id.plot_id);
        thumbnail=(ImageView)findViewById(R.id.thumbnail_id);

        Intent intent=getIntent();
        String Title=intent.getExtras().getString("Title");
        String Release=intent.getExtras().getString("Release");
        String Vote=intent.getExtras().getString("Vote");
        String Plot=intent.getExtras().getString("Plot");
        int img=intent.getExtras().getInt("Poster");

        title.setText(Title);
        release.setText(Release);
        vote.setText(Vote);
        plot.setText(Plot);
        thumbnail.setImageResource(img);
    }
}
