package com.dicoding.picodiploma.mybottomnavigation.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dicoding.picodiploma.mybottomnavigation.R;
import com.dicoding.picodiploma.mybottomnavigation.model.TvShow;


public class DetailTv_Activity extends AppCompatActivity {

    public static final String EXTRA_TV = "extra_tv";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tv_);

        TextView namaDetail = findViewById(R.id.detailNama);
        TextView deskripsiDetail = findViewById(R.id.detailDeskripsi);
        ImageView gambarDetail = findViewById(R.id.detailGambar);
        ImageView backdrop = findViewById(R.id.detailBackground);

        TvShow tvShow = getIntent().getParcelableExtra(EXTRA_TV);
        String nama = tvShow.getTitleTv();
        String deskripsi = tvShow.getOverviewTv();
        String gambar = tvShow.getPosterpathTv();
        String background = tvShow.getBackdroppathTv();

        namaDetail.setText(nama);
        deskripsiDetail.setText(deskripsi);

        Glide.with(getApplicationContext())
                .load(gambar)
                .into(gambarDetail);

        Glide.with(getApplicationContext())
                .load(background)
                .into(backdrop);

    }
}
