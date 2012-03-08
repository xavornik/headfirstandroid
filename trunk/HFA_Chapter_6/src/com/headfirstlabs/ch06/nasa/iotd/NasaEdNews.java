package com.headfirstlabs.ch06.nasa.iotd;

import android.app.ListFragment;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.headfristlabs.ch06.nasa.iotd.R;

public class NasaEdNews extends ListFragment implements EdNewsHandlerListener {

	private static final String URL = "http://www.nasa.gov/rss/educationnews.rss";
	private Handler handler;
	private EdNewsAdapter listAdapter;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		handler = new Handler();
	}

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
//		return inflater.inflate(R.layout.ed_news, container, false);
		return null;
	}

	public void onStart() {
		super.onStart();
	}

	private void refreshFromFeed() {

	}
}
