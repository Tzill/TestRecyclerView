package com.example.tzill.testrecyclerview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView)inflater.inflate(R.layout.my_fragment, container, false);

        // RecyclerView pizzaRecycler = (RecyclerView)inflater.inflate(R.layout.fragment_pizza_material,
        //                                                                    container, false);

        RecyclerViewAdapter adapter = new RecyclerViewAdapter();
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

//        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(pizzaNames, pizzaImages);
//        pizzaRecycler.setAdapter(adapter);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
//        pizzaRecycler.setLayoutManager(layoutManager);

        return recyclerView;
    }
}
