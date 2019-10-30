package com.amazing.mycnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class BookMainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView materi3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_main);

            materi3 = (CardView) findViewById(R.id.card3);

            materi3.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {
            Intent i ;

            switch (v.getId()){

                case R.id.card3 : i = new Intent(this,HomeBookActivity.class);startActivity(i);break;

                default:break;
            }

        }
    }


