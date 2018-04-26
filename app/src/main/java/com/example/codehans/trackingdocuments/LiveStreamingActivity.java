package com.example.codehans.trackingdocuments;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.VideoView;

public class LiveStreamingActivity extends AppCompatActivity {

    private VideoView videoView;
    private AudioManager audioManager;
    private Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_streaming);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Intent i = getIntent();
        Integer video = i.getIntExtra("USERLIVE", 1);

        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);

        videoView = (VideoView) findViewById(R.id.videoView_01);
        uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.one);
        if (video == 1) {
            uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.one);
        } else if (video == 2) {
            uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.two);
        } else if (video == 7) {
            uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.three);
        }

        videoView.setVideoURI(uri);
        videoView.start();
        audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, 2, 0);
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "El ejercito del peru realizando trabajos de Rescate en VIVO", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

}
