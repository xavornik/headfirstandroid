package com.headfirstandroid.hfa_chapter_7;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class TimeTracker extends Activity {
	
	private TimeTrackerAdapter timeTrackerAdapter;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ListView listView = (ListView) findViewById(R.id.times_list);
        timeTrackerAdapter = new TimeTrackerAdapter();
        listView.setAdapter(timeTrackerAdapter);
        
    }
}