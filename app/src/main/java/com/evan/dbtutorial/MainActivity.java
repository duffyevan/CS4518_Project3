package com.evan.dbtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogEntryDbHelper mDBHelper = new LogEntryDbHelper(this);

    }

    protected void updateEntryCounter(int count){
        TextView counter = findViewById(R.id.textView);
        counter.setText("Entries: " + count);
    }
}
