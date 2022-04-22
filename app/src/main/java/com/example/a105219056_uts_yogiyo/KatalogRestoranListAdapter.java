package com.example.a105219056_uts_yogiyo;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class KatalogRestoranListAdapter extends RecyclerView.Adapter<KatalogRestoranListAdapter.KatalogRestoranViewholder>{

    private LayoutInflater mInflater;

    public KatalogRestoranListAdapter(Context context) {mInflater = LayoutInflater.from(context);}

    @NonNull
    @Override
    public KatalogRestoranViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.katalog_list_restoran, parent, false);
        return new KatalogRestoranViewholder(itemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull KatalogRestoranViewholder holder, int position) {
        KatalogRestoran katalogRestoran = KatalogRestoranUtil.getKatalogFotoAt(position);
        holder.ivKatalogFoto.setImageResource(katalogRestoran.getResID());
        holder.tvNamaRestoran.setText(katalogRestoran.getFilename());
        holder.tvRatingRestoran.setText(Double.toString(katalogRestoran.getRatingResto()));
        holder.tvWaktuPengiriman.setText(katalogRestoran.getWaktuResto());
        holder.tvJarakPengiriman.setText(katalogRestoran.getJarakResto());
        holder.tvBiayaPengiriman.setText(katalogRestoran.getBiayaKirimResto());
        holder.tvRingkasanMenu.setText(katalogRestoran.getRingkasanMenuResto());
        holder.tvJumlahRating.setText(Integer.toString(katalogRestoran.getJumlahRatingResto()));
    }

    @Override
    public int getItemCount() {
        return KatalogRestoranUtil.getKatalogRestoranList().size();
    }

    public class KatalogRestoranViewholder extends RecyclerView.ViewHolder {

        final ImageView ivKatalogFoto;
        final TextView tvNamaRestoran;
        final TextView tvRatingRestoran;
        final ImageView ivRating;
        final TextView tvWaktuPengiriman;
        final TextView tvJarakPengiriman;
        final TextView tvBiayaPengiriman;
        final TextView tvRingkasanMenu;
        final TextView tvJumlahRating;

        private KatalogRestoranListAdapter mAdapter;

        public KatalogRestoranViewholder(@NonNull View itemView, KatalogRestoranListAdapter _mAdapter) {
            super(itemView);
            mAdapter = _mAdapter;

            ivKatalogFoto = itemView.findViewById(R.id.iv_foto_restoran);
            tvNamaRestoran = itemView.findViewById(R.id.tv_nama_restoran);
            tvRatingRestoran = itemView.findViewById(R.id.tv_rating_restoran);
            ivRating = itemView.findViewById(R.id.iv_icon_bintang);
            tvWaktuPengiriman = itemView.findViewById(R.id.tv_waktu_pengiriman);
            tvJarakPengiriman = itemView.findViewById(R.id.tv_jarak_pengiriman);
            tvBiayaPengiriman = itemView.findViewById(R.id.tv_biaya_pengiriman);
            tvRingkasanMenu = itemView.findViewById(R.id.tv_ringkasan_menu);
            tvJumlahRating = itemView.findViewById(R.id.tv_jumlah_review_resto);

        }

    }

}
