package id.codemerindu.amalankuu;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class adapter_quran extends ArrayAdapter<String> {


    private final Activity context;
    private final String[] tarab;
    private final String[] tarti;


    public adapter_quran(Activity context, String[] tarab, String[] tarti)
    {
        super(context, R.layout.tquran,tarab);
       this.context = context;
       this.tarab = tarab;
       this.tarti = tarti;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent)
    {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.tquran,null,true);

        TextView tvarab = (TextView)rowView.findViewById(R.id.arab);
        TextView tvarti = (TextView)rowView.findViewById(R.id.arti);

        tvarab.setText(tarab[position]);
        tvarti.setText(tarti[position]);

        return rowView;
    }
}
