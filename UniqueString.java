// Jack Wood
// Exercise: UniqueString.java
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.Arrays;

public class UniqueString extends JFrame
{
   // JLabel and JTextField for entering strings
   private JLabel enterStringJLabel;
   private JTextField enterStringJTextField;

   // JLabel and JTextArea for displaying the survey results
   private JLabel resultJLabel;
   private JTextArea resultJTextArea;

   // JComboBox for selecting the font
   private JComboBox selectFontJComboBox;

   // Font names to use in setting up the JComboBox
   private String[] fonts = { "Monospaced", "Serif", "SansSerif" };

   // no-argument constructor
   public UniqueString()
   {
      createUserInterface();
   }

   private String[] colors = { "", "", "", "", "" };

   private int countInput = 0;

   //Arrays.fill( colors, "" );


   // create and position GUI components; register event handlers
   private void createUserInterface()
   {
      // get content pane for attaching GUI components
      Container contentPane = getContentPane();

      // enable explicit positioning of GUI components
      contentPane.setLayout( null );

      // set up enterStringJLabel
      enterStringJLabel = new JLabel();
      enterStringJLabel.setBounds( 20, 20, 80, 20 );
      enterStringJLabel.setText( "Enter text:" );
      contentPane.add( enterStringJLabel );

      // set up enterStringJTextField
      enterStringJTextField = new JTextField();
      enterStringJTextField.setBounds( 20, 60, 170, 20 );
      enterStringJTextField.requestFocusInWindow();
      contentPane.add( enterStringJTextField );
      enterStringJTextField.addActionListener(

		  new ActionListener()
		  {
			  public void actionPerformed( ActionEvent event )
			  {
				  enterStringJTextFieldActionPerformed( event );
			  }
		  }
	  );

      // set up resultJLabel
      resultJLabel = new JLabel();
      resultJLabel.setBounds( 20, 60, 100, 20 );
      resultJLabel.setText( "Sorted Text:" );
      contentPane.add( resultJLabel );

      // set up resultJTextArea
      resultJTextArea = new JTextArea();
      resultJTextArea.setBounds( 20, 90, 170, 100 );
      resultJTextArea.setEditable( false );
      resultJTextArea.setFont( new Font( "Monospaced", Font.PLAIN, 12) );
      contentPane.add( resultJTextArea );

      selectFontJComboBox = new JComboBox( fonts );
      selectFontJComboBox.setBounds( 40, 200, 135, 21 );
      contentPane.add( selectFontJComboBox );
      selectFontJComboBox.addItemListener(

         new ItemListener() // anonymous inner class
         {
            // event handler called when combo box changes
            public void itemStateChanged( ItemEvent event )
            {
               selectFontJComboBoxItemStateChanged( event );
            }
         } // end anonymous inner class

      );  // end call to addItemListener

      // set properties of application's window
      setTitle( "Jack Wood" ); // set title bar string
      setSize( 220, 300 );         // set window size
      setVisible( true );          // display window

   } // end method createUserInterface


   private void enterStringJTextFieldActionPerformed( ActionEvent event )
   {
	   String input = enterStringJTextField.getText();

	   if ( input.equals( "" ) )
	   {
		   JOptionPane.showMessageDialog( null,
		   "Please type a color",
		   "Missing Color", JOptionPane.WARNING_MESSAGE );

		   enterStringJTextField.requestFocusInWindow();
	   }
	   else
	   {

		   int location;

		   location = Arrays.binarySearch( colors, input );

		   if ( location >= 0 )
		   {
			   JOptionPane.showMessageDialog( null,
			   "This color is already entered",
			   "Duplicate Color", JOptionPane.WARNING_MESSAGE );

			   enterStringJTextField.setText( "" );
			   enterStringJTextField.requestFocusInWindow();
		   }
		   else
		   {
			   countInput++;

			   colors[colors.length - countInput] = input;

			   Arrays.sort( colors );

			   resultJTextArea.setText( "" );

			   for ( int count = 0; count <= colors.length - 1; count++ )
			   {

				   System.out.println( colors[count] );

				   if  ( colors[count] != "" )
				   {
					   resultJTextArea.append( colors[count] + "\n" );
				   }
				}

				if ( countInput == colors.length )
				{
					enterStringJTextField.setText( "ARRAY IS FULL" );
					enterStringJTextField.setEditable( false );
				}
				else
				{
					enterStringJTextField.setText( "" );
					enterStringJTextField.requestFocusInWindow();
				}
		   	}
		}


   }



   private void selectFontJComboBoxItemStateChanged( ItemEvent event )
   {
	   int selectedFont = selectFontJComboBox.getSelectedIndex();
	   String fontSelected = (String) selectFontJComboBox.getItemAt( selectedFont );

	   if ( fontSelected.equals( "Monospaced" ) )
	   {
		   resultJTextArea.setFont( new Font( "Monospaced", Font.PLAIN, 12 ) );
	   }
	   else
	   {
		   if ( fontSelected.equals( "Serif" ) )
		   {
			   resultJTextArea.setFont( new Font( "Serif", Font.PLAIN, 12 ) );
		   }
		   else
		   {
			   resultJTextArea.setFont( new Font( "SansSerif", Font.PLAIN, 12 ) );
		   }
	   }
	   enterStringJTextField.requestFocusInWindow();
   }


   // main method
   public static void main( String[] args )
   {
      UniqueString application = new UniqueString();
      application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

   } // end method main

} // end class UniqueString