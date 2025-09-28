package ie.atu.sw;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

public class AESCypher extends AbstractSymmetricCypher {
	public AESCypher() throws Throwable{
		super();
		KeyGenerator keyGen = KeyGenerator.getInstance("AES"); 
		keyGen.init(128);
		this.setKey(keyGen.generateKey());
		super.setCypher(Cipher.getInstance("AES/ECB/PKCS5Padding"));
	}

}
