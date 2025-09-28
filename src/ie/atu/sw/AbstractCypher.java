package ie.atu.sw;

import java.security.Key;

import javax.crypto.Cipher;

public class AbstractCypher {

	protected Cipher cypher;

	public AbstractCypher() {
		super();
	}

	public byte[] encrypt(byte[] plainText, Key key) throws Throwable {
		cypher.init(Cipher.ENCRYPT_MODE, key);
		return cypher.doFinal(plainText);
	}

	public byte[] decrypt(byte[] cypherText, Key key) throws Throwable {
		cypher.init(Cipher.DECRYPT_MODE, key);
		return cypher.doFinal(cypherText);
	}

	@SuppressWarnings("removal")
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}

}