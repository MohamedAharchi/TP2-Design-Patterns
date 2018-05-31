
public class MyLoggerDirector {
	private MyLoggerBuilder myLoggerBuilder;
	
	public MyLoggerDirector(MyLoggerBuilder myLoggerBuilder) {
		this.myLoggerBuilder = myLoggerBuilder;
	}
	
	public void build() {
		myLoggerBuilder.buildMessage();
		myLoggerBuilder.buildClass();
		myLoggerBuilder.buildMethod();
		myLoggerBuilder.buildState();
		
		/*
		 * PARTIE 3
		myLoggerBuilder.buildLogLevel();
		*/
	}
}
