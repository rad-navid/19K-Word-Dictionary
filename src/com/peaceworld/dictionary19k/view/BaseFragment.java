package com.peaceworld.dictionary19k.view;

import com.actionbarsherlock.app.SherlockFragment;

public class BaseFragment extends SherlockFragment {
	
	protected String backStackTag;

	
	
	public BaseFragment(String backStackTag) {
		super();
		this.backStackTag = backStackTag;
	}

	public String getBackStackTag() {
		return backStackTag;
	}

	public void setBackStackTag(String backStackTag) {
		this.backStackTag = backStackTag;
	}

	
}

