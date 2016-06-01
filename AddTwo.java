import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class  AddTwo extends JApplet {
  // Declare and create text fields for two numbers and sum of them
  private JTextField jtfFirstNumber = new JTextField();
  private JTextField jtfSecondNumber = new JTextField();
  private JTextField jtfResult = new JTextField();

  // Declare and create Add and Reset button
  private JButton jbtAdd = new JButton("Add");
  private JButton jbtReset = new JButton("Reset");
  private JButton jbtSubtract = new JButton("Subtract");
 

public void init() {
    jtfResult.setEditable(false);   // Set properties on the text fields
    jtfFirstNumber.setHorizontalAlignment(JTextField.RIGHT); // Right align text fields
    jtfSecondNumber.setHorizontalAlignment(JTextField.RIGHT);
    jtfResult.setHorizontalAlignment(JTextField.RIGHT);
  
 // Panel p1 to hold labels and text fields
    JPanel p1 = new JPanel(new GridLayout(3, 2));    //Layout 3 rows 2 columns
    p1.add(new JLabel("First Number"));
    p1.add(jtfFirstNumber);
    p1.add(new JLabel("Second Number"));
    p1.add(jtfSecondNumber);
    p1.add(new JLabel("Result"));
    p1.add(jtfResult);
  
    p1.setBorder(new TitledBorder("Enter two numbers"));

   // Panel p2 to hold the button
       JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
       p2.add(jbtAdd);
       p2.add(jbtReset);
       p2.add(jbtSubtract);

   // Add the components to the applet
       add(p1, BorderLayout.CENTER);
       add(p2, BorderLayout.SOUTH);

    // Register listener
        jbtAdd.addActionListener(new ButtonListener());
        jbtSubtract.addActionListener(new ButtonListener());
        jbtReset.addActionListener(new ButtonListener());
     }

private class ButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      // Get values from text fields
      double firstNumber = Double.parseDouble(jtfFirstNumber.getText());
     
      double secondNumber = Double.parseDouble(jtfSecondNumber.getText());

      // Display result 
      if (e.getActionCommand().equals("Add"))
         jtfResult.setText(String.format("%.2f", firstNumber+secondNumber));
      
      if(e.getActionCommand().equals("Subtract"))
    	  jtfResult.setText(String.format("%.2f", firstNumber-secondNumber));
         	          
      if (e.getActionCommand ().equals("Reset"))
          {   jtfFirstNumber.setText("");
              jtfSecondNumber.setText("");
              jtfResult.setText("");
          } //end if
           
    }//end of method actionPerformed
  } //end of class ButtonListener
} //end of class AddTwo
