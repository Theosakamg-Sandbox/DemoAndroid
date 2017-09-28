package com.tactfactory.mademo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Layout to Load
        this.setContentView(R.layout.activity_main);

        this.btnLogin = (Button) this.findViewById(R.id.btnlogin);
        this.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_LONG).show();
            }
        });
    }
}
