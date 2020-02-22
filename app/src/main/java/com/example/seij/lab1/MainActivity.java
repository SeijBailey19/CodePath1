package com.example.seij.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

//    boolean isShowingAnswers = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.flashcard_questions).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){

                findViewById(R.id.flashcard_answers).setVisibility(View.VISIBLE);
                findViewById(R.id.flashcard_questions).setVisibility(View.INVISIBLE);
                ((ImageView) findViewById(R.id.toggle_choices_visibility)).setImageResource(R.drawable.ic_iconmonstr_eye_8);

            }
        });

    }

}
