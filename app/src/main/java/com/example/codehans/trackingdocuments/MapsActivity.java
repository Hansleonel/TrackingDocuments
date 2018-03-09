package com.example.codehans.trackingdocuments;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Predios Ministeriales");
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        setSupportActionBar(toolbar);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-12.0431800, -77.0282400);
        LatLng lima = new LatLng(-12.066049550822289, -77.04109378151139);
        LatLng lima01 = new LatLng(-12.06706222454296, -77.03626692295074);
        LatLng lima02 = new LatLng(-12.0351039485598, -77.09689603441939);
        LatLng lima03 = new LatLng(-12.069406922635459, -77.09236489281602);
        LatLng lima04 = new LatLng(-12.044027801925372, -77.12027402023102);
        LatLng lima05 = new LatLng(-12.054275699186562, -77.14545834656417);
        LatLng lima06 = new LatLng(-12.094401218358204, -77.04822382836835);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Lima")).setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_location));
        mMap.addMarker(new MarkerOptions().position(lima).title("Ministerio de Defensa")).setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_location));
        mMap.addMarker(new MarkerOptions().position(lima01).title("Procuraduria MINDEF")).setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_location));
        mMap.addMarker(new MarkerOptions().position(lima02).title("Local Ministerial")).setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_location));
        mMap.addMarker(new MarkerOptions().position(lima03).title("Local MINDEF")).setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_location));
        mMap.addMarker(new MarkerOptions().position(lima04).title("Cuartel FF.AA.")).setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_location));
        mMap.addMarker(new MarkerOptions().position(lima05).title("Cuartel Marina de Guerra")).setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_location));
        mMap.addMarker(new MarkerOptions().position(lima06).title("Cuartel Ejercito del Peru")).setIcon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_location));
        CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(lima03, 12);
        mMap.moveCamera(cameraUpdate);

        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {
                String tituloMarker = marker.getTitle();
                Intent a = new Intent(MapsActivity.this, MapsDetalleActivity.class);
                a.putExtra("titulo",tituloMarker);
                startActivity(a);
                return false;
            }
        });
    }
}
