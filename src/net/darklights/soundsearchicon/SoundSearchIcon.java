package net.darklights.soundsearchicon;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SoundSearchIcon extends Activity
{
	private static final String TAG = "SoundSearchIcon";

	/** Called when the activity is first created. */
	@Override
	public void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Intent soundSearchIntent = new Intent("com.google.android.googlequicksearchbox.MUSIC_SEARCH");

		try {
			startActivity(soundSearchIntent);
		} catch (final ActivityNotFoundException anfe) {
			Log.e(TAG, "Could not start " + soundSearchIntent, anfe);
			Toast.makeText(getApplicationContext(), "'Google Search' (Now) must be installed!", Toast.LENGTH_LONG).show();
		}

		finish();
	}
}
