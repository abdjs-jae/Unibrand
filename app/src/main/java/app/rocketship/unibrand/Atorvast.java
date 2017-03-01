package app.rocketship.unibrand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Atorvast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atorvast);
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(Atorvast.this, MainActivity.class);
        startActivity(back);
        finish();
    }
}
