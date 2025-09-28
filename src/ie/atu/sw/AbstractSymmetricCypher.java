package ie.atu.sw;

import java.security.Key;

public abstract class AbstractSymmetricCypher extends AbstractCypher {

	private Key key;

	public AbstractSymmetricCypher() {
		super();
	}

	@Override
	public byte[] encrypt(byte[] plainText) throws Throwable {
		return this.encrypt(plainText, getKey());
	}

	@Override
	public byte[] decrypt(byte[] cypherText) throws Throwable {
		return this.decrypt(cypherText, getKey());
	}

	protected Key getKey() {
		return key;
	}

	protected void setKey(Key key) {
		this.key = key;
	}

}