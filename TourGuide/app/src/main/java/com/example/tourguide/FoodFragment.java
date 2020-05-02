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
        words.add(new Items("Samosa","Potatoes with crispy outer layer"));
        words.add(new Items("Pav Bhaji","Bread with spicy vegetable dish"));
        words.add(new Items("Misal Pav","Bread and spicy and nutty Misal"));
        words.add(new Items("Bhajiya Pav","Potatoes,Onion fried with chutney with Bread"));
        words.add(new Items("Sev Puri","Puri with many topings and spicy"));
        words.add(new Items("Pani Puri","Mouth watering food"));
        words.add(new Items("Vada Pav","Potato vada with Bun Bread"));



        ItemAdapter adapter = new ItemAdapter(getActivity(), words, R.color.category_food);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }



}
