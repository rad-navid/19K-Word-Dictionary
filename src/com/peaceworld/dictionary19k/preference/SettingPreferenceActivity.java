package com.peaceworld.dictionary19k.preference;

import android.os.Bundle;
import android.preference.ListPreference;

import com.actionbarsherlock.app.SherlockPreferenceActivity;
import com.peaceworld.dictionary19k.R;

public class SettingPreferenceActivity extends SherlockPreferenceActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences_setting);
		

		CharSequence[] entries = new CharSequence[26];
		CharSequence[] entryValues = new CharSequence[26];
		int index=0;
		for(int i=10;i<=60;i=i+2)
		{
			entries[index]=i+"";
			entryValues[index]=i+"";
			index++;
		}
		
		ListPreference sizes = (ListPreference)findPreference("TEXTSIZE");
		sizes.setEntries(entries);
		sizes.setEntryValues(entryValues);
		sizes.setNegativeButtonText(null);
		
		ListPreference detailSizes = (ListPreference)findPreference("DETAILTEXTSIZE");
		detailSizes.setEntries(entries);
		detailSizes.setEntryValues(entryValues);
		detailSizes.setNegativeButtonText(null);
		

		
	}

}
