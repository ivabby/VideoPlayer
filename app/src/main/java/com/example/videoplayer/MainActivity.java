package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = (VideoView) findViewById(R.id.videoView);

        //  Set video path
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video);

        //  Adding controls to video
        MediaController mediaController = new MediaController(this);

        //  Displays start stop pause controls to the video
        videoView.setMediaController(mediaController);

        //  Play the video
        videoView.start();
    }
}
