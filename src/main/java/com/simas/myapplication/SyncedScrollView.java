package com.simas.myapplication;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;

public class SyncedScrollView extends ScrollView {


	public SyncedScrollView(Context context) {
		super(context);
	}

	public SyncedScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public SyncedScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	@TargetApi(Build.VERSION_CODES.LOLLIPOP)
	public SyncedScrollView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
		super(context, attrs, defStyleAttr, defStyleRes);
	}

	private SyncedScrollView mSibling;

	public void setSibling(SyncedScrollView syncedScrollView) {
		mSibling = syncedScrollView;
	}

//	private void myScrollTo(int l, int t) {
//		Log.e("TAG", "Scrolled to sibling id: " + getId());
//		super.scrollTo(l, t);
//	}

	@Override
	protected void onScrollChanged(int l, int t, int oldl, int oldt) {
		super.onScrollChanged(l, t, oldl, oldt);

		if (mSibling != null) {
			mSibling.scrollTo(l, t);
		}
	}
}
