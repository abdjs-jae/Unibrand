package app.rocketship.unibrand;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

import app.rocketship.natrapharmutil.ActivityHandler;
import app.rocketship.natrapharmutil.LandingActivity;


public class UnibrandVideoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unibrand_video);

        String path = "android.resource://" + getPackageName() + "/" + R.raw.unibrand;
        //Log.d("UnibrandVideoActivity", "path = " + path);
        VideoView vid = (VideoView)findViewById(R.id.videoView);
        //vid.setMediaController(new MediaController(UnibrandVideoActivity.this));
        //Uri uri = Uri.parse(path);
       // vid.setVideoURI(uri);
        vid.setVideoPath(path);
        vid.requestFocus();
        vid.start();

        final Activity a = this;

        vid.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                ActivityHandler.afterSplashActivity(a, RegisterActivity.class, MainActivity.class);

            }
        });
    }
}
