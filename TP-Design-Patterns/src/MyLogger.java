import org.apache.log4j.Logger;

public class MyLogger implements LogLevel {
	final static Logger logger = Logger.getLogger(MyLogger.class);
	private static MyLogger myLogger;
	
	public String message;
	public String className;
	public String method;
	public State state;
	
	/*
	 * PARTIE 3
	public LogLevelEnum logLevel;
	*/	

	private MyLogger(State state) {
		this.state = state;
	}
	
	// Singleton
	public static MyLogger getLogger(State state) {
		if(myLogger != null && state != myLogger.state) {
			myLogger.state = state;
		} else if(myLogger == null) {
			myLogger = new MyLogger(state);
		}
		
		return myLogger;
	}
	
	/*
	 * PARTIE 3 + PARTIE 2 Singleton
	public static MyLogger getLogger(LogLevelEnum logLevel) {
		if(myLogger != null && logLevel != myLogger.logLevel) {
			myLogger.logLevel = logLevel;
		} else if(myLogger == null) {
			myLogger = new MyLogger(logLevel);
		}
		
		return myLogger;
	}
	
	
	private MyLogger(LogLevelEnum logLevel) {
		this.logLevel = logLevel;
	}
	*/	
		
	public void setMessage(String message) {
		this.message = message;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public void setState(State state) {
		this.state = state;
	}

	/*
	 * PARTIE 3
	public void setLogLevel(LogLevelEnum logLevel) {
		this.logLevel = logLevel;
	}
	*/	
	
	/*
	 * PARTIE 5
	 */
	public void log(MyLoggerBuilder myLoggerBuilder, InfoState state) {
		State myState = new InfoState();
		myState.pullState(logger, myState, myLoggerBuilder);
	}
	
	public void log(MyLoggerBuilder myLoggerBuilder, DebugState state) {
		State myState = new DebugState();
		myState.pullState(logger, myState, myLoggerBuilder);
	}

	public void log(MyLoggerBuilder myLoggerBuilder, ErrorState state) {
		State myState = new ErrorState();
		myState.pullState(logger, myState, myLoggerBuilder);
	}
	
	public void log(MyLoggerBuilder myLoggerBuilder, TraceState state) {
		State myState = new TraceState();
		myState.pullState(logger, myState, myLoggerBuilder);
	}
	
	/*
	 * PARTIE 4
	public void logInfo(MyLoggerBuilder myLoggerBuilder) {
		State myState = new InfoState();
		myState.pullState(logger, myState, myLoggerBuilder);
	}
	
	public void logDebug(MyLoggerBuilder myLoggerBuilder) {
		State myState = new DebugState();
		myState.pullState(logger, myState, myLoggerBuilder);
	}

	public void logError(MyLoggerBuilder myLoggerBuilder) {
		State myState = new ErrorState();
		myState.pullState(logger, myState, myLoggerBuilder);
	}
	
	public void logTrace(MyLoggerBuilder myLoggerBuilder) {
		State myState = new TraceState();
		myState.pullState(logger, myState, myLoggerBuilder);
	}
	
	*/
	
	/*
	 * PARTIE 3.2 : Changer le design pour que les trois méthodes prennent en paramétré un builder RecordBuilder.
	public void logInfo(MyLoggerBuilder myLoggerBuilder) {
		if(this.logLevel.getLevel() <= LogLevelEnum.INFO.getLevel()) {
			logger.info(myLoggerBuilder.toString());
		}
	}
	
	public void logDebug(MyLoggerBuilder myLoggerBuilder) {
		if(this.logLevel.getLevel() <= LogLevelEnum.DEBUG.getLevel()) {
			logger.debug(myLoggerBuilder.toString());
		}
	}

	public void logError(MyLoggerBuilder myLoggerBuilder) {
		if(this.logLevel.getLevel() <= LogLevelEnum.ERROR.getLevel()) {
			logger.error(myLoggerBuilder.toString());
		}
	}
	
	public void logTrace(MyLoggerBuilder myLoggerBuilder) {
		if(this.logLevel.getLevel() <= LogLevelEnum.INFO.getLevel()) {
			logger.trace(myLoggerBuilder.toString());
		}
	}
	*/
	
	/*
	 * PARTIE 3.1 : Changer les méthodes log* pour qu’elles prennent trois paramétrés
	public void logInfo(String message, String className, String method) {
		if(this.logLevel.getLevel() <= LogLevelEnum.INFO.getLevel()) {
			logger.info(className+"."+method+": "+message);
		}
	}
	
	public void logDebug(String message, String className, String method) {
		if(this.logLevel.getLevel() <= LogLevelEnum.DEBUG.getLevel()) {
			logger.debug(className+"."+method+": "+message);
		}
	}

	public void logError(String message, String className, String method) {
		if(this.logLevel.getLevel() <= LogLevelEnum.ERROR.getLevel()) {
			logger.error(className+"."+method+": "+message);
		}
	}
	
	public void logTrace(String message, String className, String method) {
		if(this.logLevel.getLevel() <= LogLevelEnum.INFO.getLevel()) {
			logger.trace(className+"."+method+": "+message);
		}
	}
	*/
	
	
	/*
	 * PARTIE 2 
	 * 
	public void logInfo(String message) {
		if(this.logLevel.getLevel() <= LogLevelEnum.INFO.getLevel()) {
			logger.info(message);
		}
	}
	
	public void logDebug(String message) {
		if(this.logLevel.getLevel() <= LogLevelEnum.DEBUG.getLevel()) {
			logger.debug(message);
		}
	}

	public void logError(String message) {
		if(this.logLevel.getLevel() <= LogLevelEnum.ERROR.getLevel()) {
			logger.error(message);
		}
	}
	
	public void logTrace(String message) {
		if(this.logLevel.getLevel() <= LogLevelEnum.INFO.getLevel()) {
			logger.trace(message);
		}
	}
	*/
}
