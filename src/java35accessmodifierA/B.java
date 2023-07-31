package java35accessmodifierA;

public class B {
	public static void main(String[] args) {
		
		System.out.println(A.publicMessage);
		
		// Ambas podem por que estao dentro da package
		System.out.println(A.protectedMessage);
		System.out.println(A.defaultMessage);
		
		// <Nao pode porque ta dentro da classe A>
//		System.out.println(A.privateMessage);
	}
}
