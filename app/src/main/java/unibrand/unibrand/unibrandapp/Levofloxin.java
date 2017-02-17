package unibrand.unibrand.unibrandapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Levofloxin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levofloxin);
    }

    @Override
    public void onBackPressed() {
        Intent back = new Intent(Levofloxin.this, MainActivity.class);
        startActivity(back);
        finish();
    }
}
