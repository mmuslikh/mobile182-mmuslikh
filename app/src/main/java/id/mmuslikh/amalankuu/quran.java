package id.codemerindu.amalankuu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class quran extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quran);

       ListView listView = (ListView)findViewById(R.id.listData);
       String title = this.getIntent().getExtras().getString("title");
       String[] tarab = this.getIntent().getExtras().getStringArray("arab");
        String[] tarti = this.getIntent().getExtras().getStringArray("arti");
       adapter_quran adapter = new adapter_quran(this,tarab,tarti);
       listView.setAdapter(adapter);
       setTitle(title);
    }
}
