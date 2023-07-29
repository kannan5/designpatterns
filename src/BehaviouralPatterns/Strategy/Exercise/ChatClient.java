package BehaviouralPatterns.Strategy.Exercise;

public class ChatClient {
	private EncryptionAlgorithm encryptionAlgorithm;

	public void SendMessage(){
		System.out.println("Started Sending Message");
		encryptionAlgorithm.Encrypt();
		System.out.println("Message Sent");
	}

	public void ShowMessage(){
		System.out.println("Started Displaying Message");
		encryptionAlgorithm.Decrypt();
		System.out.println("Test Message");
	}

	public ChatClient(EncryptionAlgorithm encryptionAlgorithm) {
		this.encryptionAlgorithm = encryptionAlgorithm;
	}
}
