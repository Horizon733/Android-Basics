package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        // Create a list of words
        final ArrayList<Items> words = new ArrayList<Items>();
        words.add(new Items(R.string.food1,R.string.f1_description));
        words.add(new Items(R.string.food2,R.string.f2_description));
        words.add(new Items(R.string.food3,R.string.f3_description));
        words.add(new Items(R.string.food4,R.string.f4_description));
        words.add(new Items(R.string.food5,R.string.f5_description));
        words.add(new Items(R.string.food6,R.string.f6_description));
        words.add(new Items(R.string.food7,R.string.f7_description));


        ItemAdapter adapter = new ItemAdapter(getActivity(), words, R.color.category_food);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }



}
