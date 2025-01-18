import java.awt.*;


import javax.swing.*;

public class JFrame1 {

	public static void main(String[] args) {
		int WIDTH=250;
		int HEIGHT = 200;
		Font headlineFont = new Font("Arial",Font.BOLD, 36);
		JFrame aFrame = new JFrame("First Frame");
		aFrame.setLayout(new FlowLayout());
		JFrame.setDefaultLookAndFeelDecorated(false);
		aFrame.setSize(WIDTH, HEIGHT);
		aFrame.setVisible(true);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel greeting  = new JLabel("Good day");
		greeting.setFont(headlineFont);
		aFrame.add(greeting);
		JLabel label2 = new JLabel("Hello from room 201");
		label2.setFont(headlineFont);
		aFrame.add(label2);
	}

}
