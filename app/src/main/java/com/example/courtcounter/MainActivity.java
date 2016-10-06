package com.example.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.courtcounter.R.layout.activity_main);
        displayForTeamA(scoreTeamA);

    }
    public void addThreePointsForTeamA(View v)
    {
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoPointsForTeamA(View v)
    {
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }

    public void addOnePointForTeamA(View v)
    {
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }



    /*
*Team B team B
*
*
 */
    public void addThreePointsForTeamB(View v)
    {
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoPointsForTeamB(View v)
    {
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }

    public void addOnePointForTeamB(View v)
    {
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }

    //Reset scores
    public void resetScores(View view)
    {
         scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }


    //Display score for teamA
    public void displayForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    //Display score for teamB
    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
