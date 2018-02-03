// Jack Wood
// Population.java
// Calculate the population of a city
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;

public class Population extends JFrame
{
   // JLabel and JTextField for initial population
   private JLabel populationJLabel;
   private JTextField populationJTextField;

   // JLabel and JSpinner for growth rate
   private JLabel growthRateJLabel;
   private JSpinner growthRateJSpinner;

   // JLabel and JSpinner for the number of years
   private JLabel yearsJLabel;
   private JSpinner yearsJSpinner;

   // JLabel and JTextArea display population at
   // the end of each year up to number of years entered
   private JLabel populationReportJLabel;
   private JTextArea populationReportJTextArea;

   // JScrollPane adds scrollbars to JTextArea for lengthy output
   private JScrollPane populationReportJScrollPane;

   // JButton calculates amount on deposit at the
   // end of each year up to number of years entered
   private JButton calculateJButton;

   // no-argument constructor
   public Population()
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

      populationJLabel = new JLabel();
      populationJLabel.setBounds( 16, 16, 130, 24 );
      populationJLabel.setText( "Current Population:" );
      contentPane.add( populationJLabel );

      populationJTextField = new JTextField();
      populationJTextField.setBounds( 140, 16, 110, 24);
      contentPane.add( populationJTextField );
      populationJTextField.addActionListener(

         new ActionListener()
         {
            public void actionPerformed( ActionEvent event )
            {
               populationReportJTextArea.setText( "" );
            }
         }
      );

      growthRateJLabel = new JLabel();
      growthRateJLabel.setBounds( 16, 56, 130, 24 );
      growthRateJLabel.setText( "Growth Rate" );
      contentPane.add( growthRateJLabel );

      growthRateJSpinner = new JSpinner( new SpinnerNumberModel( 1, -10, 10, 1) );
      growthRateJSpinner.setBounds( 140, 56, 110, 24 );
      contentPane.add( growthRateJSpinner );

      yearsJLabel = new JLabel();
      yearsJLabel.setBounds( 16, 96, 130, 24 );
      yearsJLabel.setText( "Years:" );
      contentPane.add( yearsJLabel );

      yearsJSpinner = new JSpinner( new SpinnerNumberModel( 1, 1, 10, 1) );
      yearsJSpinner.setBounds( 140, 96, 110, 24 );
      contentPane.add( yearsJSpinner );

      populationReportJLabel = new JLabel();
      populationReportJLabel.setBounds( 16, 175, 150, 24 );
      populationReportJLabel.setText( "Projected Population:" );
      contentPane.add( populationReportJLabel );

      populationReportJTextArea = new JTextArea();
      populationReportJTextArea.setEditable( false );

      populationReportJScrollPane = new JScrollPane( populationReportJTextArea );
      populationReportJScrollPane.setBounds( 16, 200, 235, 92 );
      contentPane.add( populationReportJScrollPane );

      calculateJButton = new JButton();
      calculateJButton.setBounds( 86, 136, 100, 24 );
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

      setTitle( "Jack Wood" );
      setSize( 275, 350 );
      setVisible( true );

   } // end method createUserInterface

   // write methods as needed
   private void calculateJButtonActionPerformed( ActionEvent event )
   {
      String populationInput = populationJTextField.getText();
      int population;

      population = Integer.parseInt( populationJTextField.getText() );

      if ( populationInput.equals( "" ) || population < 0 )
      {
         JOptionPane.showMessageDialog( null,
         "Please fill in a non-negative value for the Population",
         "Invalid Population", JOptionPane.ERROR_MESSAGE );
      }
      else
      {
         Integer rateObject = ( Integer ) growthRateJSpinner.getValue();
         int rate = rateObject.intValue();

         Integer yearsObject = ( Integer ) yearsJSpinner.getValue();
         int years = yearsObject.intValue();

         populationReportJTextArea.setText( "Year\tPopulation");
         DecimalFormat people = new DecimalFormat( "#,##0" );

         for ( int count = 1; count <= years; count++ )
         {
            population += population * rate / 100;
            populationReportJTextArea.append( "\n" + count + "\t" +
               people.format( population ) );

         }

      }

   }

   // main method
   public static void main( String args[] )
   {
      Population application = new Population();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

   } // end method main

} // end class Population