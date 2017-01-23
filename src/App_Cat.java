import javax.swing.JFrame;
import javax.swing.JPanel;


public class App_Cat extends JFrame {

	public static void main(String[] args) {
		new App_Cat();

	}
	
	public App_Cat() {

		this.setLocationRelativeTo(null);
		this.setTitle("Cat_UI v0.1");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel thePanel = new JPanel();
		
		
		this.add(thePanel);
		this.setVisible(true);
	}

}
