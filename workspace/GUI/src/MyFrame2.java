import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame implements ActionListener {
	JButton button = new JButton("Click Me");
	JLabel label = new JLabel("that is enough");
	int count = 0;
	
	public MyFrame2(String title) {
		super(title);
		this.setSize(400,400);
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFrame.setDefaultLookAndFeelDecorated(true);
		Font headlineFont = new Font("Arial",Font.BOLD, 36);
		button.setFont(headlineFont);
		label.setFont(headlineFont);
		button.addActionListener(this);
		this.add(button);
		this.setVisible(true);
		this.label.setVisible(false);
		this.add(label);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame2 one = new MyFrame2("In class 2");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.count++;
		if(count >= 8) {
			button.setEnabled(false);
			label.setVisible(true);
		}
		
	}

}
