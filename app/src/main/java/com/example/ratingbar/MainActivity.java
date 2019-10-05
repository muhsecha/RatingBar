package com.example.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView titlerate,resultrate;
    Button btnfeedback;
    ImageView icchar,icsprite;
    RatingBar ratestars;
    String answerValue;

    Animation charaanim,animsprite,btnfeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        icsprite=findViewById(R.id.icsprite);
        titlerate=findViewById(R.id.titlerate);
        resultrate=findViewById(R.id.resultrate);
        btnfeedback=findViewById(R.id.btnfeedback);
        icchar=findViewById(R.id.icchar);
        ratestars=findViewById(R.id.ratestars);

        //load animation
        charaanim = AnimationUtils.loadAnimation(this, R.anim.charaanim);
        animsprite = AnimationUtils.loadAnimation(this,R.anim.animsprite);
        btnfeed = AnimationUtils.loadAnimation(this,R.anim.btt);

        //give animation
        icchar.startAnimation(charaanim);
        icsprite.startAnimation(animsprite);
        btnfeedback.startAnimation(btnfeed);

        // give condition
        ratestars.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                answerValue = String.valueOf((int)(ratestars.getRating()));
                if (answerValue.equals("1"))
                {
                    icchar.setImageResource(R.drawable.icstarsone);
                    //give animate
                    icsprite.animate().alpha(0).setDuration(300).start();
                    icchar.startAnimation(charaanim);
                    btnfeedback.startAnimation(btnfeed);

                    resultrate.setText("Just So So");
                }
                else if (answerValue.equals("2"))
                {
                    icchar.setImageResource(R.drawable.icstarstwo);
                    //give animate
                    icchar.startAnimation(charaanim);
                    icsprite.animate().alpha(0).setDuration(300).start();
                    btnfeedback.startAnimation(btnfeed);

                    resultrate.setText("Just So So");
                }
                else if (answerValue.equals("3"))
                {
                    icchar.setImageResource(R.drawable.icstarstwo);
                    //give animate
                    icchar.startAnimation(charaanim);
                    icsprite.animate().alpha(0).setDuration(300).start();
                    btnfeedback.startAnimation(btnfeed);

                    resultrate.setText("Good Job");
                }
                else if (answerValue.equals("4"))
                {
                    icchar.setImageResource(R.drawable.icstarsthree);
                    // give animate
                    icchar.startAnimation(charaanim);
                    icsprite.animate().alpha(1).setDuration(300).start();
                    btnfeedback.startAnimation(btnfeed);
                    icsprite.startAnimation(animsprite);

                    resultrate.setText("Good Job");
                }
                else if (answerValue.equals("5"))
                {
                    icchar.setImageResource(R.drawable.icstarsfive);
                    //give animate
                    icchar.startAnimation(charaanim);
                    icsprite.animate().alpha(1).setDuration(300).start();
                    btnfeedback.startAnimation(btnfeed);
                    icsprite.startAnimation(animsprite);

                    resultrate.setText("Awesome");
                }
                else {
                    Toast.makeText(getApplicationContext(),"No Point",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
