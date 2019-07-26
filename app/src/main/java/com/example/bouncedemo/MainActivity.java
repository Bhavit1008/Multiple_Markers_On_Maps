package com.example.bouncedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class MainActivity extends AppCompatActivity
        implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_main);
        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        LatLng sydney = new LatLng(-33.852, 151.211);
        googleMap.addMarker(new MarkerOptions().position(sydney)
                .title("Sydney 35% demand"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));


        LatLng udaipur = new LatLng(24.5854,73.7125);
        googleMap.addMarker(new MarkerOptions().position(udaipur)
        .title("Udaipur 45% demand"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(udaipur));


        LatLng banglore = new LatLng(12.9716,77.5946);
        googleMap.addMarker(new MarkerOptions().position(banglore)
                .title("Banglore 25% demand"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(banglore));


        LatLng bay_back_usa = new LatLng(42.35077,-71.0810);
        googleMap.addMarker(new MarkerOptions().position(bay_back_usa)
                .title("Back Bay USA 55% demand"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(bay_back_usa));

    }
}