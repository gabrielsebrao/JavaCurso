package java35accessmodifierA;

public class A {
	
	public static String publicMessage = "It is a public message.";
	protected static String protectedMessage = "It is a protected message.";
	static String defaultMessage = "It is a default message.";
	private static String privateMessage = "It is a private message.";
	
	public static void main(String[] args) {
		
		// Todos podem por que estao dentro da classe *ate a keyword private>
		System.out.println(A.publicMessage);
		System.out.println(A.protectedMessage);
		System.out.println(A.defaultMessage);
		System.out.println(A.privateMessage);
	}
}
