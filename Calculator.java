/*
 * Marciana Davis
 * CSCI 185 M01
 * Programming Assignment 6
 * Successful Debugging: December 8, 2015
  */
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*; 
 
public class Calculator {
	  // Creating text fields for two numbers and sum and difference of them
	  private JTextField jtfFN = new JTextField();
	  private JTextField jtfSN = new JTextField();
	  private JTextField jtfA = new JTextField();
	
	  // Declare and create Add, Subtract, and Reset button
	  private JButton jbtSubtract = new JButton("Subtract");
	  private JButton jbtAdd = new JButton("Add");
	  private JButton jbtReset = new JButton("Reset");
	  
	  // Adding details to the calculator
      public void init() {
	       jtfA.setEditable(false);   // Set properties on the text fields
	       jtfFN.setHorizontalAlignment(JTextField.RIGHT); // Right align text fields
	       jtfSN.setHorizontalAlignment(JTextField.RIGHT);
	       jtfA.setHorizontalAlignment(JTextField.RIGHT);
	     
	    // Creating pl1 to hold labels and text fields on applet
	       JPanel pl1 = new JPanel(new GridLayout(3, 2));   //Layout 3 rows 2 columns
	       pl1.add(new JLabel("First Number: "));
	       pl1.add(jtfFN);
	       pl1.add(new JLabel("Second Number: "));
	       pl1.add(jtfSN);
	       pl1.add(new JLabel("Answer"));
	       pl1.add(jtfA);
	
	       pl1.setBorder(new TitledBorder("Please enter two numbers:"));// Directions for the applet
	      // Panel pl2 to hold the button
	       JPanel pl2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	       pl2.add(jbtAdd);
	       pl2.add(jbtSubtract);
	       pl2.add(jbtReset);
	       
	       
	       
	 public static void main(String[] args) {
		JFrame f = new JFrame("CalculatorAddSubtract.class");
	       f.setSize(400, 300);
	        f.setVisible(true);
		}

	     

	 
	      // Add the components to the applet
	          add(pl1, BorderLayout.CENTER);
	          add(pl2, BorderLayout.SOUTH);
	 
	       // Register listener
	           jbtAdd.addActionListener(new ButtonListener());
	           jbtReset.addActionListener(new ButtonListener());
	        }
}
