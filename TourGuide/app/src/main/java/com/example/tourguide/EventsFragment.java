package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        // Create a list of words
        final ArrayList<Items> words = new ArrayList<Items>();
        words.add(new Items("Kala Ghoda Fest","Churchgate in Feb",R.drawable.kala_ghoda));
        words.add(new Items("Kite Flying","Whole Mumbai on 14th and 15th Jan every year",R.drawable.kite));
        words.add(new Items("Ganesh Fest","Whole Mumbai in Aug-Sept",R.drawable.ganesha));
        words.add(new Items("Janmashtami","Whole Mumbai in Aug-Sept",R.drawable.janmashtami));
        words.add(new Items("Diwali","Festival of lights in Oct",R.drawable.diwali));
        words.add(new Items("Navratri","Durga Maa fest and Garba nights in Oct",R.drawable.garba));
        words.add(new Items("Christmas","Whole Mumbai enjoys it in Winter in Dec ",R.drawable.christmas));




        ItemAdapter adapter = new ItemAdapter(getActivity(), words, R.color.category_attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
