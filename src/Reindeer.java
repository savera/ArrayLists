
public class Reindeer {

	boolean glowingNose; 
	
	String favChristmas; 
	
	String name;
	
	Reindeer(boolean nose, String christmas, String name){
		
		this.favChristmas = christmas; 
		
		this.glowingNose = nose; 
		
		this.name = name; 
		
	}
	
	public String eat(){
		
		
		return "carrots";
		
	}
	
	public void name(){
		
		System.out.println(name);
		
	}
	
}
