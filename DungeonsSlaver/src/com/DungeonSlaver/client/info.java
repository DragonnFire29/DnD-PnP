package com.DungeonSlaver.client;

import java.awt.Image;

public class info {
	private static final int distBuild = 0;
	private static final String distPrefix = "Alpha";
	private static final String distDate = "UNRELEASED";
	private static final String distVersion = "UNRELEASED";
	
	//TEMP VAR
	public static Image[] temp = new Image[9];
	
	public static int getDistBuild()
	{
		return distBuild;
	}
	
	public static final String getDistPrefix()
	{
		return distPrefix;
	}
	
	public static final String getDistDate()
	{
		return distDate;
	}
	
	public static final String getDistVersion()
	{
		return distVersion;
	}
}
