package com.example.nimitt.movie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Movie> LMovies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("adad","main hai");
        setContentView(R.layout.activity_main);

        LMovies=new ArrayList<>();

        LMovies.add(new Movie("Iron Man","1 May 2008","When an industrialist is captured, he constructs a high-tech armoured suit to escape. Once he manages to escape, he decides to use his suit to fight against evil forces and save the world.","7.9 Rating",R.drawable.ironman));
        LMovies.add(new Movie("Titanic","18 Nov 1997","Seventeen-year-old Rose hails from an aristocratic family and is set to be married. When she boards the Titanic, she meets Jack Dawson, an artist, and falls in love with him.","7.8 Rating",R.drawable.titanic));
        LMovies.add(new Movie("Spider Man 2","23 July 2004","Peter Parker, a shy high school student, is often bullied by people. His life changes when he is bitten by a genetically altered spider and gains superpowers.","7.3 Rating",R.drawable.spider));
        LMovies.add(new Movie("Logan","1 March 2017","Logan comes out of retirement to escort a young mutant named Laura to a safe place. He meets with other mutants, who run from an evil corporation that has been experimenting with them, along the way.","8.1 Rating",R.drawable.logan));
        LMovies.add(new Movie("Inception","16 July 2010","Cobb steals information from his targets by entering their dreams. He is wanted for his alleged role in his wife's murder and his only chance at redemption is to perform the impossible, an inception.","8.8 Rating",R.drawable.inception));
        LMovies.add(new Movie("Interstellar","7 Nov 2014","In the future, Earth is slowly becoming uninhabitable. Ex-NASA pilot Cooper, along with a team of researchers, is sent on a planet exploration mission to report which planet can sustain life.","8.6 Rating",R.drawable.inter));
        LMovies.add(new Movie("Iron Man","1 May 2008","When an industrialist is captured, he constructs a high-tech armoured suit to escape. Once he manages to escape, he decides to use his suit to fight against evil forces and save the world.","7.9 Rating",R.drawable.ironman));
        LMovies.add(new Movie("Titanic","18 Nov 1997","Seventeen-year-old Rose hails from an aristocratic family and is set to be married. When she boards the Titanic, she meets Jack Dawson, an artist, and falls in love with him.","7.8 Rating",R.drawable.titanic));
        LMovies.add(new Movie("Spider Man 2","23 July 2004","Peter Parker, a shy high school student, is often bullied by people. His life changes when he is bitten by a genetically altered spider and gains superpowers.","7.3 Rating",R.drawable.spider));
        LMovies.add(new Movie("Logan","1 March 2017","Logan comes out of retirement to escort a young mutant named Laura to a safe place. He meets with other mutants, who run from an evil corporation that has been experimenting with them, along the way.","8.1 Rating",R.drawable.logan));
        LMovies.add(new Movie("Inception","16 July 2010","Cobb steals information from his targets by entering their dreams. He is wanted for his alleged role in his wife's murder and his only chance at redemption is to perform the impossible, an inception.","8.8 Rating",R.drawable.inception));
        LMovies.add(new Movie("Interstellar","7 Nov 2014","In the future, Earth is slowly becoming uninhabitable. Ex-NASA pilot Cooper, along with a team of researchers, is sent on a planet exploration mission to report which planet can sustain life.","8.6 Rating",R.drawable.inter));
        LMovies.add(new Movie("Iron Man","1 May 2008","When an industrialist is captured, he constructs a high-tech armoured suit to escape. Once he manages to escape, he decides to use his suit to fight against evil forces and save the world.","7.9 Rating",R.drawable.ironman));
        LMovies.add(new Movie("Titanic","18 Nov 1997","Seventeen-year-old Rose hails from an aristocratic family and is set to be married. When she boards the Titanic, she meets Jack Dawson, an artist, and falls in love with him.","7.8 Rating",R.drawable.titanic));
        LMovies.add(new Movie("Spider Man 2","23 July 2004","Peter Parker, a shy high school student, is often bullied by people. His life changes when he is bitten by a genetically altered spider and gains superpowers.","7.3 Rating",R.drawable.spider));
        LMovies.add(new Movie("Logan","1 March 2017","Logan comes out of retirement to escort a young mutant named Laura to a safe place. He meets with other mutants, who run from an evil corporation that has been experimenting with them, along the way.","8.1 Rating",R.drawable.logan));
        LMovies.add(new Movie("Inception","16 July 2010","Cobb steals information from his targets by entering their dreams. He is wanted for his alleged role in his wife's murder and his only chance at redemption is to perform the impossible, an inception.","8.8 Rating",R.drawable.inception));
        LMovies.add(new Movie("Interstellar","7 Nov 2014","In the future, Earth is slowly becoming uninhabitable. Ex-NASA pilot Cooper, along with a team of researchers, is sent on a planet exploration mission to report which planet can sustain life.","8.6 Rating",R.drawable.inter));

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter=new RecyclerViewAdapter(this,LMovies);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(myAdapter);
    }
}
