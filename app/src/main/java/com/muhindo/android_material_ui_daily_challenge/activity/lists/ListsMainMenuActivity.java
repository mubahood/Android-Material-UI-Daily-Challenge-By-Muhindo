package com.muhindo.android_material_ui_daily_challenge.activity.lists;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.muhindo.android_material_ui_daily_challenge.R;

public class ListsMainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists_main_menu);
    }

    public void openBasicList(View view) {
        Intent i = new Intent(this, ListBasicActivity.class);
        this.startActivity(i);
    }
}