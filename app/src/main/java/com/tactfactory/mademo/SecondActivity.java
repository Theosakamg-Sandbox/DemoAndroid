package com.tactfactory.mademo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondActivity extends Activity implements View.OnClickListener {


    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_second);

        /*
        String maValue = this.getIntent().getExtras().getString("maKey");
        Toast.makeText(this, maValue, Toast.LENGTH_LONG).show();

        Button btn = this.findViewById(R.id.button2);
        btn.setOnClickListener(this);
        */

        // List of value to map in ListView
        final List<String> values = Arrays.asList("Android", "iPhone", "WindowsPhone",
                "WebOs", "Ubuntu", "Windows10", "Linux", "Android", "iPhone", "WindowsPhone",
                "WebOs", "Ubuntu", "Windows10", "Linux", "Android", "iPhone", "WindowsPhone",
                "WebOs", "Ubuntu", "Windows10", "Linux");

        // Adapter for transform Value to item View
        SimpleArrayAdapter adapter = new SimpleArrayAdapter(this,
                android.R.layout.simple_list_item_1, values);

        this.listView = this.findViewById(R.id.listView);
        this.listView.setAdapter(adapter);

        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String value = values.get(position);
                Toast.makeText(SecondActivity.this, value, Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, OtherActivity.class);
        this.startActivity(intent);

    }
}
