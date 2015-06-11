import java.util.ArrayList;

public class SantasReindeers {

	public static void main(String[] args) {

		ArrayList<Reindeer> reindeer = new ArrayList<Reindeer>();

		reindeer.add(new Reindeer(true, "Year I led Santa's sleigh!", "Roudlph"));

		reindeer.add(new Reindeer(false, "Any year!", "Dasher"));

		reindeer.add(new Reindeer(false, "I don't have an answer!", "Prancer"));

		for (Reindeer r : reindeer) {

			r.eat();

		}

		for (Reindeer r : reindeer) {

			r.name();

		}

	}

}
