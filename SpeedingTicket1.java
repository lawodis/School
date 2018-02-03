// Jack Wood
// SpeedingTicket.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class SpeedingTicket extends JFrame
{
   // JLabel and JTextField to input speedLimit
   private JLabel speedLimitJLabel;
   private JTextField speedLimitJTextField;

   // JLabel and JTextField to input ticketed speed
   private JLabel ticketedSpeedJLabel;
   private JTextField ticketedSpeedJTextField;

   // JLabel and JTextField to input classification
   private JLabel classificationJLabel;
   private JTextField classificationJTextField;

   // JLabel and JTextField to display fine
   private JLabel fineJLabel;
   private JTextField fineJTextField;

   // JLabel and JTextField to display total fines
   private JLabel totalFinesJLabel;
   private JTextField totalFinesJTextField;

   // JButton to initiate fine calculation
   private JButton calculateJButton;

   // JButton to reset fields
   private JButton resetJButton;

   // no-argument constructor
   public SpeedingTicket();

   double totalFines;
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

      // set up speedLimitJLabel
      speedLimitJLabel = new JLabel();
      speedLimitJLabel.setBounds( 20, 20, 100, 20 );
      speedLimitJLabel.setText( "Speed Limit:" );
      contentPane.add( speedLimitJLabel );

      // set up speedLimitJTextField
      speedLimitJTextField = new JTextField();
      speedLimitJTextField.setBounds( 140, 20, 90, 20 );
      speedLimitJTextField.setHorizontalAlignment( JTextField.RIGHT );
      contentPane.add( speedLimitJTextField );
      speedLimitJTextField.addKeyListener(

         new KeyListener()
         {
            public void keyPressed( KeyEvent event )
            {
               fineJtextfield.setText( "" );
            }
         }
      );

      // set up ticketedSpeedJLabel
      ticketedSpeedJLabel = new JLabel();
      ticketedSpeedJLabel.setText( "Ticketed Speed:" );
      ticketedSpeedJLabel.setBounds( 20, 60, 100, 20 );
      contentPane.add( ticketedSpeedJLabel );

      // set up ticketedSpeedJTextField
      ticketedSpeedJTextField = new JTextField();
      ticketedSpeedJTextField.setBounds( 140, 60, 90, 20 );
      ticketedSpeedJTextField.setHorizontalAlignment( JTextField.RIGHT );
      contentPane.add( ticketedSpeedJTextField );
      ticketedSpeedJTextField.addKeyListener(

         new KeyListener()
         {
            public void keyPressed( KeyEvent event )
            {
               fineJtextfield.setText( "" );
            }
         }
      );

      // set up classificationJLabel
      classificationJLabel = new JLabel();
      classificationJLabel.setText( "Classification:" );
      classificationJLabel.setBounds( 20, 100, 100, 20 );
      contentPane.add( classificationJLabel );

      // set up classificationJTextField
      classificationJTextField = new JTextField();
      classificationJTextField.setBounds( 140, 100, 90, 20 );
      classificationJTextField.setHorizontalAlignment( JTextField.RIGHT );
      contentPane.add( classificationJTextField );
      classification.addKeyListener(

         new KeyListener()
         {
            public void keyPressed( KeyEvent event )
            {
               fineJtextfield.setText( "" );
            }
         }
      );

      // set up calculateJButton
      calculateJButton = new JButton();
      calculateJButton.setBounds( 80, 140, 90, 25 );
      calculateJButton.setText( "Calculate" );
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


      // set up fineJLabel
      fineJLabel = new JLabel();
      fineJLabel.setText( "Fine:" );
      fineJLabel.setBounds( 20, 180, 100, 20 );
      contentPane.add( fineJLabel );

      // set up fineJTextField
      fineJTextField = new JTextField();
      fineJTextField.setBounds( 140, 180, 90, 20 );
      fineJTextField.setHorizontalAlignment( JTextField.RIGHT );
      contentPane.add( fineJTextField );

      // set up totalFinesJLabel
      totalFinesJLabel = new JLabel();
      totalFinesJLabel.setText( "Total Fines:" );
      totalFinesJLabel.setBounds( 20, 220, 100, 20 );
      contentPane.add( totalFinesJLabel );

      // set up totalFinesJTextField
      totalFinesJTextField = new JTextField();
      totalFinesJTextField.setBounds( 140, 220, 90, 20 );
      totalFinesJTextField.setHorizontalAlignment( JTextField.RIGHT );
      contentPane.add( totalFinesJTextField );

      // set up resetJButton
      resetJButton = new JButton();
      resetJButton.setBounds( 80, 260, 90, 25 );
      resetJButton.setText( "Reset" );
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
      setTitle( "Jack Wood" ); // set window title
      setSize( 275, 350 );                 // set window size
      setVisible( true );                  // display window

   } // end method createUserInterface

   private void resetJButtonActionPerformed( ActionEvent event )
   {
      speedLimitJTextField.setText( "" );
      ticketedSpeedJTextField.setText( "" );
      classificationJTextField.setText( "" );
      fineJTextField.setText( "" );
      totalFinesJTextField.setText( "" );

      totalFines = 0;

      speedLimitJTextField.requestFocusInWindow();
   }

   private void calculateJButtonActionPerformed( ActionEvent event )
   {
      String limitInput = speedLimitJTextField.getText();
      String ticketedInput = ticketedSpeedJTextField.getText();
      String classificationInput = classificationJTextField.getText();

      int speedLimit;
      int ticketedSpeed;
      int classification;

      speedLimit = Integer.parseInt( speedLimitJTextField );
      ticketeSpeed = Integer.parseInt( ticketedSpeedJTextField );
      classification = Integer.parseInt(classificationJTextField );

      if ( limitInput = "" || speedLimit <= 0 )
      {
         JOptionPane.showMessageDialog( null,
         "Invalid Speed Limit " + limitInput + " Please enter a positive speed.",
         "Error", JOptionPane.WARNING_MESSAGE );

         speedLimitJTextField.setText( "" );
         speedLimitJTextField.requestFocusInWindow();
      }
      if ( ticketedInput = "" || ticketedSpeed <= 0 )
      {
         JOptionPane.showMessageDialog( null,
         "Invalid Tickted Speed " + ticketedInput + "Please enter a positive ticketed speed",
         "Error", JOptionPane.WARNING_MESSAGE );

         ticketedSpeedJTextField.setText( "" );
         ticketedSpeedJTextField.requestFocusInWindow();
      }
      if ( classificationInput = "" || classification < 1 && classification > 4)
      {
         JOptionPane.showMessageDialog( null,
         "Invalid Classifcation" + classficationInput + "Please enter an integer between 1 and 4",
         "Error", JOptionPane.WARNING_MESSAGE );

         classificationJTextField.setText( "" );
         classificationJTextField.requestFocusInWindow();
      }
      else
      {
         double fine;
         final double BASE_FINE = 75;
         final double ADDITIONAL_FINE = 87.50;

         if ( ticketedSpeed <= speedLimit )
         {
            fine = 0;
         }
         else
         {
            int additionalMultiplier;

            fine = baseFine;

            additionalMultiplier = ( ticketedSpeed - speedLimit ) / 5;

            if ( ( ticketedSpeed - speedLimit ) % 5 > 0 )
            {
               additionalMultiplier++;
            }

            fine += additionalMultiplier * ADDITIONAL_FINE;

            switch ( classification )
            {
               case 1:
                  if ( ticketedSpeed - speedLimit <= 20 )
                  {
                     fine -= 20;
                  }
                  else
                  {
                     fine += 100;
                  }
               break;

               case 2:
               case 3:
                  if ( ticketedSpeed - speedLimit > 20 )
                  {
                     fine += 100;
                  }
               break;
               case 4:
                  if ( ticketedSpeed - speedLimit <= 20 )
                  {
                     fine += 50;
                  }
                  else
                  {
                     fine += 200;
                  }
               break;
            }

            totalFine += fine;

            DecimalFormat dollars = new DecimalFormat( "$#,##0.00" );

            fineJTextField.setText( dollars.format( fine ) );
            totalFinesJTextField.setText( dollars.format( totalFines ) );

            speedLimitJTextField.setText( "" );
            ticketedSpeedJTextField.setText( "" );
            classficationJTextField.setText( "" );

            speedLimitJTextField.requestFocusInWindow();
         }
      }
   }



   // main method
   public static void main( String[] args )
   {
      SpeedingTicket application = new SpeedingTicket();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

   } // end method main

} // end class SpeedingTicket