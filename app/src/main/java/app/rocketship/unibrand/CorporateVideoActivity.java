package app.rocketship.unibrand;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import app.rocketship.unibrand.MainActivity;
import app.rocketship.unibrand.R;

public class CorporateVideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corporate_video);

        String path = "android.resource://" + getPackageName() + "/" + R.raw.natrapharmvid;
        VideoView vid = (VideoView) findViewById(R.id.videoView2);
        //Uri uri = Uri.parse(path);
        //vid.setVideoURI(uri);
        vid.setVideoPath(path);
        vid.setMediaController(new MediaController(this));
        //mVideoView.requestFocus();
        vid.start();

        vid.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Intent in = new Intent(CorporateVideoActivity.this, MainActivity.class);
                startActivity(in);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(CorporateVideoActivity.this, MainActivity.class);
        startActivity(back);
        finish();
    }

}
