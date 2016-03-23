package com.example.student.lab06_1_fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CourtCounterFragment  m_fragment_team_a;
    private CourtCounterFragment m_fragment_team_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStart(){
        super.onStart();
        setFragmentTeamName();
    }
private void setFragmentTeamName(){
    m_fragment_team_a =
            (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_a);
    m_fragment_team_b =
            (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_b);
    m_fragment_team_a.setTeamName("湖人");
    m_fragment_team_b.setTeamName("火箭");

}

    public void reset(View view) {
        m_fragment_team_a.reset();
        m_fragment_team_b.reset();
        CourtCounterFragment fragment_team_a =
                (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_a);
        CourtCounterFragment fragment_team_b =
                (CourtCounterFragment)getSupportFragmentManager().findFragmentById(R.id.fragment_team_b);
        fragment_team_a.reset();
        fragment_team_b.reset();
    }


}