/*
 * cfConverter requires no other files
 */
package cfConverter;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Converter extends JFrame{
/*
 * Create the GUI and show it. For thread safety,
 * this method should be invoked from the 
 *  event dispatching thread.
 */
	//class declarations
	JTextField txtCelsius;
	TextHandler handler = null;
	
	
	//constructor
	public Converter(){
		//JTextField txtCelsius = new JTextField();
		//JLabel lblCelsius = new JLabel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Celsius Converter");
		
		JPanel gui = new JPanel(new BorderLayout(3,3));
		gui.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(gui);
		
		JPanel labels = new JPanel(new GridLayout(0,1));
		JPanel controls = new JPanel(new GridLayout(0,1));
		gui.add(labels,BorderLayout.WEST);
		gui.add(controls,BorderLayout.CENTER);
		
		//Add the text input box
		txtCelsius = new JTextField(15);
		
		//Add the first row
		labels.add(txtCelsius);
		controls.add(new JLabel("Celsius"));
		
		//Add the second row
		//placeholder for adding in command button
		//labels.
		controls.add(new JLabel(""));
		
		handler = new TextHandler();
		txtCelsius.addActionListener(handler);
        
		//Display the window
		setSize(325, 100);
		setVisible(true);
	}
	
	//Inner class TextHandler
	private class TextHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == txtCelsius) {
				// do something with data in txtCelsius test field
				JOptionPane.showMessageDialog(null, e.getActionCommand());
			}
		}
	}
	
	public static void main(String args[]) {
		Converter defaults = new Converter();
		defaults.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}