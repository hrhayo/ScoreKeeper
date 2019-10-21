package com.ayobami.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalTeamA = 0;
    int goalTeamB = 0;
    int shotTeamA = 0;
    int shotTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayGoalForTeamA(goalTeamA);
        displayGoalForTeamB(goalTeamB);
        displayShotForTeamA(shotTeamA);
        displayShotForTeamB(shotTeamB);

    }


    public void goalA (View view) {

        goalTeamA = goalTeamA + 1;

        displayGoalForTeamA(goalTeamA);
    }


    public void goalB (View view) {

        goalTeamB = goalTeamB + 1;
        displayGoalForTeamB(goalTeamB);
    }

    public void shotA (View view) {

        shotTeamA = shotTeamA + 1;
        displayShotForTeamA(shotTeamA);

    }

    public void shotB (View view) {

        shotTeamB = shotTeamB + 1;
        displayShotForTeamB(shotTeamB);
    }



    public void resetBtn(View view) {

        goalTeamA = 0;
        goalTeamB = 0;
        shotTeamA = 0;
        shotTeamB = 0;

        displayGoalForTeamA(goalTeamA);
        displayGoalForTeamB(goalTeamB);
        displayShotForTeamA(shotTeamA);
        displayShotForTeamB(shotTeamB);
    }

    /**
     * Displays the goals for Team A.
     */
    public void displayGoalForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goalScoredA);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the goals for Team B.
     */
    public void displayGoalForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goalScoredB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the shots for Team A.
     */
    public void displayShotForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shotTakenA);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the shots for Team B.
     */
    public void displayShotForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shotTakenB);
        scoreView.setText(String.valueOf(score));
    }
}
