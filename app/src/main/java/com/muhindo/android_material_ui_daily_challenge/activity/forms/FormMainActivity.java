package com.muhindo.android_material_ui_daily_challenge.activity.forms;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.muhindo.android_material_ui_daily_challenge.R;

public class FormMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_main);
    }

    public void loginActivity(View view) {
        Intent i = new Intent(this, FormLoginActivity.class);
        startActivity(i);
    }

    public void signUpActivity(View view) {
        Intent i = new Intent(this, FormSignUpActivity.class);
        startActivity(i);
    }

    public void profileWithIcons(View view) {
        Intent i = new Intent(this, FormProfileWithIconsActivity.class);
        startActivity(i);
    }

    public void formTextArea(View view) {
        Intent i = new Intent(this, FormTextArea.class);
        startActivity(i);
    }

    public void formAddress(View view) {
        Intent i = new Intent(this, FormAddressActivity.class);
        startActivity(i);
    }

    public void formEcommerce(View view) {
        Intent i = new Intent(this, FormEcommerceActivity.class);
        startActivity(i);
    }

    public void openSignUpCardForm(View view) {
        Intent i = new Intent(this, FormSignupCardActivity.class);
        startActivity(i);
    }

    public void formSignupCardStack(View view) {
        Intent i = new Intent(this, FormSignupCardStackActivity.class);
        startActivity(i);
    }

    public void signupDarkMode(View view) {
        Intent i = new Intent(this, FormSignupDarkActivity.class);
        startActivity(i);
    }
    public void signupImage(View view) {
        Intent i = new Intent(this, FormSignupImageActivity.class);
        startActivity(i);
    }
    public void signupImageBackgound(View view) {
        Intent i = new Intent(this, FormSignupImageBackgroundActivity.class);
        startActivity(i);
    }
    public void formAddProject(View view) {
        Intent i = new Intent(this, FormAddProjectActivity.class);
        startActivity(i);
    }
}