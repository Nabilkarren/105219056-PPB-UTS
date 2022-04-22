package com.example.a105219056_uts_yogiyo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private RecyclerView rvKatalogRestoran;
    private KatalogRestoranListAdapter adapter;
    private LinearLayout llRestoran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        KatalogRestoranUtil.init();

        rvKatalogRestoran = findViewById(R.id.rv_katalog_restoran);
        adapter = new KatalogRestoranListAdapter(this);

        rvKatalogRestoran.setOnClickListener(this);

        rvKatalogRestoran.setAdapter(adapter);
        rvKatalogRestoran.setLayoutManager(new LinearLayoutManager(this));

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.ll_list_restoran:
                Intent gantiHalaman = new Intent(this, RestoranDetailActivity.class);
                startActivity(gantiHalaman);
                break;
        }
    }

}