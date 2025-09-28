package ie.atu.sw;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;

public class RSACypher {
	private Cipher cypher;
	private KeyPair keyRing;
	
	public RSACypher() throws Throwable {
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
		keyGen.initialize(2048);
		keyRing = keyGen.generateKeyPair();
		cypher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
	}



	@SuppressWarnings("removal")
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
}
