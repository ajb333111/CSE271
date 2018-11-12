// Alec Bird
// CSE 271 Section B

public class Message {
	private String sender, recipient, body; 
	public static final String FROM = "From: ";
	public static final String TO = "\nTo: ";
	
	// Constructor 
	public Message(String sender, String recipient){
		this.sender = sender; 
		this.recipient = recipient; 
		this.body = "";
	}
	
	// Returns the sender's name
	public String getSender() {
		return sender;
	}

    // Returns the recipient's name
	public String getRecipient() {
		return recipient;
	}

	
	// Adds the text to the message
	public void append(String text){
		body = body + text + "\n";
	}
	
	// Overrides the toString method and returns the message body with the sender and recipient
	public String toString(){
		return FROM + getSender() + TO + getRecipient() + "\n" + body;
	}

	
}
