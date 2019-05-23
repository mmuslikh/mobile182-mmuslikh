package id.codemerindu.amalankuu;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.text.Layout;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class pagi extends AppCompatActivity implements View.OnClickListener {

    Button next,prev,cUp,res;
    TextView sCount,tvArti,tvArab,tvKet;
    private int mCount = 0;
    private int i=1 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagi);
        setTitle("Dzikir Pagi");

        sCount = (TextView) findViewById(R.id.sCount);

        String[] pagi = getResources().getStringArray(R.array.pagi);
        String[] ket = getResources().getStringArray(R.array.ketp);
        String[] arti = getResources().getStringArray(R.array.artip);
        tvArab = (TextView) findViewById(R.id.arab);
        tvArti = (TextView) findViewById(R.id.arti);
        tvKet= (TextView) findViewById(R.id.ket);
        next = (Button) findViewById(R.id.next);
        prev = (Button) findViewById(R.id.prev);
        cUp = (Button) findViewById(R.id.cup) ;
        res = (Button) findViewById(R.id.res);

        next.setOnClickListener(this);
        prev.setOnClickListener(this);
        cUp.setOnClickListener(this);
        res.setOnClickListener(this);


        tvArab.setText(pagi[1]);
        tvArti.setText(arti[1]);
        tvKet.setText(ket[1]);
        prev.setEnabled(false);


    }

    public void onClick(View v)
    {

        String[] pagi = getResources().getStringArray(R.array.pagi);
        String[] ket = getResources().getStringArray(R.array.ketp);
        String[] arti = getResources().getStringArray(R.array.artip);
        if (v == next)
        {
//            int h = Integer.parseInt(sCount.getText().toString());

//            if (sCount != null )
//            {   mCount =0;
//                sCount.setText(Integer.toString(mCount));
//            }

            i++;
            tvArab.setText(pagi[i]);
            tvArti.setText(arti[i]);
            tvKet.setText(ket[i]);
            if (i == 21){

                Toast.makeText(this, "Sudah Berada Di Akhir", Toast.LENGTH_SHORT).show();

                next.setEnabled(false);
            }else if (i <= 21 ){
                next.setEnabled(true);
                prev.setEnabled(true);
            }
        }else if (v == prev)
        {

            i--;
            tvArab.setText(pagi[i]);
            tvArti.setText(arti[i]);
            tvKet.setText(ket[i]);
            if (i == 1){
                Toast.makeText(this,"Sudah Berada Di Awal",Toast.LENGTH_SHORT).show();
                prev.setEnabled(false);
            }else if (i >= 1){
                prev.setEnabled(true);
                next.setEnabled(true);
            }
        }
        else if (v == cUp)
        {
          //  Vibrator vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

            mCount ++;
            if (sCount  != null)
            {
                sCount.setText(Integer.toString(mCount));
//                if (Build.VERSION.SDK_INT >= 26)
//                {
//                    vibrator.vibrate(VibrationEffect.createOneShot(200, VibrationEffect.DEFAULT_AMPLITUDE));
//                }else {
//                    vibrator.vibrate(200);
//                }
            }
        }else if(v == res)
        {
            if (sCount != null )
            {   mCount=0;
                sCount.setText(Integer.toString(mCount));
            }
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);

    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId() == R.id.night)
        {
            int mode = AppCompatDelegate.getDefaultNightMode();
            if(mode == AppCompatDelegate.MODE_NIGHT_YES)
            {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            }else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
            startActivity(new Intent(pagi.this, pagi.class));
            finish();
        }
        return super.onOptionsItemSelected(item);

    }
}