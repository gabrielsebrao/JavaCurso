package javacurso;
import java.util.ArrayList;

public class JavaA15 {
	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> schoolList = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> studentList = new ArrayList<String>();
		studentList.add("Gabriel");
		studentList.add("Daniel");
		studentList.add("Nicolas");
		studentList.add("Giulia");
		
		ArrayList<String> teacherList = new ArrayList<String>();
		teacherList.add("Eliana");
		teacherList.add("Sandra");
		teacherList.add("Thiarlles");
		teacherList.add("Danilo");
		
		ArrayList<String> roomList = new ArrayList<String>();
		roomList.add("Sala de Aula");
		roomList.add("Banheiro");
		roomList.add("Ginasio");
		roomList.add("Biblioteca");
		
		schoolList.add(studentList);
		schoolList.add(teacherList);
		schoolList.add(roomList);
		
		System.out.println(schoolList.get(0).get(2));
	
	}
}
