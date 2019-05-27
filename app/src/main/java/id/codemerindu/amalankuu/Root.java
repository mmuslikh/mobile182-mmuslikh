package id.codemerindu.amalankuu;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;



public class Root extends Fragment{


    public Root(){}
    RelativeLayout view;

    BottomNavigationView bottomNavigationView;



    public View onCreateView (LayoutInflater inflater, ViewGroup container , Bundle savedInstanceState)
    {
//        TextView jam = (TextView) view.findViewById(R.id.textView2);



        view = (RelativeLayout) inflater.inflate(R.layout.root,container,false);
        getActivity().setTitle("AmalanKuu");
        bottomNavigationView = (BottomNavigationView) view.findViewById(R.id.bottom);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.Dpagi:
                Intent Pintent = new Intent(getActivity(),pagi.class);
                getActivity().startActivity(Pintent);
                break;
            case R.id.Dsore:
                Intent Sintent = new Intent(getActivity(),sore.class);
                getActivity().startActivity(Sintent);
                break;
            case R.id.quran:
                Intent Qintent = new Intent(getActivity(),ListSurahActivity.class);
                getActivity().startActivity(Qintent);
                break;
            case R.id.jsholat:
                Toast.makeText(getActivity(),"Coming Soon",Toast.LENGTH_SHORT).show();
                break;
            case R.id.lainnya:
                    Toast.makeText(getActivity(),"Coming Soon",Toast.LENGTH_SHORT).show();
            break;


        }
        return true;
    }
});
//        AlQuran.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
////                Toast.makeText(getActivity(),"Coming Soon",Toast.LENGTH_SHORT).show();
//            }
//        });




        return  view;
    }
}