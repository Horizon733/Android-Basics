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
        words.add(new Items(R.string.event1,R.string.e1_description,R.drawable.kala_ghoda));
        words.add(new Items(R.string.event2,R.string.e2_description,R.drawable.kite));
        words.add(new Items(R.string.event3,R.string.e3_description,R.drawable.ganesha));
        words.add(new Items(R.string.event4,R.string.e4_description,R.drawable.janmashtami));
        words.add(new Items(R.string.event5,R.string.e5_description,R.drawable.diwali));
        words.add(new Items(R.string.event6,R.string.e6_description,R.drawable.garba));
        words.add(new Items(R.string.event7,R.string.e7_description,R.drawable.christmas));




        ItemAdapter adapter = new ItemAdapter(getActivity(), words, R.color.category_attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
