import org.apache.log4j.Logger;

/*
 * PARTIE 4
 */
public class TraceState implements State {
	private int stateValue = 4;

	public TraceState() {
		
	}

	@Override
	public void pullState(Logger logger, State myState, MyLoggerBuilder myLoggerBuilder) {
		if(myState.getState() <= stateValue) {
			logger.trace(myLoggerBuilder.toString());
		}
	}

	@Override
	public int getState() {
		return this.stateValue;
	}
}
