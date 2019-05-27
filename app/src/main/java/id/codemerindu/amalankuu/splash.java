package id.codemerindu.amalankuu;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class splash extends AppCompatActivity{

    TextView tvSplash;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        tvSplash = (TextView) findViewById(R.id.loading);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity (new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        }, 3000L);
    }

}
