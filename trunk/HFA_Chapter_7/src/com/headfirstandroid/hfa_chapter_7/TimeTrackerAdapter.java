package com.headfirstandroid.hfa_chapter_7;

import java.util.ArrayList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class TimeTrackerAdapter extends BaseAdapter {
	
	private ArrayList<TimeRecord> times = new ArrayList<TimeRecord>();
	
	public TimeTrackerAdapter() {
		times.add(new TimeRecord("38:23", "Feeling good!"));
		times.add(new TimeRecord("49:01", "Tired. Need more caffeine."));
		times.add(new TimeRecord("26:21", "I'm rocking it!"));
		times.add(new TimeRecord("29:42", "Lost some time on the hills, but pretty good."));
	}

	@Override
	public int getCount() {
		return times.size();
	}

	@Override
	public Object getItem(int index) {
		return times.get(index);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			LayoutInflater inflater = LayoutInflater.from(parent.getContext());
			convertView = inflater.inflate(R.layout.time_list_item, parent, false);
		}
		TimeRecord timeRecord = (TimeRecord) getItem(position);
		TextView timeTextView = (TextView) convertView.findViewById(R.id.time_view);
		timeTextView.setText(timeRecord.getTime());
		TextView notesTextView = (TextView) convertView.findViewById(R.id.notes_view);
		notesTextView.setText(timeRecord.getNotes());
		return convertView;
	}
	
	public class TimeRecord {
		
		private String time;
		private String notes;
		
		public TimeRecord(String time, String notes) {
			setTime(time);
			setNotes(notes);
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public String getNotes() {
			return notes;
		}

		public void setNotes(String notes) {
			this.notes = notes;
		}
	}

}
