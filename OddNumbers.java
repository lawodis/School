// Exercise 8.16: OddNumbers.java
// Displays a table of odd numbers up to a given limit.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OddNumbers extends JFrame
{
   // JLabel and JTextField to input limit
   private JLabel limitJLabel;
   private JTextField limitJTextField;

   // JButton to initiate display of odd integers
   private JButton viewJButton;

   // JTextArea to display results
   private JTextArea outputJTextArea;
   
   // no-argument constructor
   public OddNumbers()
   {
      createUserInterface();
   }
   
   // create and position the GUI components; register event handlers
   public void createUserInterface()
   {
      // get content pane for attaching GUI components
      Container contentPane = getContentPane();
      
      // enable explicit positioning of GUI components
      contentPane.setLayout( null );
      
      // set up limitJLabel
      limitJLabel = new JLabel();
      limitJLabel.setBounds( 16, 16, 64, 26 );
      limitJLabel.setText( "Upper limit:" );
      contentPane.add( limitJLabel );
      
      // set up limitJTextField
      limitJTextField = new JTextField();
      limitJTextField.setBounds( 96, 16, 55, 26 );
      limitJTextField.setHorizontalAlignment( JTextField.RIGHT );
      contentPane.add( limitJTextField );
      
      // set up viewJButton
      viewJButton = new JButton();
      viewJButton.setBounds( 168, 16, 90, 26 );
      viewJButton.setText( "View" );
      contentPane.add( viewJButton );
      viewJButton.addActionListener(
         
         new ActionListener() // anonymous inner class
         {
             // event handler called when user clicks viewJButton 
             public void actionPerformed( ActionEvent event )
             {
                viewJButtonActionPerformed( event );
             }

         } // end anonymous inner class

      ); // end call to addActionListener
           
      // set up outputJTextArea
      outputJTextArea = new JTextArea();
      outputJTextArea.setEditable( false );

      // set up scrollJScrollPane to allow outputJTextArea scrolling
      JScrollPane scrollJScrollPane = 
         new JScrollPane( outputJTextArea );
      scrollJScrollPane.setBounds( 16, 56, 242, 95 );
      contentPane.add( scrollJScrollPane );
      
      // set properties of application's window
      setTitle( "Odd Numbers" ); // set title bar text
      setSize( 282, 192 );       // set windows's size
      setVisible( true );        // display window
      
   } // end method createUserInterface
   
   // called when user clicks viewJButton
   public void viewJButtonActionPerformed( ActionEvent event )
   {
      int counter = 1;
      int limit = Integer.parseInt( limitJTextField.getText() );
      
      // display header
      outputJTextArea.setText( "Odd numbers:" );

      // get odd numbers
      while ( counter <= limit )
      {
         if ( ( counter % 2 ) != 0 )
         {
            outputJTextArea.append( "\n" + counter );
         }

         limit++;  // increment counter

      } // end while
   
   } // end method viewJButtonActionPerformed
   
   // main method
   public static void main( String[] args )
   {
      OddNumbers application = new OddNumbers();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

   } // end method main

} // end class OddNumbers

 /**************************************************************************
  * (C) Copyright 1992-2004 by Deitel & Associates, Inc. and               *
  * Pearson Education, Inc. All Rights Reserved.                           *
  *                                                                        *
  * DISCLAIMER: The authors and publisher of this book have used their     *
  * best efforts in preparing the book. These efforts include the          *
  * development, research, and testing of the theories and programs        *
  * to determine their effectiveness. The authors and publisher make       *
  * no warranty of any kind, expressed or implied, with regard to these    *
  * programs or to the documentation contained in these books. The authors *
  * and publisher shall not be liable in any event for incidental or       *
  * consequential damages in connection with, or arising out of, the       *
  * furnishing, performance, or use of these programs.                     *
  **************************************************************************/