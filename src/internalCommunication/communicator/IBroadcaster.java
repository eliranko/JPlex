package internalCommunication.communicator;

import internalCommunication.channel.IInternalChannel;
import internalCommunication.message.IMessage;

/**
 * Broadcaster is a class that broadcasts message to other classes.
 * @author Eliran
 *
 */
public interface IBroadcaster
{
	/**
	 * Subscribe to a channel
	 * @param internalChannel
	 */
	void Subscribe(IInternalChannel internalChannel);
	
	/**
	 * Unsubscribe from a channel
	 * @param internalChannel
	 */
	void Unsubscribe(IInternalChannel internalChannel);
	
	/**
	 * Broadcast message to connected classes
	 * @param message
	 */
	void Broadcast(IMessage message);
}
