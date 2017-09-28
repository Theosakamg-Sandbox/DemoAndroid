package com.tactfactory.mademo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_second);

        String maValue = this.getIntent().getExtras().getString("maKey");
        Toast.makeText(this, maValue, Toast.LENGTH_LONG).show();

        Button btn = this.findViewById(R.id.button2);
        btn.setOnClickListener(this);
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
