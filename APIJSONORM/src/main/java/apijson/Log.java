/*Copyright (C) 2020 THL A29 Limited, a Tencent company.  All rights reserved.

This source code is licensed under the Apache License Version 2.0.*/


package apijson;

import java.text.SimpleDateFormat;

/**测试用Log
 * @modifier Lemon
 */
public class Log {

	public static boolean DEBUG = true;

	public static boolean DEBUG1 = false;

	public static final String VERSION = "5.1.0";
	public static final String KEY_SYSTEM_INFO_DIVIDER = "---|-----APIJSON SYSTEM INFO-----|---";

	//默认的时间格式
	public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");

	/**
	 * modify date format
	 * @param dateFormatString
	 */
	public static void setDateFormat(String dateFormatString) {
		dateFormat = new SimpleDateFormat(dateFormatString);
	}

	/**
	 * log info by level tag and msg
	 * @param TAG
	 * @param msg
	 * @param level
	 */
	public static void logInfo(String TAG, String msg, String level){
	    if(level.equals("DEBUG") || level .equals("ERROR") ||level.equals("WARN")){
			System.err.println(dateFormat.format(System.currentTimeMillis()) + ": " + TAG + "." + level + ": " + msg);
		}
	    else if(level.equals("VERBOSE") || level .equals("INFO") ){
			System.out.println(dateFormat.format(System.currentTimeMillis()) + ": " + TAG + "." + level + ": " + msg);
		}
	}


	/**
	 * @param TAG
	 * @param msg
	 */
	public static void d(String TAG, String msg) {
		if (DEBUG) {
			logInfo(TAG,msg,"DEBUG");
		}
	}

	/**
	 * Forced debug
	 * @param TAG tag
	 * @param msg debug messages
	 */
	public static void fd(String TAG, String msg) {
		logInfo(TAG,msg,"DEBUG");
	}

	/**
	 * Generate separation line
	 * @param pre prefix
	 * @param symbol used for generating separation line
	 * @param post postfix
	 */
	public static void sl(String pre,char symbol ,String post) {
		System.err.println(pre+new String(new char[48]).replace('\u0000', symbol)+post);
	}

	/**
	 * @param TAG
	 * @param msg
	 */
	public static void v(String TAG, String msg) {
		if (DEBUG) {
			logInfo(TAG,msg,"VERBOSE");
		}
	}

	/**
	 * @param TAG
	 * @param msg
	 */
	public static void i(String TAG, String msg) {
		if (DEBUG) {
			logInfo(TAG,msg,"INFO");
		}
	}

	/**
	 * @param TAG
	 * @param msg
	 */
	public static void e(String TAG, String msg) {
		if (DEBUG) {
			logInfo(TAG,msg,"ERROR");
		}
	}

	/**
	 * @param TAG
	 * @param msg
	 */
	public static void w(String TAG, String msg) {
		if (DEBUG) {
			logInfo(TAG,msg,"WARN");
		}
	}

}
