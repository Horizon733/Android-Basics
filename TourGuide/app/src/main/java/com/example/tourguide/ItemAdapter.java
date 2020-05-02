package com.example.tourguide;

import android.app.Activity;
import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Items> {

    private  int mColorResourceId;

    public ItemAdapter(Activity context, ArrayList<Items> words, int colorResourceId){
        super(context,0,words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Items currentItem = getItem(position);

        TextView itemTextView = (TextView) listItemView.findViewById(R.id.item_Text_View);
        itemTextView.setText(currentItem.getItemNames());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_Text_View);
        descriptionTextView.setText(currentItem.getDescription());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentItem.hasImage()) {
            iconView.setImageResource(currentItem.getImageResourceId());
        }
        else {
            iconView.setVisibility(View.GONE);
        }
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}


