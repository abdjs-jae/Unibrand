package unibrand.unibrand.unibrandapp;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import unibrand.unibrand.unibrandapp.users.DataHandler;
import unibrand.unibrand.unibrandapp.util.PageHandler;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataHandler.setCurrentContext(this);

        ListView list = (ListView)findViewById(R.id.mainListView);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent in;
                //if(position < 7) {
                //    in = new Intent(MainActivity.this, MedicineActivity.class);
                //    in.putExtra("pressed", position);
                //} else {
                //    in = new Intent(MainActivity.this, CorporateVideoActivity.class);
                //}

                switch(position) {
                    case 0:
                        in = new Intent(MainActivity.this, Bioequivalence.class);
                        DataHandler.savePageClick(PageHandler.Page.BIOEQUIVALENCE.getKey());
                        break;
                    case 1:
                        in = new Intent(MainActivity.this, Atorvast.class);
                        DataHandler.savePageClick(PageHandler.Page.ATROVAST.getKey());
                        break;
                    case 2:
                        in = new Intent(MainActivity.this, Glicla.class);
                        DataHandler.savePageClick(PageHandler.Page.GLICLA.getKey());
                        break;
                    case 3:
                        in = new Intent(MainActivity.this, Felodipin.class);
                        DataHandler.savePageClick(PageHandler.Page.FELODIPIN.getKey());
                        break;
                    case 4:
                        in = new Intent(MainActivity.this, Azithro.class);
                        DataHandler.savePageClick(PageHandler.Page.AZITHRO.getKey());
                        break;
                    case 5:
                        in = new Intent(MainActivity.this, Levofloxin.class);
                        DataHandler.savePageClick(PageHandler.Page.LEVOFLOXIN.getKey());
                        break;
                    case 6:
                        in = new Intent(MainActivity.this, Levocet.class);
                        DataHandler.savePageClick(PageHandler.Page.LEVOCET.getKey());
                        break;
                    default:
                        in = new Intent(MainActivity.this, CorporateVideoActivity.class);
                        DataHandler.savePageClick(PageHandler.Page.CORPORATE_VIDEO.getKey());
                }

                startActivity(in);
                finish();
            }
        });
    }
}
