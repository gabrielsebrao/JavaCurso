package java35accessmodifierB;
import java35accessmodifierA.*;

public class C {
	public static void main(String[] args) {
		
		System.out.println(A.publicMessage);

		// <Nao pode porque C nao e subclasse de A>
//		System.out.println(A.protectedMessage);
		
		// <Nao podem ser visiveis por estar fora do package1>
//		System.out.println(A.defaultMessage);
		
		// <Nao pode porque nao esta na classe de A>
//		System.out.println(A.privateMessage);
		
	}
}
