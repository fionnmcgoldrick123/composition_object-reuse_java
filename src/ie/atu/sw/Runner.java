package ie.atu.sw;

public class Runner {
	public static void main(String[] args) throws Throwable {
		//AbstractCypher cypher = new SymmetricCypher("AES", 128, "AES/ECB/PKCS5Padding");
		Cypherable cypher = new SymmetricCypher("DESede", 168, "DESede/ECB/PKCS5Padding");
		
		byte[] s = cypher.encrypt(new String("Attack the castle wall at dawn").getBytes("UTF-8"));
		
		System.out.println(new String(s));
		System.out.println(new String(cypher.decrypt(s)));
	}
}
