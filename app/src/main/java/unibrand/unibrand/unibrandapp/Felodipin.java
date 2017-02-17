package unibrand.unibrand.unibrandapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Felodipin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_felodipin);
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(Felodipin.this, MainActivity.class);
        startActivity(back);
        finish();
    }
}
