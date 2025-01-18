import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	JLabel line1 = new JLabel();
	JLabel line2 = new JLabel();
	JLabel line3 = new JLabel();
	JButton button1 = new JButton("Click Me");
	
	
	

	public MyFrame(String title) {
		super(title);
		this.setSize(400,400);
		this.setLayout(new FlowLayout());
		Font headlineFont = new Font("Arial",Font.BOLD, 36);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFrame.setDefaultLookAndFeelDecorated(true);
		this.line1.setText("It was the best of times");
		this.line2.setText("It was the worst of times");
		this.line1.setFont(headlineFont);
		this.line2.setFont(headlineFont);
		this.line3.setFont(headlineFont);
		this.add(line1);
		this.add(line2);
		this.add(button1);
		this.add(line3);
		button1.addActionListener(this);
		this.setVisible(true);
	
	}

	public static void main(String[] args) {
		MyFrame one = new MyFrame("In class 2");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		line3.setText("Charles Dickens");
		
	}

}
