import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;


public class JMyFrame extends JFrame implements ActionListener, ItemListener{
	int width = 250;
	int height = 250;
	JLabel label1 = new JLabel("Enter your name");
	JTextField textField1 = new JTextField(30);
	JButton button1 = new JButton("Enter name & Click Me");
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel("Check box to clear");
	JCheckBox box = new JCheckBox("CheckBox to clear");
	JComboBox cbox = new JComboBox();
	String[] countries = {"Ireland", "Italy", "Austria"};
	
	
	public JMyFrame() {
		super("My frame ");
		this.setLayout(new FlowLayout());
		this.setSize(400,400);
		button1.setToolTipText("This button starts the process ");
		button1.addActionListener(this);
		box.addItemListener(this);
		cbox.addItemListener(this);
		JFrame.setDefaultLookAndFeelDecorated(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(label1);
		this.add(textField1);
		this.add(button1);
		this.add(label2);
		this.add(label3);
		this.add(box);
		this.cbox.addItem(countries[0]);
		this.cbox.addItem(countries[1]);
		this.cbox.addItem(countries[2]);
		this.add(cbox);
		this.setVisible(true);

	}
	public static void main(String[] args) {
		JMyFrame one = new JMyFrame();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		label2.setText("\nThank You " + textField1.getText());
		
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		textField1.setText("");
		label2.setText("");
		box.setSelected(false);
		String text = (String)cbox.getSelectedItem();
		if(e.getSource() == cbox) {
			label3.setText(text);
		}
		
	}

}
