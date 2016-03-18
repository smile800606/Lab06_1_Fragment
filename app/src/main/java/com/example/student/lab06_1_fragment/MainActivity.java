package com.example.student.lab03_1_courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.student.lab06_1_fragment.R;

public class MainActivity extends AppCompatActivity {

    private int scoreA;
    private int scoreB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayforA (int score){
        TextView scoreA = (TextView)findViewById(R.id.A_sccore);
        scoreA.setText(String.valueOf(score));
    }

    public void  add3forA (View view){
        scoreA += 3;
        displayforA(scoreA);
    }
    public void add2forA (View view){
        scoreA += 2;
        displayforA(scoreA);
    }
    public void add1forA(View view){
        scoreA += 1;
        displayforA(scoreA);
    }



    public void displayforB (int score){
        TextView scoreB = (TextView)findViewById(R.id.B_sccore);
        scoreB.setText(String.valueOf(score));
    }

    public void  add3forB (View view){
        scoreB += 3;
        displayforB(scoreB);
    }
    public void add2forB (View view){
        scoreB += 2;
        displayforB(scoreB);
    }
    public void add1forB(View view){
        scoreB += 1;
        displayforB(scoreB);
    }
    public void reset (View view){
        scoreB = 0;
        scoreA = 0;
        displayforA(scoreA);
        displayforB(scoreB);
    }


}

