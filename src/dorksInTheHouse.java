import java.util.ArrayList;
import java.util.Random;

public class dorksInTheHouse {

	boolean isInside;

	ArrayList<Student> students = new ArrayList<Student>();

	public static void main(String[] args) {

		dorksInTheHouse dork = new dorksInTheHouse();

		dork.nerds();

		System.out.println(dork.getAverageIntellegence());

	}

	public void nerds() {

		int r = new Random().nextInt(10);

		Student n1 = new Student(1, r, "Jay");

		Student n2 = new Student(3, r, "Bob");

		Student n3 = new Student(8, r, "Jill");

		Student n4 = new Student(7, r, "Don");

		students.add(n1);

		students.add(n2);

		students.add(n3);

		students.add(n4);
	}

	int getAverageIntellegence() {

		int iq = 0; 
		
		int level = 0; 
		
		System.out.println(students.size());
		
		foreach(Student i : students){
			
			level = level + i.getIntellegenceLevel(); 

		}
		
		iq = level/students.size(); 
		
		return iq;
		
	}
}
