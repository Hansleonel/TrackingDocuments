package com.example.codehans.trackingdocuments;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MinisterioActivity extends AppCompatActivity {

    private ImageView imageView_AgendaMindef,imageView_AgendaMindef2,imageView_AgendaMindef3,imageView_AgendaMindef4,imageView_AgendaMindef5,imageView_AgendaMindef6
            ,imageView_AgendaMindef7,imageView_AgendaMindef8,imageView_AgendaMindef9,imageView_AgendaMindef10,imageView_AgendaMindef11,imageView_AgendaMindef12
            ,imageView_AgendaMindef13,imageView_AgendaMindef14,imageView_AgendaMindef15,imageView_AgendaMindef16,imageView_AgendaMindef17,imageView_AgendaMindef18
            ,imageView_AgendaMindef19,imageView_AgendaMindef20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ministerio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imageView_AgendaMindef = (ImageView) findViewById(R.id.imgV_AgendaMindef);
        imageView_AgendaMindef2 = (ImageView) findViewById(R.id.imgV_AgendaMindef2);
        imageView_AgendaMindef3 = (ImageView) findViewById(R.id.imgV_AgendaMindef3);
        imageView_AgendaMindef4 = (ImageView) findViewById(R.id.imgV_AgendaMindef4);
        imageView_AgendaMindef5 = (ImageView) findViewById(R.id.imgV_AgendaMindef5);
        imageView_AgendaMindef6 = (ImageView) findViewById(R.id.imgV_AgendaMindef6);
        imageView_AgendaMindef7 = (ImageView) findViewById(R.id.imgV_AgendaMindef7);
        imageView_AgendaMindef8 = (ImageView) findViewById(R.id.imgV_AgendaMindef8);
        imageView_AgendaMindef9 = (ImageView) findViewById(R.id.imgV_AgendaMindef9);
        imageView_AgendaMindef10 = (ImageView) findViewById(R.id.imgV_AgendaMindef10);
        imageView_AgendaMindef11 = (ImageView) findViewById(R.id.imgV_AgendaMindef11);
        imageView_AgendaMindef12 = (ImageView) findViewById(R.id.imgV_AgendaMindef12);
        imageView_AgendaMindef13 = (ImageView) findViewById(R.id.imgV_AgendaMindef13);
        imageView_AgendaMindef14 = (ImageView) findViewById(R.id.imgV_AgendaMindef14);
        imageView_AgendaMindef15 = (ImageView) findViewById(R.id.imgV_AgendaMindef15);
        imageView_AgendaMindef16 = (ImageView) findViewById(R.id.imgV_AgendaMindef16);
        imageView_AgendaMindef17 = (ImageView) findViewById(R.id.imgV_AgendaMindef17);
        imageView_AgendaMindef18 = (ImageView) findViewById(R.id.imgV_AgendaMindef18);
        imageView_AgendaMindef19 = (ImageView) findViewById(R.id.imgV_AgendaMindef19);
        imageView_AgendaMindef20 = (ImageView) findViewById(R.id.imgV_AgendaMindef20);

        Glide.with(getApplicationContext())
                .load("https://www.mindef.gob.pe/informacion/noticias/img-jpg/np_3827_20180312001721.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_AgendaMindef);
        Glide.with(getApplicationContext())
                .load("http://www.mindef.gob.pe/informacion/noticias/img-jpg/album_1261_10192.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_AgendaMindef2);
        Glide.with(getApplicationContext())
                .load("http://www.mindef.gob.pe/informacion/noticias/img-jpg/album_1260_10181.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_AgendaMindef3);
        Glide.with(getApplicationContext())
                .load("http://www.mindef.gob.pe/informacion/noticias/img-jpg/album_1217_10011.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_AgendaMindef4);
        Glide.with(getApplicationContext())
                .load("https://www.mindef.gob.pe/informacion/noticias/img-jpg/np_3826_20180308222841.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_AgendaMindef5);
        Glide.with(getApplicationContext())
                .load("https://www.mindef.gob.pe/informacion/noticias/img-jpg/np_3827_20180312001721.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_AgendaMindef6);
        Glide.with(getApplicationContext())
                .load("https://www.mindef.gob.pe/informacion/noticias/img-jpg/np_3825_20180308002056.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_AgendaMindef7);
        Glide.with(getApplicationContext())
                .load("http://www.mindef.gob.pe/informacion/noticias/img-jpg/album_1261_10197.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_AgendaMindef8);
        Glide.with(getApplicationContext())
                .load("http://www.mindef.gob.pe/informacion/noticias/img-jpg/album_1217_10012.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_AgendaMindef9);
        Glide.with(getApplicationContext())
                .load("http://www.mindef.gob.pe/informacion/noticias/img-jpg/album_1260_10183.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_AgendaMindef10);
        Glide.with(getApplicationContext())
                .load("http://www.mindef.gob.pe/informacion/noticias/img-jpg/album_1260_10189.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_AgendaMindef11);
        Glide.with(getApplicationContext())
                .load("http://www.mindef.gob.pe/informacion/noticias/img-jpg/album_1260_10184.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_AgendaMindef12);
        Glide.with(getApplicationContext())
                .load("https://www.mindef.gob.pe/informacion/noticias/img-jpg/np_3827_20180312001721.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_AgendaMindef13);
        Glide.with(getApplicationContext())
                .load("https://www.mindef.gob.pe/informacion/noticias/img-jpg/np_3827_20180312001721.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_AgendaMindef14);
        Glide.with(getApplicationContext())
                .load("https://www.mindef.gob.pe/informacion/noticias/img-jpg/np_3827_20180312001721.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_AgendaMindef15);
        Glide.with(getApplicationContext())
                .load("https://www.mindef.gob.pe/informacion/noticias/img-jpg/np_3827_20180312001721.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_AgendaMindef16);
        Glide.with(getApplicationContext())
                .load("https://www.mindef.gob.pe/informacion/noticias/img-jpg/np_3827_20180312001721.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_AgendaMindef17);
        Glide.with(getApplicationContext())
                .load("https://www.mindef.gob.pe/informacion/noticias/img-jpg/np_3827_20180312001721.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_AgendaMindef18);
        Glide.with(getApplicationContext())
                .load("https://www.mindef.gob.pe/informacion/noticias/img-jpg/np_3827_20180312001721.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_AgendaMindef19);
        Glide.with(getApplicationContext())
                .load("https://www.mindef.gob.pe/informacion/noticias/img-jpg/np_3827_20180312001721.jpg")
                .crossFade()
                .centerCrop()
                .into(imageView_AgendaMindef20);


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
