package com.example.android.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * theese are the global variables for the A Team
     */
    int scoreTeamA = 0;
    int touchDownTeamA = 0;
    int fieldGoalTeamA = 0;
    int safetyTeamA = 0;
    int dropTeamA = 0;

    /**
     * theese are the global variables for the B Team
     */

    int scoreTeamB = 0;
    int touchDownTeamB = 0;
    int fieldGoalTeamB = 0;
    int safetyTeamB = 0;
    int dropTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * this method adds six points to the score of A Team and add one to the touch down of A Team
     *
     * @param view
     */

    public void incrementTouchDownA(View view) {
        scoreTeamA = scoreTeamA + 6;
        touchDownTeamA = touchDownTeamA + 1;
        displayScoreTeamA(scoreTeamA);
        displayTouchDownTeamA(touchDownTeamA);
    }

    /**
     * this method displays the touch down of team a
     *
     * @param touchDownTeamA
     */

    private void displayTouchDownTeamA(int touchDownTeamA) {
        TextView touchDownView = (TextView) findViewById(R.id.touchDown_a_team);
        touchDownView.setText(String.valueOf(touchDownTeamA));
    }

    /**
     * this method displays the score of team a
     *
     * @param scoreTeamA
     */

    private void displayScoreTeamA(int scoreTeamA) {
        TextView scoreView = (TextView) findViewById(R.id.score_a_team);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * this method adds three points to the score of A Team and add one to the field goals of A Team
     *
     * @param view
     */

    public void incrementFieldGoalA(View view) {
        scoreTeamA = scoreTeamA + 3;
        fieldGoalTeamA = fieldGoalTeamA + 1;
        displayScoreTeamA(scoreTeamA);
        displayFieldGoalsTeamA(fieldGoalTeamA);
    }

    /**
     * this method displays the field goals of team a
     *
     * @param fieldGoalTeamA
     */
    private void displayFieldGoalsTeamA(int fieldGoalTeamA) {
        TextView fieldGoalsView = (TextView) findViewById(R.id.fieldGoal_a_team);
        fieldGoalsView.setText(String.valueOf(fieldGoalTeamA));
    }

    /**
     * this method adds two points to the score of A Team and add one to the safety of A Team
     *
     * @param view
     */

    public void incrementSafetyA(View view) {
        scoreTeamA = scoreTeamA + 2;
        safetyTeamA = safetyTeamA + 1;
        displayScoreTeamA(scoreTeamA);
        displaySafetyTeamA(safetyTeamA);
    }

    /**
     * this method displays safety of team a
     *
     * @param safetyTeamA
     */

    private void displaySafetyTeamA(int safetyTeamA) {
        TextView safetyView = (TextView) findViewById(R.id.safety_a_team);
        safetyView.setText(String.valueOf(safetyTeamA));
    }

    /**
     * this method adds three points to the score of A Team and add one to the drops of A Team
     *
     * @param view
     */

    public void incrementDropA(View view) {
        scoreTeamA = scoreTeamA + 1;
        dropTeamA = dropTeamA + 1;
        displayScoreTeamA(scoreTeamA);
        displayDropsTeamA(dropTeamA);
    }

    /**
     * this method displays the drops of team a
     *
     * @param dropTeamA
     */

    private void displayDropsTeamA(int dropTeamA) {

        TextView dropView = (TextView) findViewById(R.id.drop_a_team);
        dropView.setText(String.valueOf(dropTeamA));
    }

    /**
     * this method adds six points to the score of B Team and add one to the touch down of B Team
     *
     * @param view
     */

    public void incrementTouchDownB(View view) {
        scoreTeamB = scoreTeamB + 6;
        touchDownTeamB = touchDownTeamB + 1;
        displayScoreTeamB(scoreTeamB);
        displayTouchDownTeamB(touchDownTeamB);
    }

    /**
     * this method displays the touch down of team b
     *
     * @param touchDownTeamB
     */

    private void displayTouchDownTeamB(int touchDownTeamB) {
        TextView touchDownView = (TextView) findViewById(R.id.touchDown_b_team);
        touchDownView.setText(String.valueOf(touchDownTeamB));
    }

    /**
     * this method displays the score of team b
     *
     * @param scoreTeamB
     */

    private void displayScoreTeamB(int scoreTeamB) {
        TextView scoreView = (TextView) findViewById(R.id.score_b_team);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    /**
     * this method adds three points to the score of B Team and add one to the field goals of B Team
     *
     * @param view
     */

    public void incrementFieldGoalB(View view) {
        scoreTeamB = scoreTeamB + 3;
        fieldGoalTeamB = fieldGoalTeamB + 1;
        displayScoreTeamB(scoreTeamB);
        displayFieldGoalsTeamB(fieldGoalTeamB);
    }

    /**
     * this method displays the field goals of the team b
     * @param fieldGoalTeamB
     */

    private void displayFieldGoalsTeamB(int fieldGoalTeamB) {
        TextView fieldGoalsView = (TextView) findViewById(R.id.fieldGoal_b_team);
        fieldGoalsView.setText(String.valueOf(fieldGoalTeamB));
    }

    /**
     * this method adds two points to the score of B Team and add one to the safety of B Team
     *
     * @param view
     */

    public void incrementSafetyB(View view) {
        scoreTeamB = scoreTeamB + 2;
        safetyTeamB = safetyTeamB + 1;
        displayScoreTeamB(scoreTeamB);
        displaySafetyTeamB(safetyTeamB);
    }

    /**
     * this method displays the safety of team b
     * @param safetyTeamB
     */

    private void displaySafetyTeamB(int safetyTeamB) {
        TextView safetyView = (TextView) findViewById(R.id.safety_b_team);
        safetyView.setText(String.valueOf(safetyTeamB));
    }

    /**
     * this method adds three points to the score of B Team and add one to the drops of B Team
     *
     * @param view
     */

    public void incrementDropB(View view) {
        scoreTeamB = scoreTeamB + 1;
        dropTeamB = dropTeamB + 1;
        displayScoreTeamB(scoreTeamB);
        displayDropsTeamB(dropTeamB);
    }

    /**
     * this method displays the drops of team b
     * @param dropTeamB
     */

    private void displayDropsTeamB(int dropTeamB) {
        TextView dropView = (TextView) findViewById(R.id.drop_b_team);
        dropView.setText(String.valueOf(dropTeamB));
    }

    /**
     * this method reset both scores of the teams and all the counters
     *
     * @param view
     */

    public void resetScoreAndCounters(View view) {
        scoreTeamA = 0;
        displayScoreTeamA(scoreTeamA);
        touchDownTeamA = 0;
        displayTouchDownTeamA(touchDownTeamA);
        fieldGoalTeamA = 0;
        displayFieldGoalsTeamA(fieldGoalTeamA);
        safetyTeamA = 0;
        displaySafetyTeamA(safetyTeamA);
        dropTeamA = 0;
        displayDropsTeamA(dropTeamA);

        scoreTeamB = 0;
        displayScoreTeamB(scoreTeamB);
        touchDownTeamB = 0;
        displayTouchDownTeamB(touchDownTeamB);
        fieldGoalTeamB = 0;
        displayFieldGoalsTeamB(fieldGoalTeamB);
        safetyTeamB = 0;
        displaySafetyTeamB(safetyTeamB);
        dropTeamB = 0;
        displayDropsTeamB(dropTeamB);


    }
}
