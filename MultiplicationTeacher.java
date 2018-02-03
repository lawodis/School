// Jack Wood
// MultiplicationTeacher.java
// This game asks the user to enter the product of two
// randomly generated numbers in the range 0-9.
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class MultiplicationTeacher extends JFrame
{
   // JLabel and JTextField to question user and get answer
   private JLabel questionJLabel;
   private JTextField answerJTextField;

   // JButton to submit answer
   private JButton submitJButton;

   // JLabel and JTextField to display if user is correct
   private JLabel resultJLabel;
   private JTextField responseJTextField;

   // declare instance variables here
   Random randomMultiple = new Random();
   int multipleOne = 1 + randomMultiple.nextInt( 10 );
   int multipleTwo = 1 + randomMultiple.nextInt( 10 );

   // no-argument constructor
   public MultiplicationTeacher()
   {
      createUserInterface();
   }

   // create and position GUI components; register event handlers
   private void createUserInterface()
   {
      // get content pane for attaching GUI components
      Container contentPane = getContentPane();

      // enable explicit positioning of GUI components
      contentPane.setLayout( null );

      // set up questionJLabel
      questionJLabel = new JLabel();
      questionJLabel.setBounds( 20, 16, 148, 23 );
      questionJLabel.setText( "How much is " + multipleOne + " times " + multipleTwo );
      contentPane.add( questionJLabel );

      // set up answerJTextField
      answerJTextField = new JTextField();
      answerJTextField.setBounds( 176, 16, 48, 21 );
      contentPane.add( answerJTextField );

      // set up submitJButton
      submitJButton = new JButton();
      submitJButton.setBounds( 56, 48, 128, 23 );
      submitJButton.setText( "Submit Answer" );
      contentPane.add( submitJButton );
      submitJButton.addActionListener(

         new ActionListener() // anonymous inner class
         {
            // event handler called when submitJButton is clicked
            public void actionPerformed( ActionEvent event )
            {
               submitJButtonActionPerformed( event );
            }

         } // end anonymous inner class

      ); // end call to addActionListener

      // set up resultJLabel
      resultJLabel = new JLabel();
      resultJLabel.setBounds( 8, 80, 40, 23 );
      resultJLabel.setText( "Result:" );
      contentPane.add( resultJLabel );

      // set up responseJTextField
      responseJTextField = new JTextField();
      responseJTextField.setBounds( 56, 80, 152, 23 );
      responseJTextField.setHorizontalAlignment( JTextField.CENTER );
      responseJTextField.setEditable( false );
      contentPane.add( responseJTextField );

      // set properties of application's window
      setTitle( "Jack Wood" ); // set title bar string
      setSize( 247, 143 );                  // set window size
      setVisible( true );                   // display window

   } // end method createUserInterface

   // determine if user's guess is right
   private void submitJButtonActionPerformed( ActionEvent event )
   {

   } // end method submitJButtonActionPerformed

   // main method
   public static void main( String[] args )
   {
      MultiplicationTeacher application =
         new MultiplicationTeacher();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

   } // end method main

} // end class MultiplicationTeacher