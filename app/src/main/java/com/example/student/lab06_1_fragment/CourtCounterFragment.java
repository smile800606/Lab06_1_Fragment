package com.example.student.lab06_1_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CourtCounterFragment extends Fragment implements OnClickListener {

    private TextView m_tv_team_name;
    private TextView m_tv_team_score;
    private Button m_btn_three_point;
    private Button m_btn_two_point;
    private Button m_btn_one_point;

    public CourtCounterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_court_counter, container, false);
    }

    public void onStart() {
        super.onStart();

        m_tv_team_name = (TextView)getView().findViewById(R.id.tv_team_name);
        m_tv_team_score = (TextView)getView().findViewById(R.id.tv_team_score);

        m_btn_three_point = (Button)getView().findViewById(R.id.btn_three_point);
        m_btn_three_point.setOnClickListener(this);
       // m_btn_two_point = (Button)getView().findViewById(R.id.btn_two_point);
        //m_btn_two_point.setOnClickListener(this);
       // m_btn_one_point = (Button)getView().findViewById(R.id.btn_one_point);
       // m_btn_one_point.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        int score = Integer.parseInt(m_tv_team_score.getText().toString());
        m_tv_team_score.setText(String.valueOf(score + 3));

         //score = Integer.parseInt(m_tv_team_score.getText().toString());
        //m_tv_team_score.setText(String.valueOf(score + 2));

  //      score = Integer.parseInt(m_tv_team_score.getText().toString());
    //    m_tv_team_score.setText(String.valueOf(score + 1));
    }
    public void reset() {
        m_tv_team_score.setText("0");
    }

    public void setTeamName(CharSequence teamName) {
        m_tv_team_name.setText(teamName);
    }
}
