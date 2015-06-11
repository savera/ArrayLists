import java.util.ArrayList;

public class Decorater {

	public static void main(String[] args) {

		ArrayList<Ornament> decor = new ArrayList<Ornament>();

		decor.add(new Ornament("red"));

		decor.add(new Ornament("blue"));

		decor.add(new Ornament("green"));

		for (Ornament o : decor) {

			o.hang();

		}
	
		
		

	}

}
