// Jack Wood
// Assignment Survey.java
// Application summarized results of a survey
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class Survey extends JFrame
{
   // JLabel and JTextField read response
   private JLabel responseJLabel;
   private JTextField responseJTextField;

   // JButton initiates display of results
   private JButton summaryJButton;

   // JTextArea for survey results
   private JTextArea resultsJTextArea;

   private JScrollPane scrollerJScrollPane;

   // JButton resets to start again
   private JButton resetJButton;

   int agree = 0;
   int disagree = 0;
   int noOpinion = 0;

   // no-argument constructor
   public Survey()
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

      // set up responseJLabel
      responseJLabel = new JLabel();
      responseJLabel.setBounds( 80, 8, 120, 23 );
      responseJLabel.setText( "Response (1, 2, or 3):" );
      contentPane.add( responseJLabel );

      // set up responseJTextField
      responseJTextField = new JTextField();
      responseJTextField.setBounds( 215, 8, 70, 23 );
      contentPane.add( responseJTextField );
      responseJTextField.addActionListener(

        new ActionListener()
        {
           public void actionPerformed( ActionEvent event )
           {
               responseJTextFieldActionPerformed( event );
           }
        }
     );

      // set up summaryJButton
      summaryJButton = new JButton();
      summaryJButton.setBounds( 116, 40, 170, 26 );
      summaryJButton.setText( "Display Summary" );
      summaryJButton.setEnabled( false );
      contentPane.add( summaryJButton );
      summaryJButton.addActionListener(

        new ActionListener()
        {
           public void actionPerformed( ActionEvent event )
           {
               summaryJButtonActionPerformed( event );
           }
        }
     );


      resultsJTextArea = new JTextArea();
      resultsJTextArea.setEditable( false );

      scrollerJScrollPane = new JScrollPane(
         resultsJTextArea );
      scrollerJScrollPane.setBounds( 16, 78, 400, 100 );
      contentPane.add( scrollerJScrollPane );


      // set up resetJButton
      resetJButton = new JButton();
      resetJButton.setBounds( 175, 200, 70, 23 );
      resetJButton.setText( "reset" );
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
      setTitle( "Jack Wood" ); // set title bar text
      setSize( 450, 275 );         // set window size
      setVisible( true );          // display window

   } // end method createUserInterface

   private void responseJTextFieldActionPerformed( ActionEvent event )
   {
      int response;

      response = Integer.parseInt( responseJTextField.getText() );

      if ( !( ( response == 1 ) || ( response == 2 ) || ( response == 3 ) ) )
      {
         JOptionPane.showMessageDialog( null,
         "Please enter either 1, 2, or 3",
         "Invalid Response", JOptionPane.ERROR_MESSAGE );
      }
      else
      {

         if ( response == 1 )
         {
            agree++;
         }

         if ( response == 2 )
         {
            disagree++;
         }

         if ( response == 3 )
         {
            noOpinion++;
         }

         summaryJButton.setEnabled( true );

         responseJTextField.setText( "" );
      }
   }

   private void summaryJButtonActionPerformed( ActionEvent event )
   {
      double total;
      double percentAgree = 0;
      double percentDisagree = 0;
      double percentNoOpinion = 0;
      String histoAgree = "";
      String histoDisagree = "";
      String histoNoOpinion = "";
      int count;

      total = agree + disagree + noOpinion;

      percentAgree = agree / total;
      percentDisagree = disagree / total;
      percentNoOpinion = noOpinion / total;

      count = agree;
      do
      {
         histoAgree += "*";
         count--;
      }
      while ( count > 1 );

      count = disagree;
      do
      {
         histoDisagree += "*";
         count--;
      }
      while ( count > 1 );

      count = noOpinion;
      do
      {
         histoNoOpinion += "*";
         count--;
      }
      while ( count > 1 );

      DecimalFormat percent = new DecimalFormat( "0.00%" );

      resultsJTextArea.setText( "" );

      resultsJTextArea.append( "RESPONSE" + "\t" + "FREQUENCY" + "\t" + "PERCENT" + "\t" +
         "HISTOGRAM" + "\n" + "Agree" + "\t" + agree + "\t" + percent.format( percentAgree )
         + "\t" + histoAgree + "\n" + "Disagree" + "\t" + disagree + "\t" +
         percent.format( percentDisagree ) + "\t" + histoDisagree + "\n" +
         "No Opinion" + "\t" + noOpinion + "\t" + percent.format( percentNoOpinion )
         + "\t" + histoNoOpinion );

      responseJTextField.requestFocusInWindow();
   }

   private void resetJButtonActionPerformed( ActionEvent event )
   {
      agree = 0;
      disagree = 0;
      noOpinion = 0;

      resultsJTextArea.setText( "" );

      summaryJButton.setEnabled( false );

      responseJTextField.requestFocusInWindow();
   }

   // main method
   public static void main( String[] args )
   {
      Survey application = new Survey();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

   } // end method main

} // end class Survey