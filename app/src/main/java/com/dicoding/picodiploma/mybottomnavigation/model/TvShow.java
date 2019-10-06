package com.dicoding.picodiploma.mybottomnavigation.model;

import android.os.Parcel;
import android.os.Parcelable;

public class TvShow implements Parcelable {

    private String judul;
    private String deskripsiTv;
    private String photo;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsiTv() {
        return deskripsiTv;
    }

    public void setDeskripsiTv(String deskripsiTv) {
        this.deskripsiTv = deskripsiTv;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.judul);
        dest.writeString(this.deskripsiTv);
        dest.writeString(this.photo);
    }

    public TvShow() {
    }

    protected TvShow(Parcel in) {
        this.judul = in.readString();
        this.deskripsiTv = in.readString();
        this.photo = in.readString();
    }

    public static final Parcelable.Creator<TvShow> CREATOR = new Parcelable.Creator<TvShow>() {
        @Override
        public TvShow createFromParcel(Parcel source) {
            return new TvShow(source);
        }

        @Override
        public TvShow[] newArray(int size) {
            return new TvShow[size];
        }
    };
}

