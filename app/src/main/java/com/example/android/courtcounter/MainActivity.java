package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * TEAM A SCORES
     */

    //Displays the given score for Team A.

    public void displayForTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);

        scoreView.setText(String.valueOf(score));

    }

    // adds 3 points for team A

    public void addThreeTeamA (View v){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    // adds 2 points for team A

    public void addTwoTeamA (View v){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    // adds 1 point for team A

    public void addOneTeamA (View v){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * TEAM B SCORES
     */

    //Displays the given score for Team B.

    public void displayForTeamB(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_b_score);

        scoreView.setText(String.valueOf(score));
    }

    // adds 3 points for team B

    public void addThreeTeamB (View v){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    // adds 2 points for team B

    public void addTwoTeamB (View v){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    // adds 1 point for team B

    public void addOneTeamB (View v){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * RESET BUTTON
     */

    //Resets Both Scores to 0.

    public void reset (View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA (scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
