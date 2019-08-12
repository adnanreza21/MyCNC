package com.amazing.mycnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    public Question mQuestionLibrary = new Question();
    public TextView mScoreView;
    public TextView mQuestionView;
    public Button mButtonChoice1;
    public Button mButtonChoice2;
    public Button mButtonChoice3;
    public Button mButtonChoice4;
    public Button mButtonChoice5;
    public ImageView imageQuestion;

    public static Button keluar;


    public String mAnswer;
    public int mScore = 0;
    public int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        //imageQuestion = findViewById(R.id.imagesoal20);
        click();

        //final state
        /*if (savedInstanceState != null) {
            String result = savedInstanceState.getString(STATE_RESULT);
            mScoreView.setText(result);
            mQuestionView.setText(result);
        }*/
    }

    public void click() {

        keluar = (Button) findViewById(R.id.quit);
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".MainActivity");
                startActivity(intent);
            }
        });


        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.answer1);
        mButtonChoice2 = (Button) findViewById(R.id.answer2);
        mButtonChoice3 = (Button) findViewById(R.id.answer3);
        mButtonChoice4 = (Button) findViewById(R.id.answer4);
        mButtonChoice5 = (Button) findViewById(R.id.answer5);

        updateQuestion();

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(QuizActivity.this, "Benar", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "Salah", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
        });
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(QuizActivity.this, "Benar", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "Salah", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
        });
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(QuizActivity.this, "Benar", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "Salah", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
        });
        mButtonChoice4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (mButtonChoice4.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(QuizActivity.this, "Benar", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "Salah", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
        });
        mButtonChoice5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (mButtonChoice5.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(QuizActivity.this, "Benar", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(QuizActivity.this, "Salah", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
        });

    }

    private void updateQuestion() {
        if (mQuestionNumber < mQuestionLibrary.getLength()) {
            //if (mQuestionNumber == 4) {
              //  int res = getResources().getIdentifier("gbr11", "drawable", getPackageName());
                //imageQuestion.setImageResource(res);

            //}
            mQuestionView.setText((mQuestionLibrary.getQuestions(mQuestionNumber)));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
            mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));
            mButtonChoice5.setText(mQuestionLibrary.getChoice5(mQuestionNumber));

            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        } else {
            Toast.makeText(QuizActivity.this, "Pertanyaan Terakhir!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(QuizActivity.this, ResultQuizActivity.class);
            intent.putExtra("score", mScore);
            startActivity(intent);
        }
    }

    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }

    //final state
    /*private static final String STATE_RESULT = "state_result";

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(STATE_RESULT, mScoreView.getText().toString());
        outState.putString(STATE_RESULT, mQuestionView.getText().toString());
    }*/
}