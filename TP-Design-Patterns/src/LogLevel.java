
public abstract interface LogLevel {
	/*
	 * PARTIE 1
	public int TRACE = 4;
	public int INFO = 3;
	public int DEBUG = 2;
	public int ERROR = 1;
	
	public void logInfo(String message);	
	public void logDebug(String message);
	public void logError(String message);	
	public void logTrace(String message);
	*/
	
	/*
	 * PARTIE 3.1	 
	public void logInfo(String message, String className, String method);	
	public void logDebug(String message, String className, String method);
	public void logError(String message, String className, String method);	
	public void logTrace(String message, String className, String method);
	*/
	
	/*
	 * PARTIE 3.2
	public void logInfo(MyLoggerBuilder myLoggerBuilder);	
	public void logDebug(MyLoggerBuilder myLoggerBuilder);
	public void logError(MyLoggerBuilder myLoggerBuilder);	
	public void logTrace(MyLoggerBuilder myLoggerBuilder);
	*/
	
	
	
	/*
	 * PARTIE 5
	 */
	public void log(MyLoggerBuilder myLoggerBuilder, InfoState state) ;
	public void log(MyLoggerBuilder myLoggerBuilder, DebugState state) ;
	public void log(MyLoggerBuilder myLoggerBuilder, ErrorState state) ;
	public void log(MyLoggerBuilder myLoggerBuilder, TraceState state) ;

}
