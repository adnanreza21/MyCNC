package com.amazing.mycnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView bookCard,kikdCard,quizCard,videoCard,profilCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bookCard = (CardView) findViewById(R.id.book);
        kikdCard = (CardView) findViewById(R.id.kikd);
        quizCard = (CardView) findViewById(R.id.quiz);
        videoCard = (CardView) findViewById(R.id.video);
        profilCard = (CardView) findViewById(R.id.profil);

        bookCard.setOnClickListener(this);
        kikdCard.setOnClickListener(this);
        quizCard.setOnClickListener(this);
        videoCard.setOnClickListener(this);
        profilCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.book : i = new Intent(this,BookMainActivity.class);startActivity(i);break;
            case R.id.kikd : i = new Intent(this,BookActivity.class);startActivity(i);break;
            case R.id.quiz : i = new Intent(this,QuizActivity.class);startActivity(i);break;
            case R.id.video : i = new Intent(this,VideoActivity.class);startActivity(i);break;
            case R.id.profil : i = new Intent(this,ProfilActivity.class);startActivity(i);break;
            default:break;
        }

    }
}
