package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class TemplesFragment extends Fragment {

    public TemplesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        // Create a list of words
        final ArrayList<Items> words = new ArrayList<Items>();
        words.add(new Items(R.string.temple1,R.string.t1_description));
        words.add(new Items(R.string.temple2,R.string.t2_description));
        words.add(new Items(R.string.temple3,R.string.t3_description));
        words.add(new Items(R.string.temple4,R.string.t4_description));
        words.add(new Items(R.string.temple5,R.string.t5_description));
        words.add(new Items(R.string.temple6,R.string.t6_description));
        words.add(new Items(R.string.temple7,R.string.t7_description));


        ItemAdapter adapter = new ItemAdapter(getActivity(), words, R.color.category_temple);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
