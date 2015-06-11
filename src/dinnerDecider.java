import java.util.ArrayList;
import java.util.Random;



public class dinnerDecider {
	
	static int numberItems;
	
	static ArrayList<String> dinner;
	
public static void main(String[] args) {

	String pasta; 
	
	dinner = new ArrayList<String>();
	
	dinner.add("Pasta"); 
	
	dinner.add("Pizza"); 
	
	dinner.add("Tacos"); 
	
	dinner.add("Orange Chicken"); 
	
	numberItems = dinner.size();
	
	System.out.println("Youre dinner tonight is..." + decideDinner());
	
}
     static String decideDinner(){
    	 
    	 Random random = new Random(); 
    	 
    	 System.out.println(numberItems);
    	 
    	 int selection = random.nextInt(numberItems);
    	 
    	 System.out.println(selection);
    	 
    	 return dinner.get(selection);
    	 
     }
	
}
