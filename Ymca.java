// Jack Wood
// Program: Ymca.java
// This application computes the monthly fee for
// a YMCA membership.
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;

public class Ymca extends JFrame
{
   // JLabel that displays header on application window
   private JLabel ymcaJLabel;

   // JLabel and JTextField for name
   private JLabel nameJLabel;
   private JTextField nameJTextField;

   // JLabel and JTextField for street
   private JLabel streetJLabel;
   private JTextField streetJTextField;

   // JLabel and JTextField for city
   private JLabel cityJLabel;
   private JTextField cityJTextField;

   // JLabel and JTextField for state
   private JLabel stateJLabel;
   private JTextField stateJTextField;

   // JLabel and JTextField for zip
   private JLabel zipJLabel;
   private JTextField zipJTextField;

   // JCheckBox for family
   private JCheckBox familyJCheckBox;

   // JCheckBox for newsletter
   private JCheckBox newsletterJCheckBox;

   // JCheckBox for locker
   private JCheckBox lockerJCheckBox;

   // JLabel for specialProgs
   private JLabel specialProgsJLabel;

   // JCheckBox for yoga
   private JCheckBox yogaJCheckBox;

   // JCheckBox for cycling
   private JCheckBox cyclingJCheckBox;

   // JCheckBox for swimming
   private JCheckBox swimmingJCheckBox;

   // JCheckBox for kiddieProgs
   private JCheckBox kiddieProgsJCheckBox;

   // JCheckBox for fitness
   private JCheckBox fitnessJCheckBox;

   // JButton to initiate calculation of fee
   private JButton calculateJButton;

   // JLabel and JTextField for monthlyFee
   private JLabel monthlyFeeJLabel;
   private JTextField monthlyFeeJTextField;

   // JButton to reset form
   private JButton resetJButton;

   // no-argument constructor
   public Ymca()
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

      // set up ymcaJLabel
      ymcaJLabel = new JLabel();
      ymcaJLabel.setBounds( 64, 8, 392, 40 );
      ymcaJLabel.setText( "YMCA MEMBERSHIP APPLICATION" );
      ymcaJLabel.setFont(
         new Font( "Default", Font.BOLD, 22 ) );
      ymcaJLabel.setHorizontalAlignment(
         JLabel.CENTER );
      contentPane.add( ymcaJLabel );

      // set up nameJLabel
      nameJLabel = new JLabel();
      nameJLabel.setBounds( 16, 56, 88, 24 );
      nameJLabel.setText( "NAME:" );
      contentPane.add( nameJLabel );

      // set up nameJTextField
      nameJTextField = new JTextField();
      nameJTextField.setBounds( 128, 56, 184, 20 );
      contentPane.add( nameJTextField );

      // set up streetJLabel
      streetJLabel = new JLabel();
      streetJLabel.setBounds( 16, 80, 88, 24 );
      streetJLabel.setText( "STREET ADDR:" );
      contentPane.add( streetJLabel );

      // set up streetJTextField
      streetJTextField = new JTextField();
      streetJTextField.setBounds( 128, 80, 184, 20 );
      contentPane.add( streetJTextField );

      // set up cityJLabel
      cityJLabel = new JLabel();
      cityJLabel.setBounds( 16, 104, 88, 24 );
      cityJLabel.setText( "CITY:" );
      contentPane.add( cityJLabel );

      // set up cityJTextField
      cityJTextField = new JTextField();
      cityJTextField.setBounds( 128, 104, 184, 20 );
      contentPane.add( cityJTextField );

      // set up stateJLabel
      stateJLabel = new JLabel();
      stateJLabel.setBounds( 16, 128, 88, 24 );
      stateJLabel.setText( "STATE:" );
      contentPane.add( stateJLabel );

      // set up stateJTextField
      stateJTextField = new JTextField();
      stateJTextField.setBounds( 128, 128, 184, 20 );
      contentPane.add( stateJTextField );

      // set up zipJLabel
      zipJLabel = new JLabel();
      zipJLabel.setBounds( 16, 152, 88, 24 );
      zipJLabel.setText( "ZIP CODE:" );
      contentPane.add( zipJLabel );

      // set up zipJTextField
      zipJTextField = new JTextField();
      zipJTextField.setBounds( 128, 152, 184, 20 );
      contentPane.add( zipJTextField );

      // set up familyJCheckBox
      familyJCheckBox = new JCheckBox();
      familyJCheckBox.setBounds( 56, 184, 150, 24 );
      familyJCheckBox.setText( "Family Membership" );
      contentPane.add( familyJCheckBox );

      // set up newsletterJCheckBox
      newsletterJCheckBox = new JCheckBox();
      newsletterJCheckBox.setBounds( 56, 208, 128, 24 );
      newsletterJCheckBox.setText( "Newsletter" );
      contentPane.add( newsletterJCheckBox );

      // set up lockerJCheckBox
      lockerJCheckBox = new JCheckBox();
      lockerJCheckBox.setBounds( 56, 232, 128, 24 );
      lockerJCheckBox.setText( "Locker Rental" );
      contentPane.add( lockerJCheckBox );

      // set up specialProgsJLabel
      specialProgsJLabel = new JLabel();
      specialProgsJLabel.setBounds( 352, 56, 150, 24 );
      specialProgsJLabel.setText( "SPECIAL PROGRAMS" );
      specialProgsJLabel.setFont(
         new Font( "Default", Font.BOLD, 14 ) );
      contentPane.add( specialProgsJLabel );

      // set up yogaJCheckBox
      yogaJCheckBox = new JCheckBox();
      yogaJCheckBox.setBounds( 344, 96, 136, 24 );
      yogaJCheckBox.setText( "Power Yoga" );
      contentPane.add( yogaJCheckBox );

      // set up cyclingJCheckBox
      cyclingJCheckBox = new JCheckBox();
      cyclingJCheckBox.setBounds( 344, 128, 136, 24 );
      cyclingJCheckBox.setText( "Cycling Class" );
      contentPane.add( cyclingJCheckBox );

      // set up swimmingJCheckBox
      swimmingJCheckBox = new JCheckBox();
      swimmingJCheckBox.setBounds( 344, 160, 136, 24 );
      swimmingJCheckBox.setText( "Swimming" );
      contentPane.add( swimmingJCheckBox );

      // set up kiddieProgsJCheckBox
      kiddieProgsJCheckBox = new JCheckBox();
      kiddieProgsJCheckBox.setBounds( 344, 192, 136, 24 );
      kiddieProgsJCheckBox.setText( "Kiddie Programs" );
      contentPane.add( kiddieProgsJCheckBox );

      // set up fitnessJCheckBox
      fitnessJCheckBox = new JCheckBox();
      fitnessJCheckBox.setBounds( 344, 224, 136, 24 );
      fitnessJCheckBox.setText( "Fitness Center" );
      contentPane.add( fitnessJCheckBox );

      // set up calculateJButton
      calculateJButton = new JButton();
      calculateJButton.setBounds( 40, 272, 168, 32 );
      calculateJButton.setText( "Compute Montly Fee" );
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

      // set up monthlyFeeJLabel
      monthlyFeeJLabel = new JLabel();
      monthlyFeeJLabel.setBounds( 240, 280, 88, 24 );
      monthlyFeeJLabel.setText( "Monthly Fee:" );
      contentPane.add( monthlyFeeJLabel );

      // set up monthlyFeeJTextField
      monthlyFeeJTextField = new JTextField();
      monthlyFeeJTextField.setBounds( 328, 280, 112, 20 );
      monthlyFeeJTextField.setHorizontalAlignment( JTextField.RIGHT );
      monthlyFeeJTextField.setEditable( false );
      contentPane.add( monthlyFeeJTextField );

      // set up resetJButton
      resetJButton = new JButton();
      resetJButton.setBounds( 168, 320, 168, 32 );
      resetJButton.setText( "Reset Form" );
      contentPane.add( resetJButton );
      resetJButton.addActionListener(

         new ActionListener()
         {
            public void actionPerformed( ActionEvent event )
            {
               resetJButtonActionPerformed( event );
            }
         }
      );

      // set properties of application's window
      setTitle( "Jack Wood" ); // set title bar string
      setSize( 534, 408 );          // set window size
      setVisible( true );           // display window

   } // end method createUserInterface

   // calculate monthly fee
   private void calculateJButtonActionPerformed( ActionEvent event )
   {
      String name = nameJTextField.getText();
      String street = streetJTextField.getText();
      String city = cityJTextField.getText();
      String state = stateJTextField.getText();
      String zip = zipJTextField.getText();

      if ( name.equals( "" ) || street.equals( "" ) || city.equals( "" ) || state.equals( "" ) || zip.equals( "" ) )
      {
         JOptionPane.showMessageDialog( null,
         "Please fill in all text fields",
         "Missing Data", JOptionPane.ERROR_MESSAGE );
      }
      else
      {
         int numberSpecial;
         double monthlyFee;

         final double MINIMUM = 40;
         final double FAMILY_MEMBERSHIP = 10;
         final double NEWSLETTER = 1;
         final double LOCKER_RENTAL = 5;
         final double SPECIAL_THREE = 5;
         final double SPECIAL_FOUR = 4;
         numberSpecial = 0;
         monthlyFee = MINIMUM;

         if ( familyJCheckBox.isSelected() )
         {
            monthlyFee += FAMILY_MEMBERSHIP;
         }

         if ( newsletterJCheckBox.isSelected() )
         {
            monthlyFee += NEWSLETTER;
         }

         if ( lockerJCheckBox.isSelected() )
         {
            monthlyFee += LOCKER_RENTAL;
         }

         if ( yogaJCheckBox.isSelected() )
         {
            numberSpecial += 1;
         }
         if ( cyclingJCheckBox.isSelected() )
         {
            numberSpecial += 1;
         }
         if ( swimmingJCheckBox.isSelected() )
         {
            numberSpecial += 1;
         }
         if ( kiddieProgsJCheckBox.isSelected() )
         {
            numberSpecial += 1;
         }
         if ( fitnessJCheckBox.isSelected() )
         {
            numberSpecial += 1;
         }
         if ( numberSpecial <= 3 )
         {
            monthlyFee += numberSpecial * SPECIAL_THREE;
         }
         else
         {
            monthlyFee += numberSpecial * SPECIAL_FOUR;
         }

         DecimalFormat dollars = new DecimalFormat( "$0.00" );

         monthlyFeeJTextField.setText(dollars.format( monthlyFee ) );
      }

   } // end method calculateJButtonActionPerformed

   // reset form
   private void resetJButtonActionPerformed( ActionEvent event )
   {
      // CLEAR ALL TEXTFIELDS AND CHECKBOXES
      nameJTextField.setText( "" );
      streetJTextField.setText( "" );
      cityJTextField.setText( "" );
      stateJTextField.setText( "" );
      zipJTextField.setText( "" );
      familyJCheckBox.setSelected( false );
      newsletterJCheckBox.setSelected( false );;
      lockerJCheckBox.setSelected( false );;
      yogaJCheckBox.setSelected( false );;
      cyclingJCheckBox.setSelected( false );;
      swimmingJCheckBox.setSelected( false );;
      kiddieProgsJCheckBox.setSelected( false );;
      fitnessJCheckBox.setSelected( false );;
      monthlyFeeJTextField.setText( "" );


   }

   // main method
   public static void main( String[] args )
   {

      Ymca application = new Ymca();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

   } // end method main

} // end class Ymca