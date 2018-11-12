// Alec Bird
// CSE 271 Section B

public class MessageTester {

	public static void main(String[] args) {
		// Creates Message object
		Message email = new Message("Alec", "Lindsay");
		
		// Prints the recipient's name 
		System.out.println(email.getRecipient());
		System.out.println("Expected: Lindsay");
		
		// Prints the sender's name
		System.out.println(email.getSender());
		System.out.println("Expected: Alec");
		
		System.out.println();
		// Adds text to the message
		email.append("Hey whats up");
		email.append("What are you doing");
		email.append("Hope you are well");
		
		// Prints out the body with who the message is to and from
		System.out.println(email.toString());
		System.out.println("Expected:\nFrom: Alec\nTo: Lindsay\nHey whats up\nWhat are you doing\nHope you are well");
	}

}
