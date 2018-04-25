package com.example.codehans.trackingdocuments;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class AgendaMinisterialActivity extends AppCompatActivity {

    private ImageView imageView_evento01;
    private ImageView imageView_evento02;
    private ImageView imageView_evenot03;
    private ImageView imageView_evento04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda_ministerial);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        toolbar.setTitle("Agenda Ministerial");
        setSupportActionBar(toolbar);

        imageView_evento01 = (ImageView) findViewById(R.id.imgV_Live01);
        imageView_evento02 = (ImageView) findViewById(R.id.imgV_Live02);
        imageView_evenot03 = (ImageView) findViewById(R.id.imgV_Live03);
        imageView_evento04 = (ImageView) findViewById(R.id.imgV_Live04);

        Glide.with(getApplicationContext())
                .load("https://pbs.twimg.com/media/Dagk08pXkAAEor-.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_evento01);
        Glide.with(getApplicationContext())
                .load("https://i.ytimg.com/vi/nLjV1GDETKQ/maxresdefault.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_evento02);
        Glide.with(getApplicationContext())
                .load("https://img.elcomercio.pe/files/ec_article_multimedia_gallery/uploads/2017/03/29/58db6fe9441e1.jpeg")
                .crossFade()
                .centerCrop()
                .into(imageView_evenot03);
        Glide.with(getApplicationContext())
                .load("http://www.defensa.com/adjuntos/stories/noticias/2014/05/kamaz%2063501%208x8.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_evento04);

        imageView_evento01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MinisterioActivity.class);
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
