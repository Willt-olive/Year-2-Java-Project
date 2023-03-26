package Assignment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import net.miginfocom.swing.MigLayout;

public class naiveInterface  extends JFrame implements ActionListener{
	int count=0;
	
	public naiveInterface(String title) {
		setTitle("Chances Of Becoming An Entrepenure");
		getContentPane().setBackground(new Color(128, 128, 128));
		getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(10, 10, 357, 324);
		getContentPane().add(panel_1);
		panel_1.setLayout(new MigLayout("", "[29px][][][][][]", "[21px][][][][][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Male or Female");
		panel_1.add(lblNewLabel, "cell 1 1");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		panel_1.add(rdbtnNewRadioButton, "cell 3 1");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		panel_1.add(rdbtnNewRadioButton_1, "cell 5 1");
		
		JLabel lblNewLabel_1 = new JLabel("Parents Job");
		panel_1.add(lblNewLabel_1, "cell 1 3");
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Entrepenure");
		panel_1.add(rdbtnNewRadioButton_2, "cell 3 3");
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Not");
		panel_1.add(rdbtnNewRadioButton_3, "cell 5 3");
		
		JLabel lblNewLabel_2 = new JLabel("Work");
		panel_1.add(lblNewLabel_2, "cell 1 5");
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Yes");
		panel_1.add(rdbtnNewRadioButton_4, "cell 3 5");
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("No");
		panel_1.add(rdbtnNewRadioButton_5, "cell 5 5");
		
		JLabel lblNewLabel_3 = new JLabel("Lives");
		panel_1.add(lblNewLabel_3, "cell 1 7");
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("Urban");
		panel_1.add(rdbtnNewRadioButton_6, "cell 3 7");
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Rural");
		panel_1.add(rdbtnNewRadioButton_7, "cell 5 7");
		
		JLabel lblNewLabel_4 = new JLabel("Takes Business");
		panel_1.add(lblNewLabel_4, "cell 1 9");
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("Yes");
		panel_1.add(rdbtnNewRadioButton_8, "cell 3 9");
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("No");
		panel_1.add(rdbtnNewRadioButton_9, "cell 5 9");
		
		JButton btnNewButton = new JButton("New button");
		panel_1.add(btnNewButton, "cell 3 11");
		JFrame frame = new JFrame(title);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(500, 400);
	    frame.setVisible(true);
	    frame.setBackground(Color.LIGHT_GRAY);
	    frame.getContentPane().setLayout(null);
	    
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
