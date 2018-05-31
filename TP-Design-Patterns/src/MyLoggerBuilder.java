
public class MyLoggerBuilder {
	private String message;
	private String className;
	private String method;
	private State state = new InfoState();
	
	/*
	 * PARTIE 2
	private LogLevelEnum logLevel;
	private MyLogger myLogger = MyLogger.getLogger(LogLevelEnum.INFO);
	*/
	
	
	private MyLogger myLogger = MyLogger.getLogger(state);
	
	public MyLoggerBuilder(String message, String className, String method, State state) {
		this.message = message;
		this.className = className;
		this.method = method;
		this.state = state;
	}
	
	/*
	 * PARTIE 2	 
	public MyLoggerBuilder(String message, String className, String method, LogLevelEnum logLevel) {
		this.message = message;
		this.className = className;
		this.method = method;
		this.logLevel = logLevel;
	}
	*/
	
	public void buildMessage() {
		myLogger.setMessage(this.message);
	}
	
	public void buildClass() {
		myLogger.setClassName(this.className);
	}
	
	public void buildMethod() {
		myLogger.setMethod(this.method);
	}
	
	public void buildState() {
		myLogger.setState(state);
	}
	
	/*
	 * PARTIE 2
	public void buildLogLevel() {
		myLogger.setLogLevel(this.logLevel);
	}
	*/
	
	public MyLogger getLogger() {
		return myLogger;		
	}

	@Override
	public String toString() {
		return className+"."+method+": "+message;
	}
	
	
}

