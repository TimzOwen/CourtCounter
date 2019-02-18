package com.example.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    Button btnRename;
    TextView et1, et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.btnRenameTeam);


    }
    public void reNameTeam(View view)
    {
        Button btnRename = (Button)findViewById(R.id.btnRenameTeam);
        EditText editText1 = (EditText)findViewById(R.id.tv_teamA_Name);
        EditText editText2 = (EditText)findViewById(R.id.tv_teamB_Name);

    }

    public void addThreePoitsA(View view)
    {
        scoreTeamA += 3;
        displayScoreA(scoreTeamA);
    }
    public  void addTwoPointsA(View view)
    {
        scoreTeamA += 2;
        displayScoreA(scoreTeamA);
    }
    public void addOnePointA(View view)
    {
        scoreTeamA += 1;
        displayScoreA(scoreTeamA);
    }
    public void displayScoreA(int scoreA)
    {
        TextView tvscore = (TextView)findViewById(R.id.display_score_TeamA);
        tvscore.setText(String.valueOf(scoreA));
    }



    public void addThreePoitsB(View view)
    {
        scoreTeamB += 3;
        displayScoreB(scoreTeamB);
    }
    public  void addTwoPointsB(View view)
    {
        scoreTeamB += 2;
        displayScoreB(scoreTeamB);
    }
    public void addOnePointB(View view)
    {
        scoreTeamB += 1;
        displayScoreB(scoreTeamB);
    }
    public void displayScoreB(int scoreB)
    {
        TextView tvscore = (TextView)findViewById(R.id.display_score_TeamB);
        tvscore.setText(String.valueOf(scoreB));
    }
    public void resetScore(View view)
    {
        Button btnReset = (Button)findViewById(R.id.btnReset);
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreA(scoreTeamA);
        displayScoreB(scoreTeamB);
    }


}
