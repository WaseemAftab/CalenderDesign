package com.office.schedule;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Home extends AppCompatActivity {

    private ImageView sundayImg, mondayImg, tuesdayImg, wednesdayImg, thirsdayImg, fridayImg, saturdayImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        sundayImg = (ImageView) findViewById(R.id.img1);
        mondayImg = (ImageView) findViewById(R.id.img2);
        tuesdayImg = (ImageView) findViewById(R.id.img3);
        wednesdayImg = (ImageView) findViewById(R.id.img4);
        thirsdayImg = (ImageView) findViewById(R.id.img5);
        fridayImg = (ImageView) findViewById(R.id.img6);
        saturdayImg = (ImageView) findViewById(R.id.img7);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Student");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        sundayImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Sunday", Toast.LENGTH_SHORT).show();
            }
        });
        mondayImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Monday", Toast.LENGTH_SHORT).show();
            }
        });
        tuesdayImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Tuesday", Toast.LENGTH_SHORT).show();
            }
        });
        wednesdayImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Wednesday", Toast.LENGTH_SHORT).show();
            }
        });
        thirsdayImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Thirsday", Toast.LENGTH_SHORT).show();
            }
        });
        fridayImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Friday", Toast.LENGTH_SHORT).show();
            }
        });
        saturdayImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Home.this, "Saturday", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_items, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
