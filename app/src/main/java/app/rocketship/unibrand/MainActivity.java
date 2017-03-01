package app.rocketship.unibrand;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import app.rocketship.natrapharmutil.DataHandler;
import app.rocketship.unibrand.util.PageHandler;


public class MainActivity extends AppCompatActivity {

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
