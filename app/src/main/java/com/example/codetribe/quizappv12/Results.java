package com.example.codetribe.quizappv12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;

public class Results extends AppCompatActivity {

    Android android = new Android();
    Java java = new Java();
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        ratingBar = (RatingBar)findViewById(R.id.ratings);

        if(android.mScore == 5 || java.mScore == 5){
            ratingBar.setNumStars(5);
            ratingBar.setRating(5);
        }
        if(android.mScore == 4 || java.mScore == 4){
            ratingBar.setNumStars(5);
            ratingBar.setRating(4);
        }
        if(android.mScore == 3 || java.mScore == 3){
            ratingBar.setNumStars(5);
            ratingBar.setRating(3);
        }
        if(android.mScore == 2 || java.mScore == 2){
            ratingBar.setNumStars(5);
            ratingBar.setRating(2);
        }
        if(android.mScore == 1 || java.mScore == 1){
            ratingBar.setNumStars(5);
            ratingBar.setRating(1);
        }
    }
}
