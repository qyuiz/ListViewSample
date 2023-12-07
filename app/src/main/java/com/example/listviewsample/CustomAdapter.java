package com.example.listviewsample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(Context context, List<String> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_custom, parent, false);
        }

        // Get the current item from the data set
        String currentItem = getItem(position);

        // Find the TextView in the list_item_custom.xml layout
        TextView customTextView = listItemView.findViewById(R.id.customTextView);

        // Set the text of the TextView to the current item
        customTextView.setText(currentItem);

        return listItemView;
    }
}
