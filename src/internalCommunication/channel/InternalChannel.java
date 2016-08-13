package internalCommunication.channel;

import java.util.HashSet;
import internalCommunication.communicator.IBroadcaster;
import internalCommunication.message.IMessage;

public class InternalChannel implements IInternalChannel
{
	private HashSet<IBroadcaster> _broadcasters;
	
	public  InternalChannel()
	{
		_broadcasters = new HashSet<IBroadcaster>();
	}
	
	@Override
	public void Subscribe(IBroadcaster broadcaster)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Unsubscribe(IBroadcaster broadcaster)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Broadcast(IMessage message)
	{
		// TODO Auto-generated method stub
		
	}

}
