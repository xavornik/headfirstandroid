package com.headfirstandroid.hfa_chapter_8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

public class TimeTracker extends Activity {
	
	private TimeTrackerAdapter timeTrackerAdapter;
	
	private static final int TIME_ENTRY_REQUEST_CODE = 1;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ListView listView = (ListView) findViewById(R.id.times_list);
        timeTrackerAdapter = new TimeTrackerAdapter();
        listView.setAdapter(timeTrackerAdapter);
        
    }

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreateOptionsMenu(android.view.Menu)
	 */
    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuInflater menuInflater = getMenuInflater();
		menuInflater.inflate(R.menu.time_list_menu, menu);
		return true;
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onMenuItemSelected(int, android.view.MenuItem)
	 */
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		if (item.getItemId() == R.id.add_time_menu_item) {
			Intent intent = new Intent(this, AddTimeActivity.class);
			startActivityForResult(intent, TIME_ENTRY_REQUEST_CODE);
			return true;
		}
		return super.onMenuItemSelected(featureId, item);
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onActivityResult(int, int, android.content.Intent)
	 */
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == TIME_ENTRY_REQUEST_CODE) {
			if (resultCode == RESULT_OK) {
				String time = data.getStringExtra("time");
				String notes = data.getStringExtra("notes");
				timeTrackerAdapter.addTimeRecord(time,notes);
				timeTrackerAdapter.notifyDataSetChanged();
			}
		}
	}
}