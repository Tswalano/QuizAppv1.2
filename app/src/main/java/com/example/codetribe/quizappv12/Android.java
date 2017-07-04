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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Android extends AppCompatActivity {

    AlertDialog.Builder alertDialog;
    CountDownTimer countDownTimer;

    //Buttons
    Button btnSubmit;
    //RadioButtons
    RadioButton answer1, answer2, answer3, answer4;
    RadioGroup rdGroup;
    //TextView
    TextView question, time, welcome, score, qunum;

    private Questions mQuestion = new Questions();
    private String mAnswer;
    Random r;
    static int incrementV = 0, mScore = 0, qnumber = 1;

    List<String> questionList = Arrays.asList(mQuestion.cat2Questions);
    List<String[]> answerList = Arrays.asList(mQuestion.cat2Answers);
    List<String> correctList = Arrays.asList(mQuestion.cat2CorrectAnswers);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android);

        r = new Random();

        answer1 = (RadioButton) findViewById(R.id.rad1);
        answer2 = (RadioButton) findViewById(R.id.rad2);
        answer3 = (RadioButton) findViewById(R.id.rad3);
        answer4 = (RadioButton) findViewById(R.id.rad4);
        rdGroup = (RadioGroup) findViewById(R.id.radGroup);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        question = (TextView) findViewById(R.id.ques);
        time = (TextView) findViewById(R.id.timmer);
        welcome = (TextView) findViewById(R.id.welcome);
        score = (TextView) findViewById(R.id.score);
        qunum = (TextView) findViewById(R.id.qnum);

        update();
        timer();
        updateQuestion(questionList.indexOf(questionList.get(incrementV)));
        score.setText("Score: " + mScore);
        qunum.setText("Question: " + qnumber++);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(qnumber <= 5){
                    if(answer1.isChecked()) {
                        System.out.println("radio button 1" + answer1.getText().toString() + " Answer1: " + mAnswer);
                        if (answer1.getText().toString().equalsIgnoreCase(mAnswer)) {
                            mScore++;
                            score.setText("Score: " + mScore);
                        }
                        updateQuestion(questionList.indexOf(questionList.get(qnumber)));
                        qunum.setText("Question: " + qnumber++);
                    }
                    else if(answer2.isChecked()){
                        System.out.println("radio button 2 "+answer2.getText().toString()+" Answer2: "+mAnswer);
                        if(answer2.getText().toString().equalsIgnoreCase( mAnswer)){
                            mScore++;
                            score.setText("Score: " + mScore);
                        }
                        updateQuestion(questionList.indexOf(questionList.get(qnumber)));
                        qunum.setText("Question: " + qnumber++);
                    }
                    else if(answer3.isChecked()){
                        System.out.println("radio button 3 "+answer3.getText().toString()+" Answer3: "+mAnswer);
                        if(answer3.getText().toString().equalsIgnoreCase( mAnswer)){
                            mScore++;
                            score.setText("Score: " + mScore);
                        }
                        updateQuestion(questionList.indexOf(questionList.get(qnumber)));
                        qunum.setText("Question: " + qnumber++);
                    }
                    else if(answer4.isChecked()) {
                        System.out.println("radio button 4" + answer4.getText().toString() + " Answer4: " + mAnswer);
                        if (answer4.getText().toString().equalsIgnoreCase(mAnswer)) {
                            mScore++;
                            score.setText("Score: " + mScore);
                        }
                        updateQuestion(questionList.indexOf(questionList.get(qnumber)));
                        qunum.setText("Question: " + qnumber++);
                    }
                }else{
                    //GameOver
                    countDownTimer.cancel();
                    Intent i = new Intent(Android.this, Results.class);
                    startActivity(i);
                }
            }
        });
    }

    private void updateQuestion(int num) {
        question.setText(mQuestion.getC2Questions(num));

        answer1.setText(mQuestion.getC2Answer1(num));
        answer2.setText(mQuestion.getC2Answer2(num));
        answer3.setText(mQuestion.getC2Answer3(num));
        answer4.setText(mQuestion.getC2Answer4(num));

        mAnswer = mQuestion.getC2CorrectAnswer(num);

    }

    void update() {
        long x = System.nanoTime();
        Collections.shuffle(questionList, new Random(x));
        Collections.shuffle(answerList, new Random(x));
        Collections.shuffle(correctList, new Random(x));
    }

    private void gameOver() {
        alertDialog = new AlertDialog.Builder(Android.this);
        alertDialog.setTitle("Game Over");
        alertDialog.setMessage("Game Over! You Score Is " + mScore + " points")
                .setCancelable(false)
                .setPositiveButton("NEW GAME",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                startActivity(new Intent(getApplicationContext(), Android.class));
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

    void timer() {
        countDownTimer = new CountDownTimer(60000, 100) {

            public void onTick(long millisUntilFinished) {
                //TIME LEFT
                time.setText("Time " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                //GAME OVER!!!
                gameOver();
            }
        }.start();
    }
}
