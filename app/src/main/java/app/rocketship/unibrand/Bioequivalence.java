package app.rocketship.unibrand;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Bioequivalence extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bioequivalence);
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(Bioequivalence.this, MainActivity.class);
        startActivity(back);
        finish();
    }
}
