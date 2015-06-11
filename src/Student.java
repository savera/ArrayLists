import java.util.Random;


public class Student {
	
	int intellegenceLevel; 
	
	int age; 
	
	String name; 
	
	Student(int a, int il, String n){
		
		this.intellegenceLevel = il; 
		
		this.age = a; 
		
		this.name = n; 
		
	}
	
	int getIntellegenceLevel(){
		
		int rand = new Random().nextInt(10);
		
		return rand;
		
	}


}
