// Alec Bird
// CSE 271 Section B

public class MailboxTester {

	public static void main(String[] args){
		
		// Creates a new Mailbox object and two Message objects
		Mailbox birdbox = new Mailbox("CSE Department\n2/21/17");
		Message newMessage1 = new Message("Joe", "Bob");
		Message newMessage2 = new Message("Alec", "Lindz");
		
		// Adds text to each message object and adds the messages to the mailbox
		newMessage1.append("Hey whats up");
		birdbox.addMessage(newMessage1);
		
		newMessage2.append("How are you");
		birdbox.addMessage(newMessage2);
		
		// Prints the first message in the mailbox
		System.out.println(birdbox.getMessage(0));
		System.out.println("Expected:\nFrom: Joe\nTo: Bob\nHey whats up\nCSE Department\n2/21/17\n");
		
		// Prints the second message in the mailbox
		System.out.println(birdbox.getMessage(1));
		System.out.println("Expected:\nFrom: Alec\nTo: Lindz\nHow are you\nCSE Department\n2/21/17\n");
		
		// Removes the first message from the mailbox and prints the new first message
		birdbox.removeMessage(0);
		System.out.println(birdbox.getMessage(0));
		System.out.println("Expected:\nFrom: Alec\nTo: Lidz\nHow are you\nCSE Department\n2/21/17\n");
		
		
		
		

	}

}
