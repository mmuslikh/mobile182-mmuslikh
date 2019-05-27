package id.codemerindu.amalankuu;

import android.app.AlarmManager;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.NotificationCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.Calendar;
//
//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity{
    Toolbar toolbar;
    DrawerLayout Drawer;
    NavigationView navigationView;
    FragmentManager fragmentManager;
    Fragment fragment = null;
    private static final int TIME_INTERVAL = 5000;
    private long backDitkn;
    int jam,menit,hari;
    final static int RQS_1 = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("AmalanKuu");


        // tampilan default awal ketika aplikasii dijalankan
        if (savedInstanceState == null) {
            fragment = new Root();
            callFragment(fragment);


        }

    }



    public void onBackPressed()
    {

        if(backDitkn + TIME_INTERVAL > System.currentTimeMillis())
        {
            super.onBackPressed();
            return;
        }else {
            Toast.makeText(getBaseContext(),"Tekan Sekali Lagi Untuk Keluar",Toast.LENGTH_SHORT).show();
        }
        backDitkn = System.currentTimeMillis();


    }


    private void callFragment(Fragment fragment)
    {
        fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.frame,fragment)
                .commit();
    }


}