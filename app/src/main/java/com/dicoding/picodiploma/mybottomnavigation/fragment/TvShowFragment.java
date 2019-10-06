package com.dicoding.picodiploma.mybottomnavigation.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dicoding.picodiploma.mybottomnavigation.R;
import com.dicoding.picodiploma.mybottomnavigation.adapter.TvshowAdapter;
import com.dicoding.picodiploma.mybottomnavigation.model.TvShow;
import com.dicoding.picodiploma.mybottomnavigation.model.TvshowData;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TvShowFragment extends Fragment {

    private RecyclerView rvTvshow;
    private ArrayList<TvShow> list = new ArrayList<>();


    public TvShowFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_tv_show, container, false);

        rvTvshow = view.findViewById(R.id.rv_Tv);
        rvTvshow.setHasFixedSize(true);

        list.addAll(TvshowData.getList());
        showRecyclerList();

        return view;
    }

    private void showRecyclerList(){
        rvTvshow.setLayoutManager(new LinearLayoutManager(getContext()));
        TvshowAdapter tvshowAdapter = new TvshowAdapter(list,getContext());
        rvTvshow.setAdapter(tvshowAdapter);

        tvshowAdapter.setOnItemClickCallbackTv(new TvshowAdapter.OnItemClickCallbackTv() {
            @Override
            public void onItemClicked(TvShow tvShow) {
                showSelectedTvshow(tvShow);
            }
        });

    }
     private void showSelectedTvshow(TvShow tvShow){

     }

}
