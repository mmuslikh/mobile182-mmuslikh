package id.codemerindu.amalankuu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AlQuran extends AppCompatActivity {

    String nama_surah,isiSurah;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quran);

        Intent intent = getIntent();
      nama_surah = intent.getStringExtra("namasurah");

        setQuran(nama_surah);
       setTitle(nama_surah);
    }

    public void setQuran(String surah){
        if(surah.equalsIgnoreCase("1) Surah Al-Fatihah - Pembukaan")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.alfatihah);
            String[] tarti = getResources().getStringArray(R.array.AlfatihahArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("2) Surah Al-Baqarah - Sapi Betina")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.albaqarah);
            String[] tarti = getResources().getStringArray(R.array.AlbaqarahArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("3) Surah Ali ‘Imran - Keluarga ‘Imran")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.imron);
            String[] tarti = getResources().getStringArray(R.array.AlimronArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("4) Surah An-Nisa’ - Wanita")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.imron);
            String[] tarti = getResources().getStringArray(R.array.AlimronArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }else if(surah.equalsIgnoreCase("5) Surah Al-Ma’idah - Jamuan (Hidangan Makanan)")){

            ListView listView = (ListView)findViewById(R.id.listData);
            String[] tarab = getResources().getStringArray(R.array.imron);
            String[] tarti = getResources().getStringArray(R.array.AlimronArti);
            adapter_quran adapter = new adapter_quran(this,tarab,tarti);
            listView.setAdapter(adapter);
        }
    }
}
