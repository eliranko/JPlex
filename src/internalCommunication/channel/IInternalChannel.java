package internalCommunication.channel;

import internalCommunication.communicator.IBroadcaster;
import internalCommunication.message.IMessage;

/**
 * Internal channel is the foundation stone on which the
 * different classes can communicate on. 
 * @author Eliran
 *
 */
public interface IInternalChannel 
{
	/**
	 * Subscribe a class to this channel
	 * @param broadcaster
	 */
	void Subscribe(IBroadcaster broadcaster);
	
	/**
	 * Unsubscribe a class from this channel
	 * @param broadcaster
	 */
	void Unsubscribe(IBroadcaster broadcaster);
	
	/**
	 * Broadcast a message to the classes subscribed to
	 * this channel
	 * @param message
	 */
	void Broadcast(IMessage message);
}