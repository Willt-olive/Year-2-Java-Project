package Assignment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class naiveInterface  extends JFrame implements ActionListener{
	
	JFrame frame;
	JButton Button1;
	JButton Button2;
	ButtonGroup G1;
	JRadioButton jRadioButton1;
	JRadioButton jRadioButton2;
	ButtonGroup G2;
	JRadioButton jRadioButton3;
	JRadioButton jRadioButton4;
	ButtonGroup G3;
	JRadioButton jRadioButton5;
	JRadioButton jRadioButton6;
	ButtonGroup G4;
	JRadioButton jRadioButton7;
	JRadioButton jRadioButton8;
	ButtonGroup G5;
	JRadioButton jRadioButton9;
	JRadioButton jRadioButton10;
	JLabel label1;
	JLabel label2;
	JLabel label3;
	JLabel label4;
	JLabel label5;
	JOptionPane newWindow;
	
	
	public naiveInterface(String title) {
		
		
		frame = new JFrame(title);
		frame.setVisible(true);
	    frame.setSize(290, 300);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLayout(new FlowLayout());
	    
	    /////////////////////////////////	    
	    
	    Button1 = new JButton();
	    Button1.setText("Enter");
	    Button1.setToolTipText("Enter Data");
	    
	    Button2 = new JButton();
	    Button2.setText("Test");
	    Button2.setToolTipText("Test Data");
	    
	    Button1.addActionListener(this);
	    Button2.addActionListener(this);
	    
	    //////////////////////////////////////////
	    
	    newWindow = new JOptionPane();
	    
	    //////////////////////////////////////////
	    
	    jRadioButton1 = new JRadioButton();
		jRadioButton1.setText("Male");
		
		jRadioButton2 = new JRadioButton();
		jRadioButton2.setText("Female");
		
		jRadioButton3 = new JRadioButton();
		jRadioButton3.setText("Yes");
		
		jRadioButton4 = new JRadioButton();
		jRadioButton4.setText("No");
	
		jRadioButton5 = new JRadioButton();
		jRadioButton5.setText("Yes");
		
		jRadioButton6 = new JRadioButton();
		jRadioButton6.setText("No");
		
		jRadioButton7 = new JRadioButton();
		jRadioButton7.setText("Rural");
	
		jRadioButton8 = new JRadioButton();
		jRadioButton8.setText("Urban");
		
		jRadioButton9 = new JRadioButton();
		jRadioButton9.setText("Yes");
		
		jRadioButton10 = new JRadioButton();
		jRadioButton10.setText("No");
	    
	    //////////////////////////////////////////
		
		label1 = new JLabel();
		label1.setText("Gender :");
		
		label2 = new JLabel();
		label2.setText("Parents have own business :");
		
		label3 = new JLabel();
		label3.setText("Part Time Job :");
		
		label4 = new JLabel();
		label4.setText("Live Rural or Urban :");
		
		label5 = new JLabel();
		label5.setText("Studies Business :");

		
		//////////////////////////////////////////
	    
		G1 = new ButtonGroup();
		G2 = new ButtonGroup();
		G3 = new ButtonGroup();
		G4 = new ButtonGroup();
		G5 = new ButtonGroup();
	    
	    //////////////////////////////////////////
	    
	    frame.add(label1);
	    frame.add(jRadioButton1);
	    frame.add(jRadioButton2);
	    G1.add(jRadioButton1);
		G1.add(jRadioButton2);
	    frame.add(label2);
	    frame.add(jRadioButton3);
	    frame.add(jRadioButton4);
	    G2.add(jRadioButton3);
		G2.add(jRadioButton4);
	    frame.add(label3);
	    frame.add(jRadioButton5);
	    frame.add(jRadioButton6);
	    G3.add(jRadioButton5);
		G3.add(jRadioButton6);
	    frame.add(label4);
	    frame.add(jRadioButton7);
	    frame.add(jRadioButton8);
	    G4.add(jRadioButton7);
		G4.add(jRadioButton8);
	    frame.add(label5);
	    frame.add(jRadioButton9);
	    frame.add(jRadioButton10);
	    G5.add(jRadioButton9);
		G5.add(jRadioButton10);
	    frame.add(Button1);
	    frame.add(Button2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == Button1)
		{
			JOptionPane.showMessageDialog(this, "Please Fill in Text Fields");
		}
		else if(e.getSource()== Button2)
		{
			JOptionPane.showMessageDialog(this, "Please Fill in Text Fields");
		}
	}
}
