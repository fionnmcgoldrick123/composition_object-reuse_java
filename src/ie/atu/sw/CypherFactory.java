package ie.atu.sw;

public class CypherFactory {
	private static CypherFactory cf = new CypherFactory();

	private CypherFactory() {

	}

	public static CypherFactory getInstance() {
		return cf;
	}

	public Cypherable getCypher(CypherType type) throws Throwable {
		if (type == CypherType.DES) {
			return new SymmetricCypher("DES", 56, "DES/ECB/PKCS5Padding");
		} else if (type == CypherType.TripleDES) {
			return new SymmetricCypher("DESede", 168, "DESede/ECB/PKCS5Padding");
		} else if (type == CypherType.RSA) {
			return new RSACypher();
		} else {
			return new SymmetricCypher("AES", 128, "AES/ECB/PKCS5Padding");
		}
	}
}
