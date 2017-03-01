package app.rocketship.unibrand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MedicineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine);

        //TextView titleBar = new TextView();

        int pressed = getIntent().getIntExtra("pressed", 0);
        switch(pressed) {
            case 0: Log.d("MedicineActivity", "pressed bioequivalence"); break;
            case 1: Log.d("MedicineActivity", "pressed atorvax"); break;
        }

    }

    public void displayBioequivalence() {

    }

    public void displayAtorvax() {

    }

    public void displayGlicla() {

    }

    public void displayFelodipin() {

    }

    public void displayAzithro() {

    }

    public void displayLevofloxin() {

    }

    public void displayLevocet() {

    }
}
