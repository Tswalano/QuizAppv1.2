package com.example.codetribe.quizappv12;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

public class Java extends AppCompatActivity {

    //Buttons
    Button btnSubmit;
    //RadioButtons
    RadioButton answer1, answer2, answer3, answer4 ;
    RadioGroup rdGroup;
    //TextView
    TextView lblQuestion, lblQuestionNumber, welcome, score, timmer;

    private Questions mQuestion = new Questions();
    private String mAnswer;
    private int mScore = 0;
    private int mQuestionLength = mQuestion.myQuestions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        r = new Random();

        answer1 = (RadioButton) findViewById(R.id.rad1);
        answer2 = (RadioButton) findViewById(R.id.rad2);
        answer3 = (RadioButton) findViewById(R.id.rad3);
        answer4 = (RadioButton) findViewById(R.id.rad4);
        rdGroup = (RadioGroup) findViewById(R.id.radGroup);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        lblQuestion = (TextView) findViewById(R.id.ques);
        lblQuestionNumber = (TextView) findViewById(R.id.qnum);
        welcome = (TextView) findViewById(R.id.welcome);
        score = (TextView) findViewById(R.id.score);
        timmer = (TextView)findViewById(R.id.timer);

        score.setText("Score: " + mScore);
        updateQuestion(r.nextInt(mQuestionLength));
        timer();

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if(answer1.getText() == mAnswer){
                        mScore++;
                        score.setText("Score: " + mScore);
                        updateQuestion(r.nextInt(mQuestionLength));
                    }
                    else if(answer2.getText() == mAnswer){
                        mScore++;
                        score.setText("Score: " + mScore);
                        updateQuestion(r.nextInt(mQuestionLength));
                    }
                    else if(answer3.getText() == mAnswer){
                        mScore++;
                        score.setText("Score: " + mScore);
                        updateQuestion(r.nextInt(mQuestionLength));
                    }
                    else if(answer4.getText() == mAnswer){
                        mScore++;
                        score.setText("Score: " + mScore);
                        updateQuestion(r.nextInt(mQuestionLength));
                    }else{
                        Toast.makeText(getApplicationContext(), "Incorrect Answer", Toast.LENGTH_LONG).show();
                    }

                //gameOver();


            }
        });

    }

    private void updateQuestion(int num){
        lblQuestion.setText(mQuestion.getQuestions(num));

        answer1.setText(mQuestion.getAnswer1(num));
        answer2.setText(mQuestion.getAnswer2(num));
        answer3.setText(mQuestion.getAnswer3(num));
        answer4.setText(mQuestion.getAnswer4(num));

        mAnswer = mQuestion.getCorrectAnswer(num);
    }

    private void gameOver(){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(Java.this);
        alertDialog.setMessage("Game Over! Your Score Is " + mScore + " points")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(), Java.class));
                            }
                        })
        .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
        AlertDialog alertDialog1 = alertDialog.create();
        alertDialog1.show();
    }

    void timer(){
        new CountDownTimer(60000, 100) {

            public void onTick(long millisUntilFinished) {
                //TIME LEFT
                lblQuestionNumber.setText("00:" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                //GAME OVER!!!
                gameOver();
            }
        }.start();
    }

}
