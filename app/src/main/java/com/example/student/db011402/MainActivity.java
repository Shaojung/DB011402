package com.example.student.db011402;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView act;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        act = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);

        String str[] = {"aabb", "aaa", "abc", "bbcc", "bcc", "ccc", "ddd"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                str
        );
        act.setAdapter(adapter);
        act.setThreshold(1);
    }
}
