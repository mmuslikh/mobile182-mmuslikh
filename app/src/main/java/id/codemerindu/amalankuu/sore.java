package id.codemerindu.amalankuu;

import android.content.Intent;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class sore extends AppCompatActivity implements View.OnClickListener {
    Button next, prev, cUp, res, bFont, pop;
    TextView sCount, tvArti, tvArab, tvKet;
    private int mCount = 0;
    private int i = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sore);
        setTitle("Dzikir Sore");

        sCount = (TextView) findViewById(R.id.sCount);



        String[] sore = getResources().getStringArray(R.array.sore);
        String[] ket = getResources().getStringArray(R.array.ketp);
        String[] arti = getResources().getStringArray(R.array.artis);
        tvArab = (TextView) findViewById(R.id.arab);
        tvArti = (TextView) findViewById(R.id.arti);
        tvKet = (TextView) findViewById(R.id.ket);
        next = (Button) findViewById(R.id.next);
        prev = (Button) findViewById(R.id.prev);
        cUp = (Button) findViewById(R.id.cup);
        res = (Button) findViewById(R.id.res);

        next.setOnClickListener(this);
        prev.setOnClickListener(this);
        cUp.setOnClickListener(this);
        res.setOnClickListener(this);


        tvArab.setText(sore[1]);
        tvArti.setText(arti[1]);
        tvKet.setText(ket[1]);
        prev.setEnabled(false);


    }

    public void onClick(View v) {

        String[] sore = getResources().getStringArray(R.array.sore);
        String[] ket = getResources().getStringArray(R.array.ketp);
        String[] arti = getResources().getStringArray(R.array.artis);
        if (v == next) {
//            int h = Integer.parseInt(sCount.getText().toString());

//            if (sCount != null )
//            {   mCount =0;
//                sCount.setText(Integer.toString(mCount));
//            }

            i++;
            tvArab.setText(sore[i]);
            tvArti.setText(arti[i]);
            tvKet.setText(ket[i]);
            if (i == 21) {

                Toast.makeText(this, "Sudah Berada Di Akhir", Toast.LENGTH_SHORT).show();

                next.setEnabled(false);
            } else if (i <= 21) {
                next.setEnabled(true);
                prev.setEnabled(true);
            }
        } else if (v == prev) {

            i--;
            tvArab.setText(sore[i]);
            tvArti.setText(arti[i]);
            tvKet.setText(ket[i]);
            if (i == 1) {
                Toast.makeText(this, "Sudah Berada Di Awal", Toast.LENGTH_SHORT).show();
                prev.setEnabled(false);
            } else if (i >= 0) {
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
    public boolean onCreateOptionsMenu (Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
//        if (item.getItemId() == R.id.setFont) {
//            Intent intent = new Intent(this, setFont.class);
//            startActivity(intent);
//
//        }
        return onOptionsItemSelected(item);
    }
}
