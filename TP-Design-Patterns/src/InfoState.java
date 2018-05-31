import org.apache.log4j.Logger;

/*
 * PARTIE 4
 */
public class InfoState implements State {
	private int stateValue = 3;

	public InfoState() {
		
	}

	@Override
	public void pullState(Logger logger, State myState, MyLoggerBuilder myLoggerBuilder) {
		if(myState.getState() <= stateValue) {
			logger.trace(myLoggerBuilder.toString());
			logger.info(myLoggerBuilder.toString());
		}
	}

	@Override
	public int getState() {
		return this.stateValue;
	}
}
