package com.amazing.mycnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class KodeBubutMainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView card1,card2,card3,card4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kode_bubut_main);
        card1 = (CardView) findViewById(R.id.card1);
        card2 = (CardView) findViewById(R.id.card2);
        card3 = (CardView) findViewById(R.id.card3);
        card4 = (CardView) findViewById(R.id.card4);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){

            case R.id.card1 : i = new Intent(this,MateriB1Activity.class);startActivity(i);break;
            case R.id.card2 : i = new Intent(this,MateriB2Activity.class);startActivity(i);break;
            case R.id.card3 : i = new Intent(this,MateriB3Activity.class);startActivity(i);break;
            case R.id.card4 : i = new Intent(this,MateriB4Activity.class);startActivity(i);break;

            default:break;
        }

    }
}
