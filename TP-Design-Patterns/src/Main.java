
public class Main {

	public static void main(String[] args) {
		State state = new ErrorState();
		MyLoggerBuilder myLoggerBuilder = new MyLoggerBuilder("message 1", "class 1", "method 1", state);
		
		
		/*
		 * PARTIE 3
		MyLoggerBuilder myLoggerBuilder = new MyLoggerBuilder("message 1", "class 1", "method 1", LogLevelEnum.INFO);
		*/
		MyLoggerDirector myLoggerDirector = new MyLoggerDirector(myLoggerBuilder);
		
		myLoggerDirector.build();
		
		LogLevel myLogger = myLoggerBuilder.getLogger();
		myLogger.log(myLoggerBuilder, (ErrorState) state);
		
		
		/*myLogger.logTrace(myLoggerBuilder);
		myLogger.logInfo(myLoggerBuilder);
		myLogger.logDebug(myLoggerBuilder);
		myLogger.logError(myLoggerBuilder);
		*/

		/*
		myLogger = MyLogger.getLogger(LogLevelEnum.ERROR);
		
		myLogger.logTrace("TEST LOG TRACE 2");
		myLogger.logInfo("TEST LOG INFO 2");
		myLogger.logDebug("TEST LOG DEBUG 2");
		myLogger.logError("TEST LOG ERROR 2");
		
		*/
	}

}
