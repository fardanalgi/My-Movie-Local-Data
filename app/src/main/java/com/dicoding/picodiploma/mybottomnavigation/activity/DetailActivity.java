package com.dicoding.picodiploma.mybottomnavigation.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dicoding.picodiploma.mybottomnavigation.R;
import com.dicoding.picodiploma.mybottomnavigation.model.Movie;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_MOVIE = "extra_movie";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView namaDetail = findViewById(R.id.detailNama);
        TextView deskripsiDetail = findViewById(R.id.detailDeskripsi);
        ImageView gambarDetail = findViewById(R.id.detailGambar);
        ImageView gambarBackground = findViewById(R.id.detailBackground);


        Movie movie = getIntent().getParcelableExtra(EXTRA_MOVIE);
        String nama = movie.getTitle();
        String deskripsi = movie.getOverview();
        String gambar = movie.getPosterPath();
        String background = movie.getBackdroppath();

        namaDetail.setText(nama);
        deskripsiDetail.setText(deskripsi);

        Glide.with(getApplicationContext())
                .load(gambar)
                .into(gambarDetail);

        Glide.with(getApplicationContext())
                .load(background)
                .into(gambarBackground);


    }
}
