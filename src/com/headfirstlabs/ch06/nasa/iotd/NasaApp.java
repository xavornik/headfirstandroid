package com.headfirstlabs.ch06.nasa.iotd;

/**
 * NasaApp
 * This class is the central class for the activity
 * 
 * Customly written, based on the requirements of the book.
 * 
 *  @author Geroen Joris - http://www.headfirstandroid.com/
 * 
 */

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;

import com.headfristlabs.ch06.nasa.iotd.R;

public class NasaApp extends Activity {
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void onRefreshButtonClicked(View view) {
		FragmentManager fragmentManager = getFragmentManager();
		NasaIotd nasaIotdFragment = (NasaIotd) fragmentManager.findFragmentById(R.id.iotd_fragment);
		nasaIotdFragment.onRefreshButtonClicked(view);
	}
	
	public void onSetWallpaper(View view) {
		FragmentManager fragmentManager = getFragmentManager();
		NasaIotd nasaIotdFragment = (NasaIotd) fragmentManager.findFragmentById(R.id.iotd_fragment);
		nasaIotdFragment.onSetWallpaper(view);
	}
	
}
