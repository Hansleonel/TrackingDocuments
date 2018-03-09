package com.example.codehans.trackingdocuments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsDetalleActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private String tituloMapa = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_detalle);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map_predio_detalle);
        mapFragment.getMapAsync(this);

        Intent i = getIntent();
        tituloMapa = i.getStringExtra("titulo");

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                  //      .setAction("Action", null).show();
                calling_predios();
            }
        });
    }

    private void calling_predios() {
        String dial = "tel:" + 946568635;
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.parse(dial)));
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng lima01 = new LatLng(-12.06706222454296, -77.03626692295074);
        mMap.addMarker(new MarkerOptions().position(lima01).title(tituloMapa)).setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_location));
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(lima01, 15);
        mMap.moveCamera(cameraUpdate);

    }
}
