package com.amazing.mycnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultQuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_quiz);

        TextView txtScore = (TextView) findViewById(R.id.nilaiakhir);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);
        int a = 4;
        txtScore.setText("" + score*a);

    }

    public void onClick(View view) {
        Intent intent = new Intent(ResultQuizActivity.this, QuizActivity.class);
        startActivity(intent);

    }
}