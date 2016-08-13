package Logging;

import org.apache.logging.log4j.LogManager;

public class Logger implements ILogger
{
	private final org.apache.logging.log4j.Logger Log;
	
	public Logger()
	{
		Log = LogManager.getLogger(this.getClass().getName());
	}
	
	@Override
	public void Log(LogLevel logLevel, String message)
	{
		switch (logLevel)
		{
		case TRACE:
			
			break;

		default:
			break;
		}
	}

}
