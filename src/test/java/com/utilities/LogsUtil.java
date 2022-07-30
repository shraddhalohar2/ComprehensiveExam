package com.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.utilities.LogsUtil;

public class LogsUtil {
	public Logger loggs() {
		Logger log = LogManager.getLogger(LogsUtil.class);
		return log;
	}
}
