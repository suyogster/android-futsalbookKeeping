package com.Order.book.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.Order.book.R;

public class DhanyantariActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhanyantari);

        Button button = (Button) findViewById(R.id.button_book);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DhanyantariActivity.this, UserBookActivity.class);
                startActivity(intent);
            }
        });

    }

    public void onclickDhanyantari(View v) {
        Uri intent = Uri.parse("geo:27.719905, 85.340955");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, intent);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}
