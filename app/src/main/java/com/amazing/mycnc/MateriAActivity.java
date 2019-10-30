package com.amazing.mycnc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MateriAActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_a);
        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){

            case R.id.btn1 : i = new Intent(this,MateriA1Activity.class);startActivity(i);break;
            case R.id.btn2 : i = new Intent(this,MateriA2Activity.class);startActivity(i);break;

            default:break;
        }

    }
}
