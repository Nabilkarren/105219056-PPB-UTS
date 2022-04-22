package com.example.a105219056_uts_yogiyo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class RestoranDetailActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton backButton;
    private Button shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_restoran);

        backButton = findViewById(R.id.btn_detail_back);
        backButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });

        shareButton = findViewById(R.id.btn_share);
        shareButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn_share:
                Toast.makeText(getApplicationContext(),"Shared", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}