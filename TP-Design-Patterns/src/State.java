import org.apache.log4j.Logger;

/*
 * PARTIE 4
 */
public interface State {
	public void pullState(Logger logger, State state, MyLoggerBuilder myLoggerBuilder);
	public int getState();
}
