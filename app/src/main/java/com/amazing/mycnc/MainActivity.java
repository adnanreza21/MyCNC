package com.amazing.mycnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView bookCard,kikdCard,quizCard,videoCard,profilCard,latihanCard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bookCard = (CardView) findViewById(R.id.cardmat);
        kikdCard = (CardView) findViewById(R.id.cardkd);
        quizCard = (CardView) findViewById(R.id.cardkuis);
        latihanCard = (CardView) findViewById(R.id.cardlatihan);
        videoCard = (CardView) findViewById(R.id.cardvid);
        profilCard = (CardView) findViewById(R.id.cardprofil);

        bookCard.setOnClickListener(this);
        kikdCard.setOnClickListener(this);
        quizCard.setOnClickListener(this);
        latihanCard.setOnClickListener(this);
        videoCard.setOnClickListener(this);
        profilCard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.cardmat : i = new Intent(this,BookMainActivity.class);startActivity(i);break;
            case R.id.cardkd : i = new Intent(this,BookActivity.class);startActivity(i);break;
            case R.id.cardkuis : i = new Intent(this,QuizActivity.class);startActivity(i);break;
            case R.id.cardlatihan : i = new Intent(this,LatihanActivity.class);startActivity(i);break;
            case R.id.cardvid : i = new Intent(this,VideoActivity.class);startActivity(i);break;
            case R.id.cardprofil : i = new Intent(this,ProfilActivity.class);startActivity(i);break;
            default:break;
        }

    }
}
