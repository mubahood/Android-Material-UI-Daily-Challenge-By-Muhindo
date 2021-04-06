package com.muhindo.android_material_ui_daily_challenge.activity.card;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.muhindo.android_material_ui_daily_challenge.R;
import com.muhindo.android_material_ui_daily_challenge.Tools;

public class CardMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Cards");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Tools.setSystemBarColor(this);
    }

    public void openCardBasic(View view) {
        Intent i = new Intent(this, CardBasicActivity.class);
        this.startActivity(i);
    }

    public void openCardClickable(View view) {
        Intent i = new Intent(this, CardClickableActivity.class);
        this.startActivity(i);
    }

    public void openCardOverlap(View view) {
        Intent i = new Intent(this, CardOverlapActivity.class);
        this.startActivity(i);
    }

    public void openCardTimeline(View view) {
        Intent i = new Intent(this, CardTimelineActivity.class);
        this.startActivity(i);
    }

    public void openCardWizard(View view) {
        Intent i = new Intent(this, CardWizardActivity.class);
        this.startActivity(i);
    }
}