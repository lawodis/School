// Jack Wood
// CableBill.java
// This application calculates a cable bill for
// Cox Communications
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class CableBill extends JFrame
{
   // JLabel and JTextField for account number
   private JLabel accountNumberJLabel;
   private JTextField accountNumberJTextField;

   // JLabel and JTextField for basic service
   private JLabel basicJLabel;
   private JTextField basicJTextField;

   // JLabel and JTextField for premium channels
   private JLabel premiumJLabel;
   private JTextField premiumJTextField;

   // JLabel and JTextField for displaying bill amount
   private JLabel billAmountJLabel;
   private JTextField billAmountJTextField;

   // JButton to initiate amount owed calculation
   private JButton calculateJButton;

   // no-argument constructor
   public CableBill()
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

      accountNumberJLabel = new JLabel();
      accountNumberJLabel.setLocation( 16, 16 );
      accountNumberJLabel.setSize( 116, 21 );
      accountNumberJLabel.setText( "Account number:" );
      contentPane.add( accountNumberJLabel );

      accountNumberJTextField = new JTextField();
      accountNumberJTextField.setLocation( 130, 16 );
      accountNumberJTextField.setSize( 96, 21 );
      accountNumberJTextField.setHorizontalAlignment( JLabel.RIGHT );
      contentPane.add( accountNumberJTextField );
      accountNumberJTextField.addKeyListener(

         new KeyAdapter()
         {
            public void keyPressed( KeyEvent event )
            {
               accountNumberJTextFieldKeyPressed( event );
            }

         }
      );

      basicJLabel = new JLabel();
      basicJLabel.setLocation( 16, 56 );
      basicJLabel.setSize( 116, 21 );
      basicJLabel.setText( "Basic connections:" );
      contentPane.add( basicJLabel );

      basicJTextField = new JTextField();
      basicJTextField.setLocation( 130, 56 );
      basicJTextField.setSize( 96, 21 );
      basicJTextField.setHorizontalAlignment( JLabel.RIGHT );
      contentPane.add( basicJTextField );

      premiumJLabel = new JLabel();
      premiumJLabel.setLocation( 16, 96 );
      premiumJLabel.setSize( 116, 21 );
      premiumJLabel.setText( "Premium channels:" );
      contentPane.add( premiumJLabel );

      premiumJTextField = new JTextField();
      premiumJTextField.setLocation( 130, 96 );
      premiumJTextField.setSize( 96, 21 );
      premiumJTextField.setHorizontalAlignment( JLabel.RIGHT );
      contentPane.add( premiumJTextField );

      calculateJButton = new JButton();
      // and register its event handler
      calculateJButton.setLocation( 50, 136 );
      calculateJButton.setSize( 136, 23 );
      calculateJButton.setText( "Calculate Bill" );
      contentPane.add ( calculateJButton );
      calculateJButton.addActionListener(

         new ActionListener()
         {
            public void actionPerformed( ActionEvent event )
            {
               calculateJButtonActionPerformed( event );
            }
         }
      );

      billAmountJLabel = new JLabel();
      billAmountJLabel.setLocation( 16, 176 );
      billAmountJLabel.setSize( 156, 21 );
      billAmountJLabel.setText( "Bill Amount:" );
      contentPane.add( billAmountJLabel );

      billAmountJTextField = new JTextField();
      billAmountJTextField.setLocation( 130, 176 );
      billAmountJTextField.setSize( 96, 21 );
      billAmountJTextField.setHorizontalAlignment( JLabel.RIGHT );
      billAmountJTextField.setEditable( false );
      contentPane.add( billAmountJTextField );

      // set properties of application's window
      setTitle( "Jack Wood" );
      setSize( 250, 280 );
      setVisible( true );

   } // end method createUserInterface

   // method called when key pressed in accountNumberJTextField
   private void accountNumberJTextFieldKeyPressed( KeyEvent event )
   {
      basicJTextField.setText( "" );
      premiumJTextField.setText( "" );
      billAmountJTextField.setText( "" );

   } // end method accountNumberJTextFieldKeyPressed

   // method called when user clicks calculateJButton
   private void calculateJButtonActionPerformed( ActionEvent event )
   {
      // declare variables
      int accountNumber;
      int numberBasic;
      int numberPremium;
      double amountOwed;

      // set up constants for fees
      final double TEN_BASIC = 75.00;
      final double OVER_BASIC = 5;
      final double EIGHT_PREMIUM = 50.00;
      final double OVER_PREMIUM = 40.00;

      // obtain user input
      accountNumber = Integer.parseInt( accountNumberJTextField.getText() );
      numberBasic = Integer.parseInt( basicJTextField.getText() );
      numberPremium = Integer.parseInt( premiumJTextField.getText() );

      // calculate amount owed
      amountOwed = 15;
      if  ( numberBasic <= 10 )
      {
         amountOwed += TEN_BASIC;
      }
      else
      {
         amountOwed += TEN_BASIC + ( numberBasic - 10 ) * OVER_BASIC;
      }

      if ( numberPremium <= 8 )
      {
         amountOwed += numberPremium * EIGHT_PREMIUM;
      }
      else
      {
         amountOwed += 8 * EIGHT_PREMIUM + ( numberPremium - 8 ) * OVER_PREMIUM;
      }

      // specify floating-point number format
      DecimalFormat dollars = new DecimalFormat( "$#,##0.00" );

      // display new balance in billAmountJTextField
      billAmountJTextField.setText( dollars.format( amountOwed ) );

   } // end method calculateJButtonActionPerformed

   // main method
   public static void main( String args[] )
   {
      CableBill application = new CableBill();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

   } // end method main

} // end class CableBill
