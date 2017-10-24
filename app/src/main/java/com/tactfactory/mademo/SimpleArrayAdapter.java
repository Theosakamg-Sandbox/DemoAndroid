package com.tactfactory.mademo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import java.util.List;

public class SimpleArrayAdapter extends ArrayAdapter<String> {

    public SimpleArrayAdapter(@NonNull Context context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
    }
}
