package sg.edu.rp.c346.id20022098.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView tv2Answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tv2Answer = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        String questionSelected2 = intentReceived.getStringExtra("Question2");
        tv2Answer.setText(questionSelected2 + " answer is: Gone");
    }
}