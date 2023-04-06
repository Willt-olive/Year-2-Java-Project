package Assignment;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class naiveInterface  extends JFrame implements ActionListener{
	
	JFrame frame;
	JButton Save;
	JButton showAll;
	JButton delete;
	JOptionPane newWindow;
	JTextField enterName;
	JTextField enterSurname;
	JTextField enterCity;
	JTextArea textArea;
	
	
	public naiveInterface(String title) {
		
		
		frame = new JFrame(title);
		frame.setVisible(true);
	    frame.setSize(450, 300);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLayout(new FlowLayout());
	    
	    /////////////////////////////////	    
	    
	    Save= new JButton();
	    Save.setText("Save");
	    Save.setToolTipText("This Button Adds Text Field To Array");
	    
	    showAll = new JButton();
	    showAll.setText("Show All");
	    showAll.setToolTipText("This Button Show The Array");
	    
	    delete = new JButton();
	    delete.setText("delete");
	    delete.setToolTipText("This Button Delets The Whole Array");
	    
	    
	    Save.addActionListener(this);
	    showAll.addActionListener(this);
	    delete.addActionListener(this);
	    
	    //////////////////////////////////////////
	    
	    newWindow = new JOptionPane();
	    
	    //////////////////////////////////////////
	    
	    enterName = new JTextField();
	    enterName.setColumns(6);
	    enterName.setToolTipText("Enter your first name here");
	    
	    enterSurname = new JTextField();
	    enterSurname.setColumns(6);
	    enterSurname.setToolTipText("Enter your surname here");
	    
	    enterCity = new JTextField();
	    enterCity.setColumns(6);
	    enterCity.setToolTipText("Enter your city here");
	    
	    //////////////////////////////////////////
	    
	    textArea = new JTextArea();
	    
	    //////////////////////////////////////////
	    
	    frame.add(enterName);
	    frame.add(enterSurname);
	    frame.add(enterCity);
	    frame.add(Save);
	    frame.add(showAll);
	    frame.add(delete);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == Save)
		{
			String name = enterName.getText();
			String surname = enterSurname.getText();
			String city = enterCity.getText();
			
			
			if (name.equals("") || surname.equals("") || city.equals(""))
			{
				JOptionPane.showMessageDialog(this, "Please Fill in Text Fields");
			}
			else
			{
				enterName.setText(null);
				enterSurname.setText(null);
				enterCity.setText(null);
			}
		}
		else if(e.getSource()== showAll)
		{
			frame.add(textArea);
			textArea.setColumns(6);
		}
	}
}
