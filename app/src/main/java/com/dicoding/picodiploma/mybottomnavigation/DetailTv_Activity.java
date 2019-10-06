package com.dicoding.picodiploma.mybottomnavigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dicoding.picodiploma.mybottomnavigation.model.TvShow;

public class DetailTv_Activity extends AppCompatActivity {

    public static final String EXTRA_TV = "extra_tv";
    private TextView namaDetail, deskripsiDetail;
    private ImageView gambarDetail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tv_);

        namaDetail = findViewById(R.id.detailJudul_tv);
        deskripsiDetail = findViewById(R.id.detailDeskripsi_tv);
        gambarDetail = findViewById(R.id.detailGambar_tv);

        TvShow tvShow = getIntent().getParcelableExtra(EXTRA_TV);
        String nama = tvShow.getJudul();
        String deskripsi = tvShow.getDeskripsiTv();

        namaDetail.setText(nama);
        deskripsiDetail.setText(deskripsi);

        Glide.with(getApplicationContext())
                .load(tvShow.getPhoto().toString())
                .into(gambarDetail);

    }
}
