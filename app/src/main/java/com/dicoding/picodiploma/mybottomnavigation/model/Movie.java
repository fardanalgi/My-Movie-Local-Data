package com.dicoding.picodiploma.mybottomnavigation.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {

    private String nama;
    private String deskripsi;
    private String gambar;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.deskripsi);
        dest.writeString(this.gambar);
    }

    public Movie() {
    }

    protected Movie(Parcel in) {
        this.nama = in.readString();
        this.deskripsi = in.readString();
        this.gambar = in.readString();
    }

    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
