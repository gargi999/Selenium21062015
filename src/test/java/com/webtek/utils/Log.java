package com.webtek.utils;

import org.apache.log4j.Logger;

public class Log {
	
private static Logger Log=Logger.getLogger(Log.class);

public static void startTestMethod(String sTestMethodName)
{
	Log.info("****************************************************************************");
	Log.info("****************************************************************************");
	Log.info("Start Test Method     "+sTestMethodName+"                                     ");
	Log.info("****************************************************************************");
	Log.info("****************************************************************************");
}

public static void endTestMethod(String sTestMethodName)
{
	Log.info("****************************************************************************");
	Log.info("****************************************************************************");
	Log.info("End of Test Method                    "+sTestMethodName+"                     ");
	Log.info("****************************************************************************");
	Log.info("****************************************************************************");
}

public static void info(String message) {
	Log.info(message);
}

public static void error(String message) {
	Log.info(message);
}

}
