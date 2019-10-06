package com.dicoding.picodiploma.mybottomnavigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dicoding.picodiploma.mybottomnavigation.model.Movie;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_MOVIE = "extra_movie";
    private TextView namaDetail, deskripsiDetail;
    private ImageView gambarDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        namaDetail = findViewById(R.id.detailNama);
        deskripsiDetail = findViewById(R.id.detailDeskripsi);
        gambarDetail = findViewById(R.id.detailGambar);

        Movie movie = getIntent().getParcelableExtra(EXTRA_MOVIE);
        String nama = movie.getNama();
        String deskripsi = movie.getDeskripsi();
        String gambar = movie.getGambar();

        namaDetail.setText(nama);
        deskripsiDetail.setText(deskripsi);

        Glide.with(getApplicationContext())
                .load(movie.getGambar().toString())
                .into(gambarDetail);

    }
}
