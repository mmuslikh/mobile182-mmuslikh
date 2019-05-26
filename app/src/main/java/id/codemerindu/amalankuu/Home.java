package id.codemerindu.amalankuu;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class Home extends Fragment {

    public Home(){}
    RelativeLayout view;

    public View onCreateView (LayoutInflater inflater, ViewGroup container , Bundle savedInstanceState)
    {
        view = (RelativeLayout) inflater.inflate(R.layout.home,container,false);
        getActivity().setTitle("Baca Qur'an");

        Log.e("Baca Qur'an ", "Baca Qur'an");
        return  view;
    }
}
