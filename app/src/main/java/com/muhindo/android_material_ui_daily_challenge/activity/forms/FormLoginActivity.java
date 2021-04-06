package com.muhindo.android_material_ui_daily_challenge.activity.forms;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.muhindo.android_material_ui_daily_challenge.R;

public class FormLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        bind_views();
    }

    EditText email_view;
    Button sign_in_button;
    ScrollView login_form;
    ProgressBar login_progress;

    private void bind_views() {
        email_view = findViewById(R.id.email_view);
        sign_in_button = findViewById(R.id.sign_in_button);
        login_form = findViewById(R.id.login_form);
        login_progress = findViewById(R.id.login_progress);

        sign_in_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate_form();
            }
        });
    }

    private void validate_form() {
        if (email_view.getText().toString().isEmpty()) {
            email_view.requestFocus();
            email_view.setError("Email cannot be empty.");
            return;
        } else {
            email_view.setError(null);
        }

        String email = email_view.getText().toString();
        if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            email_view.setError("Invalid Email address");
            email_view.requestFocus();
            return;
        } else {
            email_view.setError(null);
        }

        Toast.makeText(this, "Please wait...", Toast.LENGTH_LONG).show();

        login_form.setVisibility(View.GONE);
        login_progress.setVisibility(View.VISIBLE);


    }
}