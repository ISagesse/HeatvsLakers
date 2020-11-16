package android.example.heatvslakers;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int scoreHeat = 0;
    int scoreLakers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void score3(View view) {
        scoreHeat += 3;
        displayForTeamA(scoreHeat);

    }

    public void three(View view) {
        scoreLakers += 3;
        displayForTeamB(scoreLakers);

    }

    public void score2(View view) {
        scoreHeat += 2;
        displayForTeamA(scoreHeat);
    }

    public void two(View view) {
        scoreLakers += 2;
        displayForTeamB(scoreLakers);
    }

    public void freeThrow(View view) {
        ++scoreHeat;
        displayForTeamA(scoreHeat);
    }

    public void freeBees(View view) {
        ++scoreLakers;
        displayForTeamB(scoreLakers);
    }

    public void reset(View view) {
        scoreHeat = 0;
        scoreLakers = 0;
        displayForTeamA(scoreHeat);
        displayForTeamB(scoreLakers);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_heat_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_laker_score);
        scoreView.setText(String.valueOf(score));
    }


}