package com.amazing.mycnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class BookMainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView materi1,materi2,materi3,materi4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_main);

            materi1 = (CardView) findViewById(R.id.card1);
            materi2 = (CardView) findViewById(R.id.card2);
            materi3 = (CardView) findViewById(R.id.card3);
            materi4 = (CardView) findViewById(R.id.card4);

            materi1.setOnClickListener(this);
            materi2.setOnClickListener(this);
            materi3.setOnClickListener(this);
            materi4.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            Intent i ;

            switch (v.getId()){
                case R.id.card1 : i = new Intent(this,Materi1Activity.class);startActivity(i);break;
                case R.id.card2 : i = new Intent(this,Materi2Activity.class);startActivity(i);break;
                case R.id.card3 : i = new Intent(this,Materi3Activity.class);startActivity(i);break;
                case R.id.card4 : i = new Intent(this,Materi4Activity.class);startActivity(i);break;
                //case R.id.profil : i = new Intent(this,PersonActivity.class);startActivity(i);break;
                default:break;
            }

        }
    }


