package ie.atu.sw;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import javax.crypto.Cipher;

public class RSACypher extends AbstractCypher {
	KeyPair keyRing;

	public RSACypher() throws Throwable {
		super();
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
		keyGen.initialize(2048);
		keyRing = keyGen.generateKeyPair();
		cypher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
	}
}
