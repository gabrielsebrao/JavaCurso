package java35accessmodifierB;
import java35accessmodifierA.*;

public class Asub extends A{
	public static void main(String[] args) {
		System.out.println(A.publicMessage);
		
		// Este pode por que e uma subclasse de A
		System.out.println(A.protectedMessage);
		
		// <Nao podem ser visiveis por estar fora do package1>
//		System.out.println(A.defaultMessage);
//		System.out.println(A.privateMessage);
	}
}
