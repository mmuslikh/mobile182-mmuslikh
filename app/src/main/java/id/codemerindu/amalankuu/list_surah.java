package id.codemerindu.amalankuu;


import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
//implements AdapterView.OnItemClickListener

public class list_surah extends AppCompatActivity implements View.OnClickListener
{

    Button btn1,btn2,btn3,btn4,btn5,alfatihah,albaqarah;
    EditText ed1,ed2;
    public static final int NOTIF_ID = 1;
    PendingIntent pendingIntent;
    private static  final int ALARM_REQUEST_CODE = 134;
    private int interval = 2;
    private Switch aSwitch;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_surah);



        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        alfatihah = (Button) findViewById(R.id.alfatihah);
        albaqarah = (Button) findViewById(R.id.albaqarah);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        alfatihah.setOnClickListener(this);
        albaqarah.setOnClickListener(this);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.quran,menu);
        MenuItem item = menu.findItem(R.id.cari);
        setTitle("Al-Qura'an Digital");
//        SearchView searchView = (SearchView)item.getActionView();
//
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                return false;
//            }
//        });
        return super.onCreateOptionsMenu(menu);
    }

    public void onClick(View v)
    {
        if (v == btn2)
        {
            Intent intent = new Intent(this, AlQuran.class);
            String[] tarab = getResources().getStringArray(R.array.Alwaqia);
            String[] tarti = getResources().getStringArray(R.array.AlwaqiaArti);

            String title = "Surah : Al Waaqiah";
            intent.putExtra("arab",tarab);
            intent.putExtra("arti",tarti);
            intent.putExtra("title",title);
            startActivity(intent);

        }else if (v == btn1)
        {
            Intent intent = new Intent(this, AlQuran.class);
            String[] tarab = getResources().getStringArray(R.array.Arrahman);
            String[] tarti = getResources().getStringArray(R.array.ArrahmanArti);

            String title = "Surah : Ar Rahman";
            intent.putExtra("arab",tarab);
            intent.putExtra("arti",tarti);
            intent.putExtra("title",title);
            startActivity(intent);
        }else if (v == btn3)
        {

            Intent intent = new Intent(this, AlQuran.class);
            String[] tarab = getResources().getStringArray(R.array.Almulk);
            String[] tarti = getResources().getStringArray(R.array.AlmulkArti);

            String title = "Surah : Al Mulk";
            intent.putExtra("arab",tarab);
            intent.putExtra("arti",tarti);
            intent.putExtra("title",title);
            startActivity(intent);
        }else if (v == btn4)
        {
            Intent intent = new Intent(this, AlQuran.class);
            String[] tarab = getResources().getStringArray(R.array.yasin);
            String[] tarti = getResources().getStringArray(R.array.YasinArti);

            String title = "Surah : Yaasin";
            intent.putExtra("arab",tarab);
            intent.putExtra("arti",tarti);
            intent.putExtra("title",title);
            startActivity(intent);
        }
        else if (v == btn5)
        {
            Intent intent = new Intent(this, AlQuran.class);
            String[] tarab = getResources().getStringArray(R.array.imron);
            String[] tarti = getResources().getStringArray(R.array.AlimronArti);


            String title = "Surah : Al-Imron";
            intent.putExtra("arab",tarab);
            intent.putExtra("arti",tarti);
            intent.putExtra("title",title);
            startActivity(intent);
        }
        else if (v == alfatihah)
        {
            Intent intent = new Intent(this, AlQuran.class);
            String[] tarab = getResources().getStringArray(R.array.alfatihah);
            String[] tarti = getResources().getStringArray(R.array.AlfatihahArti);

            String title = "Surah : Al-Fatihah";
            intent.putExtra("arab",tarab);
            intent.putExtra("arti",tarti);
            intent.putExtra("title",title);
            startActivity(intent);
        }
        else if (v == albaqarah)
        {
            Intent intent = new Intent(this, AlQuran.class);
            String[] tarab = getResources().getStringArray(R.array.albaqarah);
            String[] tarti = getResources().getStringArray(R.array.AlbaqarahArti);

            String title = "Surah : Al-Fatihah";
            intent.putExtra("arab",tarab);
            intent.putExtra("arti",tarti);
            intent.putExtra("title",title);
            startActivity(intent);
        }
    }

}
