package com.test.socket;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Test {
	private static Logger logger;

	public static void main(String[] args) {
		System.setProperty("java.util.logging.SimpleFormatter.format",
	              "%5$s %n[%1$tF %1$tT] %n");
		logger = Logger.getLogger(Test.class);
				
        logger.info("메시지 수신; [유미] Warning logging");
        System.out.println(getTime());
	}

	private static String getTime() {
		SimpleDateFormat format = new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss]");
        return format.format(new Date());
	}

}
