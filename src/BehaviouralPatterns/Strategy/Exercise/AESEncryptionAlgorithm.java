package BehaviouralPatterns.Strategy.Exercise;

public class AESEncryptionAlgorithm implements EncryptionAlgorithm {
@Override
public void Encrypt() {
	System.out.println("Encrypted Using DES Encryption Algorithm");
}

	@Override
	public void Decrypt() {
		System.out.println("Decrypted Using DES Encryption Algorithm");
	}
}
