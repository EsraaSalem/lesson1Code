package com.example.android.sunshine.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> arrayAdapter;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] forecatsArray = {

                "Today - Sunny - 88/63",
                "Tomorrow - Foggy - 70/40",
                "Weds - Cloudy - 72/63",
                "Thurs - Asteroids - 75/63",
                "Fri - Heavy Rain - 65/56",
                "Sat - HELP TRAPPED IN WEATHERSTATION - 60/51",
                "Sun - Sunny - 80/68"

        };
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecatsArray));
        Toast.makeText(getActivity(), "AAAAAAAAAAAA",Toast.LENGTH_LONG);
        View rootView = inflater.inflate(R.layout.fragment_main, container,false);
         arrayAdapter = new ArrayAdapter<String>(
                getActivity(),
                //R.layout.list_item_forecast,
                 android.R.layout.simple_list_item_1,
                 R.id.list_item_forecast_textview,
                weekForecast);
        ListView lv = (ListView) rootView.findViewById(R.id.listview_forecast);
        lv.setAdapter(arrayAdapter);





        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
