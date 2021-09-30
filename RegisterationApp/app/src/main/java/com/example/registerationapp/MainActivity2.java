package com.example.registerationapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    int position = 0;
    TextView text;
    String [] message = null;
    Animation fadin;
    Animation fadout;
    Handler handler = new Handler();
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text = findViewById(R.id.text_anim);
        fadin = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fadout = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        message = new String[]{"Welcome", getIntent().getBundleExtra("bundle")
                .getString("name").split(" ")[0]};
        intent = new Intent(this, MainActivity3.class);
        intent.putExtra("bundle", getIntent().getBundleExtra("bundle"));
        animate();


    }

    public void animate(){
        try {
            text.setText(message[position]);
        } catch (IndexOutOfBoundsException ex){
            startActivity(intent);
        }
        text.startAnimation(fadin);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                text.startAnimation(fadout);
                if (text.getAnimation() != null) {
                    text.getAnimation().setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {
                            position++;
                            animate();

                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });
                }
            }
        }, 950);
    }
}