package com.Order.book.activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.Order.book.R;

public class SuryaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surya);
    }

    public void onclickSurya(View v)
    {
        Uri intent = Uri.parse("geo:27.731840, 85.346189");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,intent);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}
