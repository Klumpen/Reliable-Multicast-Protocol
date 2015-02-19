package mcgui;

/*
 * AUTHOR: 	David Bennehag (David.Bennehag@Gmail.com)
 * Version: 1.0
 * 
 * 		Distributed Systems, Advanced (MPCSN, Chalmers University of Technology)
 *		
 *		TODO:  
 * 
 */

@SuppressWarnings("serial")
public class MCmessage extends Message 
{	
	private String message;
	private int type;
	private String messageID;
	private int timestamp;
	private byte[] hash;
	
	
	//sender must, according to specification, be initialized before the object is used
	public MCmessage(int sender) 
	{
		super(sender);
	
		System.out.println("Entered Constructor for MCmessage\n");

	}
	@Override
	public String toString()
	{
		return message;
	}

	public String getMessage() 
	{
		return message;
	}
	public void setMessage(String message) 
	{
		this.message = message;
	}
	
	public int getTimestamp()
	{
		return timestamp;
	}
	public void setTimestamp(int timestamp)
	{
		this.timestamp = timestamp;
	}
	
	public int getsenderID()
	{
		return sender;
	}
	public void setsenderID(int id)
	{
		this.sender = id;
	}

	public String getMessageID()
	{
		return messageID;
	}
	public void setMessageID(String messageID)
	{
		this.messageID = messageID;
	}
	
	public byte[] getHash()
	{
		return hash;
	}
	public void setHash(byte[] hash)
	{
		this.hash = hash;
	}
	
	public int getType()
	{
		return type;
	}
	public void setType(int type)
	{
		this.type = type;
	}
}
