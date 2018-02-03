// Jack Wood
// Application that finds the cost of carpeting a room.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Carpet extends JFrame
{
   // JLabel and JTextField for user to input length
   private JLabel lengthJLabel;
   private JTextField lengthJTextField;

   // JLabel and JTextField for user to input width
   private JLabel widthJLabel;
   private JTextField widthJTextField;

   // JLabel and JTextField for user to input cost per sq yard
   private JLabel costPerSqYardJLabel;
   private JTextField costPerSqYardJTextField;

   // JLabel and JTextField to display cost of carpet
   private JLabel costOfCarpetJLabel;
   private JTextField costOfCarpetJTextField;

   // JButton to initiate cost calculation
   private JButton calculateJButton;

   // no-argument constructor
   public Carpet()
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

      // set up lengthJLabel
      lengthJLabel = new JLabel();
      lengthJLabel.setText( "Enter length (feet):" );
      lengthJLabel.setBounds( 20, 20, 130, 20 );
      contentPane.add( lengthJLabel );

      // set up lengthJTextField
      lengthJTextField = new JTextField();
      lengthJTextField.setText( "0" );
      lengthJTextField.setBounds( 165, 20, 40, 20 );
      lengthJTextField.setHorizontalAlignment( JLabel.RIGHT );
      contentPane.add( lengthJTextField );
      lengthJTextField.addKeyListener(

            new KeyAdapter()
            {

               public void keyPressed( KeyEvent event )
               {
                  lengthJTextFieldKeyPressed( event );
               }

            }

      );

      // set up widthJLabel
      widthJLabel = new JLabel();
      widthJLabel.setText( "Enter width (feet):" );
      widthJLabel.setBounds( 20, 50, 130, 20 );
      contentPane.add( widthJLabel );

      // set up widthJTextField
      widthJTextField = new JTextField();
      widthJTextField.setText( "0" );
      widthJTextField.setBounds( 165, 50, 40, 20 );
      widthJTextField.setHorizontalAlignment( JLabel.RIGHT );
      contentPane.add( widthJTextField );
      // INSERT CODE TO ADD A KeyListener TO widthJTextField
      // ITS keyPressed METHOD SHOULD CALL widthJTextFieldKeyPressed
      widthJTextField.addKeyListener(

            new KeyAdapter()
            {

               public void keyPressed( KeyEvent event )
               {
                  widthJTextFieldKeyPressed( event );
               }

            }

      );


      // set up costPerSqYardJLabel
      costPerSqYardJLabel = new JLabel();
      costPerSqYardJLabel.setText( "Enter cost per sq yard:" );
      costPerSqYardJLabel.setBounds ( 20, 80, 130, 20 );
      contentPane.add( costPerSqYardJLabel );

      // set up costPerSqYardJTextField
      costPerSqYardJTextField = new JTextField();
      costPerSqYardJTextField.setText( "0" );
      costPerSqYardJTextField.setBounds( 165, 80, 40, 20 );
      costPerSqYardJTextField.setHorizontalAlignment( JLabel.RIGHT );
      contentPane.add( costPerSqYardJTextField );
      costPerSqYardJTextField.addKeyListener(

         new KeyAdapter()
         {

            public void keyPressed( KeyEvent event )
            {
               costPerSqYardJTextFieldKeyPressed( event );
            }

         }

      );

      // set up costOfCarpetJLabel
      costOfCarpetJLabel = new JLabel();
      costOfCarpetJLabel.setText( "Cost of carpet is:" );
      costOfCarpetJLabel.setBounds( 20, 110, 130, 20 );
      contentPane.add( costOfCarpetJLabel );

      // set up costOfCarpetJTextField
      costOfCarpetJTextField = new JTextField();
      costOfCarpetJTextField.setText( "0" );
      costOfCarpetJTextField.setEditable( true );
      costOfCarpetJTextField.setBounds( 165, 110, 40, 20 );
      costOfCarpetJTextField.setHorizontalAlignment( JLabel.RIGHT );
      contentPane.add( costOfCarpetJTextField );

      // set up calculateJButton
      calculateJButton = new JButton ();
      calculateJButton.setText( "Calculate" );
      calculateJButton.setBounds(225, 20, 90, 20 );
      contentPane.add( calculateJButton );
      calculateJButton.addActionListener(

         new ActionListener()
         {
            public void actionPerformed( ActionEvent event )
            {
               calculateJButtonActionPerformed( event );
            }

         }

      );


      // set properties of window
      setTitle( "Jack Wood" );
      setSize( 335, 180 );       // set window size
      setVisible( true );        // display window

   } // end method createUserInterface

   // clear resultJTextField because the value is now invalid
   private void lengthJTextFieldKeyPressed( KeyEvent event )
   {
       costOfCarpetJTextField.setText( "" );

   } // end method lengthKeyPressed

   // clear costOfCarpetJTextField because the value is now invalid
   private void widthJTextFieldKeyPressed( KeyEvent event )
   {
       costOfCarpetJTextField.setText( "" );

   } // end method widthKeyPressed

   // clear costOfCarpetJTextField because the value is now invalid
   private void costPerSqYardJTextFieldKeyPressed( KeyEvent event )
   {
       costOfCarpetJTextField.setText( "" );
   } // end method costPerSqYardKeyPressed

   // calculate the average of the three values
   private void calculateJButtonActionPerformed( ActionEvent event )
   {
      // DECLARE 3 INTEGER VARIABLES FOR THE INPUT DATA
      int carpetLength;
      int carpetWidth;
      int costPerYard;

      carpetLength = Integer.parseInt( lengthJTextField.getText() );
      carpetWidth = Integer.parseInt( widthJTextField.getText() );
      costPerYard = Integer.parseInt( costPerSqYardJTextField.getText() );

      int totalCost;

      totalCost = (carpetLength * carpetWidth / 9) * costPerYard;

      costOfCarpetJTextField.setText( String.valueOf( totalCost ) );

   } // end method calculateJButtonActionPerformed

   // main method
   public static void main( String[] args )
   {
      Carpet application = new Carpet();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

   } // end method main

} // end class Carpet