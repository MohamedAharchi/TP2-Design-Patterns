import org.apache.log4j.Logger;

/*
 * PARTIE 4
 */
public class DebugState implements State {
	private int stateValue = 2;

	public DebugState() {
		
	}

	@Override
	public void pullState(Logger logger, State myState, MyLoggerBuilder myLoggerBuilder) {
		if(myState.getState() <= stateValue) {
			logger.trace(myLoggerBuilder.toString());
			logger.info(myLoggerBuilder.toString());
			logger.debug(myLoggerBuilder.toString());
		}
	}

	@Override
	public int getState() {
		return this.stateValue;
	}
}
