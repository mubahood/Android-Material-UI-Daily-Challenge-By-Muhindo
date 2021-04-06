package com.muhindo.android_material_ui_daily_challenge.activity.buttons;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.muhindo.android_material_ui_daily_challenge.R;
import com.muhindo.android_material_ui_daily_challenge.UtilityActivity;

public class ButtonMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_main);
    }

    public void openBasic(View view) {
        Intent i = new Intent(this, BasicActivity.class);
        this.startActivity(i);
    }

    public void openUtility(View view) {
        Intent i = new Intent(this, UtilityActivity.class);
        this.startActivity(i);
    }

    public void openToggle(View view) {
        Intent i = new Intent(this, ToggleButtonsActivity.class);
        this.startActivity(i);
    }

    public void openMore(View view) {
        Intent i = new Intent(this, ButtonMoreActivity.class);
        this.startActivity(i);
    }
}