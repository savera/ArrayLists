import java.util.Random;

public class Surpriser {
	
	// Your mission: Use delegation to see what kind of a toy is inside the KinderSurprise
	public static void main(String[] args) {

	KinderSurprise myKinderSurprise = new KinderSurprise(new Egg(new Toy()));
	
	Egg e = myKinderSurprise.getKinderSurpriseContents(); 
	
	Toy t = e.getEggContents();
	
	System.out.println(t.getToy());
	
	}
}

class KinderSurprise {
	
	private Egg egg;

	public KinderSurprise(Egg egg) {
		
		this.egg = egg;
		
	}

	Egg getKinderSurpriseContents() {
		
		return egg;	
	}
}

class Egg {

	private Toy toy;

	public Egg(Toy toy) {
		
		this.toy = toy;
		
	}

	Toy getEggContents() {
		
		return toy; 
	}

}

class Toy {
	
	String getToy() {
		
		int randomToySelector = new Random().nextInt(2);
		
		if (randomToySelector == 0)
			
			return "play doh";
		
		else if (randomToySelector == 1)
			
			return "train";
		
		else
			
			return "spongebob";
	}

}
