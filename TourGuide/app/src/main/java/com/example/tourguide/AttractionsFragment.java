package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.items_list, container, false);

        // Create a list of words
        final ArrayList<Items> words = new ArrayList<Items>();
        words.add(new Items("Gateway","Loaction: Churchgate",R.drawable.gateway));
        words.add(new Items("Beaches","Location: Juhu,Charni Road,Marine Lines",R.drawable.beach));
        words.add(new Items("Museum","Location: Churchgate",R.drawable.museum));
        words.add(new Items("Tarapur Aquarium","Location: Marine Lines",R.drawable.aquarium));
        words.add(new Items("Siddhi Vinayak Temple","Location: Dadar",R.drawable.ganesha));
        words.add(new Items("SGN National Park","Location: Borivali",R.drawable.park));
        words.add(new Items("Alibag","Location: Get a boat from Gateway",R.drawable.alibag));



        ItemAdapter adapter = new ItemAdapter(getActivity(), words, R.color.category_attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
