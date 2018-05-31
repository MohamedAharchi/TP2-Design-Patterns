/*
 * PARTIE 2
 */
public enum LogLevelEnum {
	TRACE(4),
	INFO(3),
	DEBUG(2),
	ERROR(1);
	
	private final int level;
	
	private LogLevelEnum(int level)
	{
		this.level=level;
	}
	
	public int getLevel(){
		return this.level;
	}
}
