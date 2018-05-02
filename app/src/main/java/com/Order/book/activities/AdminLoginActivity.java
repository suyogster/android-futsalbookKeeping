package com.Order.book.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.Order.book.R;


public class AdminLoginActivity extends AppCompatActivity {

    EditText mEditTextpan;
    EditText mEditpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        mEditTextpan = (EditText) findViewById(R.id.pan);
        mEditpass = (EditText) findViewById(R.id.passAdmin);

        Button button = (Button) findViewById(R.id.AdminButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ValidateAdminLogin(mEditTextpan.getText().toString(), mEditpass.getText().toString());
            }
        });

    }

    private void ValidateAdminLogin(String pan, String password) {

        if (pan.equals("123456789") && password.equals("ujjwol")) {
            Intent intent = new Intent(AdminLoginActivity.this, BookActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Enter panNo and password", Toast.LENGTH_SHORT).show();
        }

    }
}
