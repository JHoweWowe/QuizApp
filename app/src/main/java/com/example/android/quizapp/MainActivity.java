package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkScore(View view) {
        int quizScore = 0;
        RadioButton radio1B = (RadioButton) findViewById(R.id.question_1_b);
        boolean radio1BCheck = radio1B.isChecked();
        if (radio1BCheck) {
            quizScore++;
        }
        RadioButton radio2B = (RadioButton) findViewById(R.id.question_2_b);
        boolean radio2BCheck = radio2B.isChecked();
        if (radio2BCheck) {
            quizScore++;
        }
        RadioButton radio3D = (RadioButton) findViewById(R.id.question_3_d);
        boolean radio3DCheck = radio3D.isChecked();
        if (radio3DCheck) {
            quizScore++;
        }
        RadioButton radio4B = (RadioButton) findViewById(R.id.question_4_b);
        boolean radio4BCheck = radio4B.isChecked();
        if (radio4BCheck) {
            quizScore++;
        }
        RadioButton radio5A = (RadioButton) findViewById(R.id.question_5_a);
        boolean radio5ACheck = radio5A.isChecked();
        if (radio5ACheck) {
            quizScore++;
        }
        CheckBox checkBox6A = (CheckBox) findViewById(R.id.question_6_a);
        boolean checkBox6ACheck = checkBox6A.isChecked();
        CheckBox checkBox6B = (CheckBox) findViewById(R.id.question_6_b);
        boolean checkBox6BCheck = checkBox6B.isChecked();
        CheckBox checkBox6C = (CheckBox) findViewById(R.id.question_6_c);
        boolean checkBox6CCheck = checkBox6C.isChecked();
        CheckBox checkBox6D = (CheckBox) findViewById(R.id.question_6_d);
        boolean checkBox6DCheck = checkBox6D.isChecked();
        if ((checkBox6ACheck && checkBox6CCheck && checkBox6DCheck) && (!checkBox6BCheck)){
            quizScore++;
        }
        CheckBox checkBox7A = (CheckBox) findViewById(R.id.question_7_a);
        boolean checkBox7ACheck = checkBox7A.isChecked();
        CheckBox checkBox7B = (CheckBox) findViewById(R.id.question_7_b);
        boolean checkBox7BCheck = checkBox7B.isChecked();
        CheckBox checkBox7C = (CheckBox) findViewById(R.id.question_7_c);
        boolean checkBox7CCheck = checkBox7C.isChecked();
        CheckBox checkBox7D = (CheckBox) findViewById(R.id.question_7_d);
        boolean checkBox7DCheck = checkBox7D.isChecked();
        if ((checkBox7BCheck && checkBox7CCheck) && (!checkBox7ACheck && !checkBox7DCheck)) {
            quizScore++;
        }
        EditText editText8A = (EditText) findViewById(R.id.question_8);
        if ((editText8A.getText().toString().equalsIgnoreCase("mee siam"))) {
            quizScore++;
        }

        if (quizScore <= 4) {
            Toast quizScoreShow = Toast.makeText(this, "Better luck next time! Your score is " + quizScore + " out of 8 points!", Toast.LENGTH_LONG);
            quizScoreShow.show();
        }
        else {
            Toast quizScoreShow = Toast.makeText(this, "Well done! Your score is " + quizScore + " out of 8 points!", Toast.LENGTH_LONG);
            quizScoreShow.show();
        }
    }
}
