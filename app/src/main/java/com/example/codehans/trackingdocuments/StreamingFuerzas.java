package com.example.codehans.trackingdocuments;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class StreamingFuerzas extends AppCompatActivity {

    private ImageView imageView_evento01;
    private ImageView imageView_evento02;
    private ImageView imageView_evenot03;
    private ImageView imageView_evento04;
    private ImageView imageView_evento05;
    private ImageView imageView_evento06;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_streaming_fuerzas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imageView_evento01 = (ImageView) findViewById(R.id.imgV_Live01);
        imageView_evento02 = (ImageView) findViewById(R.id.imgV_Live02);
        imageView_evenot03 = (ImageView) findViewById(R.id.imgV_Live03);
        imageView_evento04 = (ImageView) findViewById(R.id.imgV_Live04);
        imageView_evento05 = (ImageView) findViewById(R.id.imgV_Live05);
        imageView_evento06 = (ImageView) findViewById(R.id.imgV_Live06);

        Glide.with(getApplicationContext())
                .load("https://img.peru21.pe/files/ec_article_multimedia_gallery/uploads/2017/08/09/598b79f71e313.jpeg")
                .crossFade()
                .centerCrop()
                .into(imageView_evento01);
        Glide.with(getApplicationContext())
                //.load("https://pbs.twimg.com/media/DahCGtbX0AU2or3.jpg")
                .load("https://cde.peru.com//ima/0/1/5/9/0/1590748/611x458/peru.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_evento02);
        Glide.with(getApplicationContext())
                //.load("https://www.laprimera.pe/wp-content/uploads/2017/03/Inundaciones-en-Peru-1920-2-1024x575.jpg")
                .load("http://4.bp.blogspot.com/-w6ttNoSuoKo/UyKOm6tBXLI/AAAAAAAAEVc/BhiLbtoHA_I/s1600/11mar_ae_ayuda_04.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_evenot03);
        Glide.with(getApplicationContext())
                //.load("http://4.bp.blogspot.com/-w6ttNoSuoKo/UyKOm6tBXLI/AAAAAAAAEVc/BhiLbtoHA_I/s1600/11mar_ae_ayuda_04.jpg")
                .load("https://www.laprimera.pe/wp-content/uploads/2017/03/Inundaciones-en-Peru-1920-2-1024x575.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_evento04);
        Glide.with(getApplicationContext())
                .load("http://www.cronicaviva.com.pe/wp-content/uploads/2017/03/desastre11.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_evento05);
        Glide.with(getApplicationContext())
                .load("https://img.elcomercio.pe/files/article_content_ec_fotos/uploads/2017/03/21/58d1cfc2397c2.jpeg")
                .crossFade()
                .centerCrop()
                .into(imageView_evento06);

        imageView_evento01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), LiveStreamingActivity.class);
                i.putExtra("USERLIVE", 1);
                startActivity(i);
            }
        });
        imageView_evento02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), LiveStreamingActivity.class);
                i.putExtra("USERLIVE", 2);
                startActivity(i);
            }
        });
        imageView_evenot03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), LiveStreamingActivity.class);
                i.putExtra("USERLIVE", 7);
                startActivity(i);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
