package it.moondroid.navigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class PlanetFragment extends Fragment {
	
	public static final String ARG_PLANET_NUMBER = "planet_number";
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
    	
    	Bundle bundle=getArguments(); 
    	int num = bundle.getInt(ARG_PLANET_NUMBER);
    	
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_planet, container, false);
        TextView tvPlanet = (TextView)v.findViewById(R.id.tv_planet_title);
        tvPlanet.setText("Planet "+num);
        
        return v;
    }
    
}