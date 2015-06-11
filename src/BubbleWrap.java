import java.util.ArrayList;

public class BubbleWrap {
	public static void main(String[] args) {

		ArrayList<Bubble> bubbles = new ArrayList<Bubble>();

		bubbles.add(new Bubble());

		bubbles.add(new Bubble());

		bubbles.add(new Bubble());

		bubbles.add(new Bubble());

		for (int i = 0; i < bubbles.size(); i++) {

			bubbles.get(i);

			Bubble.pop();

		}

	}
}
