package Logging;

/**
 * JPlex logger interface
 * @author Eliran
 *
 */
public interface ILogger
{
	/**
	 * Log message
	 * @param logLevel log level
	 * @param message message to log
	 */
	void Log(LogLevel logLevel, String message);
}
