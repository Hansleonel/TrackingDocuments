package com.example.codehans.trackingdocuments;

import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.bumptech.glide.Glide;

public class DocumentoActivity extends AppCompatActivity {

    private LinearLayout linearLayout;
    private ProgressBar progressBar_01;
    private ImageView imageView_doc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documento);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setTitle("Ver Documento");
        setSupportActionBar(toolbar);

        linearLayout = (LinearLayout) findViewById(R.id.content_document);
        progressBar_01 = (ProgressBar) findViewById(R.id.ProgressBar_02);
        imageView_doc = (ImageView) findViewById(R.id.ImageV_document);

        Glide.with(getApplicationContext())
                .load("http://s1.www.scan2docx.com/img/samples/document_scanner_sample_scan_01_zoom.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_doc);

        progressBar_01.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                linearLayout.setVisibility(View.VISIBLE);
                progressBar_01.setVisibility(View.GONE);
            }
        }, 2888);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Descargando Documento", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
