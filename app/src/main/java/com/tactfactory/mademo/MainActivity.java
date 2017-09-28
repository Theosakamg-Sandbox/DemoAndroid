package com.tactfactory.mademo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
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

        // Binding view
        this.btnLogin = (Button) this.findViewById(R.id.btnlogin);
        this.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("maKey", "Ma variable entre 2 activities");
                intent.putExtra("maKeyInt", 10);
                MainActivity.this.startActivity(intent);
                //MainActivity.this.finish();

//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("https://www.google.fr"));
//                MainActivity.this.startActivity(intent);

//                Intent intent = new Intent(Intent.ACTION_INSERT_OR_EDIT);
//                //intent.setData(Uri.parse("https://www.google.fr"));
//                intent.setType(ContactsContract.Contacts.CONTENT_ITEM_TYPE);
//                MainActivity.this.startActivity(intent);
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
}
