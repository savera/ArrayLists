import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class comedyCentral implements KeyListener {

	ArrayList<String> joke;

	ArrayList<String> punchline;

	int jokesTotal;

	int punchlineTotal;

	public static void main(String[] args) {

		comedyCentral cc = new comedyCentral();

		cc.frame();

		cc.jokelist();

	}

	public void frame() {

		JFrame f = new JFrame();

		f.setVisible(true);

		f.addKeyListener(this);

	}

	public void jokelist() {

		joke = new ArrayList<String>();

		joke.add("What happens if you eat yeast and shoe polish? ");

		joke.add("Why did the picture go to jail?");

		jokesTotal = joke.size();

		punchline = new ArrayList<String>();

		punchline.add("Every morning you'll rise and shine!");

		punchline.add("Because it was framed!");

		punchlineTotal = punchline.size();

	}

	public void jokeChooser() {

		Random rand = new Random();

		int select = rand.nextInt(jokesTotal);
		
		punchlineChooser(select);

		//return joke.get(select);
		
		JOptionPane.showMessageDialog(null, joke.get(select));
		
		JOptionPane.showMessageDialog(null, punchlineChooser(select));
	

	}

	public String punchlineChooser(int number) {

		return punchline.get(number);

	}

	public void jDecider() {

		

	}

	public void pLDecider() {

		

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

		if (arg0.getKeyCode() == KeyEvent.VK_SPACE) {

			System.out.println("Hola");

			jokeChooser();

		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
