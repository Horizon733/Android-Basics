package com.example.news;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(@NonNull Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_items, parent, false);
        }
        News currentNews = getItem(position);

        TextView headLine = listItemView.findViewById(R.id.headline);
        headLine.setText(currentNews.getHeadlineName());

        TextView pillar = listItemView.findViewById(R.id.pillar);
        pillar.setText(currentNews.getPillarName() + " - ");
        TextView section = listItemView.findViewById(R.id.section);
        section.setText(currentNews.getSectionName());

        String wholeDate = currentNews.getDate();
        String[] dateArray = wholeDate.split("T");

        TextView date = listItemView.findViewById(R.id.date);
        date.setText(dateArray[0]);
        String mTime = dateArray[1];
        mTime = mTime.substring(0, 5);
        TextView time = listItemView.findViewById(R.id.time);
        time.setText(mTime);
        TextView author = listItemView.findViewById(R.id.author);
        author.setText(currentNews.getAuthor());
        return listItemView;
    }


}
