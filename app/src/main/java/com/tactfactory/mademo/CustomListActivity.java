package com.tactfactory.mademo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CustomListActivity extends Activity {

    private List<Contact> contacts = new ArrayList<Contact>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_custom_list);

        // Populate contacts list
        for(Integer i=0; i<30; i++) {
            Contact contact = new Contact("Contact" , i.toString());
            contact.setNote("rhiuezgfgiugdsqiufdsqoiu fhiuezaaf fre zfez feza");
            contacts.add(contact);
        }

        // Create Adapter View
        CustomArrayAdapter customAdapter = new CustomArrayAdapter(this, contacts);

        // Set Adapter to List
        this.listView = this.findViewById(R.id.listViewCustom);
        this.listView.setAdapter(customAdapter);

        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = CustomListActivity.this.contacts.get(i).getDisplayName();
                Toast.makeText(CustomListActivity.this, value, Toast.LENGTH_LONG).show();
            }
        });

    }
}
