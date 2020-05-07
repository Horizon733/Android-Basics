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
        words.add(new Items(R.string.attraction1,R.string.a1_description, R.drawable.gateway));
        words.add(new Items(R.string.attraction2,R.string.a2_description , R.drawable.beach));
        words.add(new Items(R.string.attraction3,R.string.a3_description, R.drawable.museum));
        words.add(new Items(R.string.attraction4,R.string.a4_description, R.drawable.aquarium));
        words.add(new Items(R.string.attraction5,R.string.a5_description, R.drawable.ganesha));
        words.add(new Items(R.string.attraction6,R.string.a6_description, R.drawable.park));
        words.add(new Items(R.string.attraction7,R.string.a7_description, R.drawable.alibag));


        ItemAdapter adapter = new ItemAdapter(getActivity(), words, R.color.category_attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
