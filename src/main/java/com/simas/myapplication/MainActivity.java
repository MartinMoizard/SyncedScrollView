package com.simas.myapplication;

import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		SyncedScrollView left = (SyncedScrollView) findViewById(R.id.left_scroll_view);
		SyncedScrollView right = (SyncedScrollView) findViewById(R.id.right_scroll_view);

		left.setSibling(right);
		right.setSibling(left);
	}
}