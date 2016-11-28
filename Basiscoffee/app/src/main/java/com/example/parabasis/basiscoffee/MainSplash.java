package com.example.parabasis.basiscoffee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainSplash extends AppCompatActivity {
ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_splash);



        imageView = (ImageView) findViewById(R.id.imageMain);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.main_anim);
        imageView.setAnimation(animation);

        animation.setAnimationListener(new Animation.AnimationListener() {
                                           @Override
                                           public void onAnimationStart(Animation animation) {

                                           }

                                           @Override
                                           public void onAnimationEnd(Animation animation) {
                                               finish();
                                               startActivity(new Intent(getApplicationContext(),MainActivity.class));


                                           }

                                           @Override
                                           public void onAnimationRepeat(Animation animation) {

                                           }
                                       }

        );

    }
}
