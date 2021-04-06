package com.muhindo.android_material_ui_daily_challenge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.muhindo.android_material_ui_daily_challenge.R;
import com.muhindo.android_material_ui_daily_challenge.activity.buttons.ButtonMainActivity;
import com.muhindo.android_material_ui_daily_challenge.activity.card.CardMainActivity;
import com.muhindo.android_material_ui_daily_challenge.activity.forms.FormMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openButtons(View view) {
        Intent i = new Intent(this, ButtonMainActivity.class);
        this.startActivity(i);
    }

    public void openCards(View view) {
        Intent i = new Intent(this, CardMainActivity.class);
        this.startActivity(i);
    }

    public void openForms(View view) {
        Intent i = new Intent(this, FormMainActivity.class);
        this.startActivity(i);
    }
}