package com.amazing.mycnc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class VideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        TextView t = (TextView) findViewById(R.id.txt1);
        t.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t1 = (TextView) findViewById(R.id.txt2);
        t1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t2 = (TextView) findViewById(R.id.txt3);
        t2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t3 = (TextView) findViewById(R.id.txt4);
        t3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t4 = (TextView) findViewById(R.id.txt5);
        t4.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t5 = (TextView) findViewById(R.id.txt6);
        t5.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t6 = (TextView) findViewById(R.id.txt7);
        t6.setMovementMethod(LinkMovementMethod.getInstance());

        TextView t7 = (TextView) findViewById(R.id.txt8);
        t7.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
