package com.example.shibu.hamroloksewa;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MockTestActivity extends AppCompatActivity implements View.OnClickListener{

    String[] questions = {"Who is the prime minister of Nepal?", "When was the NCP founded?", "Which is the second nearest planet from the Earth?"};
    String[][] options = {
            {"Krishna Prasad Oli", "Babu Ram Bhattrai", "Sher Bahadur Deuba"},
            {"BS 2015", "BS 2032 ", "BS 2035"},
            {"Saturn", "Uranus", "Neptune"}
    };
    String[] ans = {"Krishna Prasad Oli", "BS 2015", "Saturn"};
    TextView one, two, three, qstView;
    int i = 0;
    Random r;
    String mAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock_test);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Mock Test");

        r = new Random();

        one = findViewById(R.id.optOne);
        two = findViewById(R.id.optTwo);
        three = findViewById(R.id.optThree);
        qstView = findViewById(R.id.qstView);

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);

        //Multiple threads for the delay

        updateQst(r.nextInt(questions.length));

    }

    private String getQst(int num) {

        return questions[num];
    }
    private String choice1(int num) {
        String choice = options[num][0];
        return choice;
    }
    private String choice2(int num) {
        String choice = options[num][1];
        return choice;
    }
    private String choice3(int num) {
        String choice = options[num][2];
        return choice;
    }
    private String correctAns(int num) {
        String mAns = ans[num];
        return mAns;
    }

    private void updateQst(int num) {
        qstView.setText(getQst(num));
        one.setText(choice1(num));
        two.setText(choice2(num));
        three.setText(choice3(num));
        mAnswer = correctAns(num);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.optOne:
                if (one.getText() == mAnswer) {
                    Toast.makeText(this, "Correct answer", Toast.LENGTH_SHORT).show();

                    updateQst(r.nextInt(questions.length));
                    one.setBackgroundResource(R.drawable.success_bg);

                }else {
                    Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show();
                    one.setBackgroundResource(R.drawable.error_bg);
                }
                return;
            case R.id.optTwo:
                if (two.getText() == mAnswer) {
                    Toast.makeText(this, "Correct answer", Toast.LENGTH_SHORT).show();
                    updateQst(r.nextInt(questions.length));
                    two.setBackgroundResource(R.drawable.success_bg);

                }else {
                    Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show();
                    two.setBackgroundResource(R.drawable.error_bg);
                }
                return;
            case R.id.optThree:
                if (three.getText() == mAnswer) {
                    Toast.makeText(this, "Correct answer", Toast.LENGTH_SHORT).show();
                    updateQst(r.nextInt(questions.length));
                    two.setBackgroundResource(R.drawable.success_bg);

                }else {
                    Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show();
                    two.setBackgroundResource(R.drawable.error_bg);
                }
                return;
            default:
                return;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        finish();
    }


}
