import java.util.ArrayList;

// Alec Bird
// CSE 271 Section B

public class Mailbox {
	private ArrayList<Message> mail;
	private final String SIGNATURE;

	// Creates constructor and initializes the ArrayList and constant string
	public Mailbox(String signature) {
		super();
		this.mail = new ArrayList<Message>();
		this.SIGNATURE = signature;
	}
	
	// Adds a message to the mail ArrayList and adds the signature after it
	public void addMessage(Message m){
		Message temp = m;
		mail.add(temp);
		m.append(SIGNATURE);	
	}
	
    // Returns the message at the indicated location of the array
	public Message getMessage(int i){
		return mail.get(i);
	}
	
	// Removes the message at the indicated location
	public void removeMessage(int i){
		mail.remove(i);
	}

}
