package sg.edu.rp.c346.id20022098.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvAnswer, tvAnswer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        tvAnswer = findViewById(R.id.textView);

        Intent intentReceived = getIntent();

        if (intentReceived.getStringExtra("Question").equalsIgnoreCase("Q1")) {
            String questionSelected = intentReceived.getStringExtra("Question");
            tvAnswer.setText(questionSelected + " answer is: Queue");
        }
        else {
            String questionSelected2 = intentReceived.getStringExtra("Question");
            tvAnswer.setText(questionSelected2 + " answer is: Gone");
        }




    }
}