package com.example.youssef.tasks;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView change;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        change=findViewById(R.id.changetext);
/*
        FragmentManager manager=getFragmentManager();
        Arabicv arabicv=new Arabicv();
        EnglishV englishV=new EnglishV();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.maintask2,arabicv,"arabictag");
        transaction.add(R.id.maintask2,englishV,"englishtag");
        transaction.commit();
        */

        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
