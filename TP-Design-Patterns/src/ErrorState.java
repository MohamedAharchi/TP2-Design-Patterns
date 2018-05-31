import org.apache.log4j.Logger;

/*
 * PARTIE 4
 */
public class ErrorState implements State {
	private int stateValue = 1;

	public ErrorState() {
		
	}

	@Override
	public void pullState(Logger logger, State myState, MyLoggerBuilder myLoggerBuilder) {
		if(myState.getState() <= stateValue) {
			logger.trace(myLoggerBuilder.toString());
			logger.info(myLoggerBuilder.toString());
			logger.debug(myLoggerBuilder.toString());
			logger.error(myLoggerBuilder.toString());
		}
	}

	@Override
	public int getState() {
		return this.stateValue;
	}
}
