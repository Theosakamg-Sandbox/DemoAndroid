package com.tactfactory.mademo;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomArrayAdapter extends ArrayAdapter<Contact> {

    private List<Contact> contacts;

    // Holder of Binding View (findViewById)
    static class ViewHolder {
        ImageView imageView;
        TextView nameView;
        TextView noteView;
    }

    public CustomArrayAdapter(@NonNull Context context, @NonNull List<Contact> objects) {
        super(context, -1, objects);

        this.contacts = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rowView = convertView; // Recycle View instance (out of screen)

        if (rowView == null) { // Detect if Recycled view. If not create it.
            // Get instance of Inflater (for transform layoutXML to Instance of View)
            LayoutInflater inflater = (LayoutInflater)
                    this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            // Transform layoutXML to Instance of View.
            rowView = inflater.inflate(R.layout.cutom_list_item, parent, false);

            // Get reference of views in Holder
            ViewHolder holder = new ViewHolder();
            holder.imageView = rowView.findViewById(R.id.contactImageView);
            holder.nameView  = rowView.findViewById(R.id.contactNameView);
            holder.noteView  = rowView.findViewById(R.id.contactNoteView);
            // Save Holder into View
            rowView.setTag(holder);
        }

        // Get holder from view (can be new or recycled)
        ViewHolder holder = (ViewHolder) rowView.getTag();

        // Get Contact to draw.
        Contact contact = this.contacts.get(position);

        // Binding View <=> Model .
        holder.imageView.setImageURI(Uri.parse("http://lorempixel.com/400/200/"));
        holder.nameView.setText(contact.getDisplayName());
        holder.noteView.setText(contact.getNote());

        // Return new view binded !!!
        return rowView;
    }
}
