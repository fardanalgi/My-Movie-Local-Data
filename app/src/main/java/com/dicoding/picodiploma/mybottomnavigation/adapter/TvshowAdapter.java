package com.dicoding.picodiploma.mybottomnavigation.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.picodiploma.mybottomnavigation.DetailTv_Activity;
import com.dicoding.picodiploma.mybottomnavigation.R;
import com.dicoding.picodiploma.mybottomnavigation.model.TvShow;

import java.util.ArrayList;

public class TvshowAdapter extends RecyclerView.Adapter<TvshowAdapter.ListViewHolder> {

    private ArrayList<TvShow> listTv;
    private Context context;
    private OnItemClickCallbackTv onItemClickCallbackTv;

    public void setOnItemClickCallbackTv(OnItemClickCallbackTv onItemClickCallbackTv) {
        this.onItemClickCallbackTv = onItemClickCallbackTv;

    }

    public TvshowAdapter(ArrayList<TvShow> listTv, Context context) {
        this.listTv = listTv;
        this.context = context;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_movie,viewGroup,false);


        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {

        TvShow tvShow = listTv.get(position);
        Glide.with(holder.itemView.getContext())
                .load(tvShow.getPhoto())
                .apply(new RequestOptions().override(500,500))
                .into(holder.imgpoto);

        holder.tvNama.setText(tvShow.getJudul());
        holder.tvDeskripsi.setText(tvShow.getDeskripsiTv());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallbackTv.onItemClicked(listTv.get(holder.getAdapterPosition()));

                Intent intent= new Intent(context, DetailTv_Activity.class);
                intent.putExtra(DetailTv_Activity.EXTRA_TV,listTv.get(position));
                context.startActivity(intent);
            }
        });

        return;

    }

    @Override
    public int getItemCount() {
        return listTv.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

        TextView tvNama, tvDeskripsi;
        ImageView imgpoto;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNama = itemView.findViewById(R.id.nama_id);
            tvDeskripsi = itemView.findViewById(R.id.deskrips_id);
            imgpoto = itemView.findViewById(R.id.gambar_id);

        }
    }

    public interface OnItemClickCallbackTv{
        void onItemClicked(TvShow tvShow);
    }
}
