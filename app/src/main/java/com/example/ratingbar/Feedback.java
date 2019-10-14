package com.example.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class Feedback extends AppCompatActivity {

    String takestars;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        textView=findViewById(R.id.textview1);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null)
        {
            takestars = bundle.getString("answervalue");
            textView.setText(takestars+" Stars");
        }

    }
}
