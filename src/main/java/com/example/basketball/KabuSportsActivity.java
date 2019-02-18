package com.example.basketball;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class KabuSportsActivity extends AppCompatActivity {

    TextView gameScore, ourSchool, SportsDirect, success;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kabu_sports);

        findIds();

        gameScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent bake = new Intent(KabuSportsActivity.this, MainActivity.class);
                startActivity(bake);
            }
        });

        ourSchool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent school = new Intent(KabuSportsActivity.this, OurSchoolActivity.class);
                startActivity(school);
            }
        });

        SportsDirect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent directors = new Intent(KabuSportsActivity.this, SportsDirectorsActivity.class);
                startActivity(directors);
            }
        });

        success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent suces = new Intent(KabuSportsActivity.this, OurSuccessActivity.class);
                startActivity(suces);
            }
        });
    }

    public void findIds()
    {
        gameScore = (TextView)findViewById(R.id.gamesCouter);
        ourSchool = (TextView)findViewById(R.id.ourSchool);
        SportsDirect = (TextView)findViewById(R.id.directorsrectors);
        success = (TextView)findViewById(R.id.success);
    }

}
