package com.Order.book.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.Order.book.R;

public class FutsalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_futsal);


        TextView textView = (TextView) findViewById(R.id.dhayantari);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FutsalActivity.this,DhanyantariActivity.class);
                startActivity(intent);
            }
        });



    }
}
