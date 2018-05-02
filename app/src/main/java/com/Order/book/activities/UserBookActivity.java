package com.Order.book.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.Order.book.R;

public class UserBookActivity extends AppCompatActivity {

    EditText mUserTime;
    EditText mUserDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_book);

        mUserTime = (EditText) findViewById(R.id.Usertime);
        mUserDate = (EditText) findViewById(R.id.UserDate);

        Button button = (Button) findViewById(R.id.userBook);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Booked Successfully", Toast.LENGTH_SHORT).show();
                display();

            }
        });

    }

    private void getTimeDate() {
        mUserTime.getText().toString();
        mUserDate.getText().toString();
    }

    public void display() {
        getTimeDate();
    }

}
