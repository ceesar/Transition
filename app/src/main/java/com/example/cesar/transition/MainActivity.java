package com.example.cesar.transition;

import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView image = new ImageView(this);
        setContentView(image);
        TransitionDrawable transition = (TransitionDrawable)getResources().getDrawable(R.drawable.transition);
        image.setImageDrawable(transition);
        transition.startTransition(2000);
    }
}
