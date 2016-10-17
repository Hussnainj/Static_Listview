package com.example.mona.testinglistview;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    String[]   data = new String[]{"Android ", "JAVA  ", "Python",
            "iOS", "C#","C++"};

    final List<String> fruits_list = new ArrayList<String>(Arrays.asList(data));

    final ArrayAdapter adapterb = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, fruits_list);

    final ListView listView = (ListView) findViewById(R.id.listView);
    listView.setAdapter(adapterb);
    Toast.makeText(MainActivity.this, Integer.toString(1), Toast.LENGTH_SHORT).show();

    listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            AppData.SelectedItem = fruits_list.get(position);
           // adapterb.remove(fruits_list.get(position));

            adapterb.notifyDataSetChanged();
            Toast.makeText(MainActivity.this, Integer.toString(position), Toast.LENGTH_LONG).show();
            startActivity(new Intent(MainActivity.this, CounterActivity.class));
        }
    });
}
}