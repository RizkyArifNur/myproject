package com.example.rizky.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.Html;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView lostpassword, textsignup, header;
    LinearLayout container, footer;
    Animation animdowntoup, animlefttoright, animuptodown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lostpassword = findViewById(R.id.lostpassword);
        lostpassword.setText(Html.fromHtml(String.format(getString(R.string.passwordlost))));
        textsignup = findViewById(R.id.textsignup);
        textsignup.setText(" " + Html.fromHtml(getString(R.string.signuplink)));
        header = findViewById(R.id.header);
        container = findViewById(R.id.container);
        footer = findViewById(R.id.footer);
        animdowntoup = AnimationUtils.loadAnimation(this, R.anim.downtoup);
        animlefttoright = AnimationUtils.loadAnimation(this, R.anim.lefttoright);
        animuptodown = AnimationUtils.loadAnimation(this, R.anim.uptodown);
        container.setAnimation(animlefttoright);
        header.setAnimation(animuptodown);
        footer.setAnimation(animdowntoup);
                     }
}
