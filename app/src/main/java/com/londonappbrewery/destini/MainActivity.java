package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.id;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    TextView story;
    Button buttonTop;
    Button buttonBottom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        story = (TextView) findViewById(R.id.storyTextView);
        buttonTop = (Button) findViewById(R.id.buttonTop);
        buttonBottom = (Button) findViewById(R.id.buttonBottom);

        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(story.getText().toString().contains("Your car has")){
                    story.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonBottom.setText(R.string.T3_Ans2);
                }else if(story.getText().toString().contains("He nods slowly")){
                    story.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonBottom.setText(R.string.T3_Ans2);
                }else if(story.getText().toString().contains("As you begin")){
                    story.setText(R.string.T6_End);
                    buttonTop.setVisibility(View.INVISIBLE);
                    buttonBottom.setVisibility(View.INVISIBLE);
                }
            }
        });

        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(story.getText().toString().contains("Your car has")){
                    story.setText(R.string.T2_Story);
                    buttonTop.setText(R.string.T2_Ans1);
                    buttonBottom.setText(R.string.T2_Ans2);
                }else if(story.getText().toString().contains("He nods slowly")){
                    story.setText(R.string.T4_End);
                    buttonTop.setVisibility(View.INVISIBLE);
                    buttonBottom.setVisibility(View.INVISIBLE);
                }else if(story.getText().toString().contains("As you begin")){
                    story.setText(R.string.T5_End);
                    buttonTop.setVisibility(View.INVISIBLE);
                    buttonBottom.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
