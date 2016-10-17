package com.example.mona.testinglistview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class CounterActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.counteractivity);
        TextView SI = (TextView) findViewById(R.id.textView);
        SI.setText(AppData.SelectedItem);

    }
}
