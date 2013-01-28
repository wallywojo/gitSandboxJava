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
	JLabel lblFaren;
	JButton btnConvert;
	
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
		
		//establish fields with variables we will later reference
		txtCelsius = new JTextField(15);
		txtCelsius.setText("0");
		lblFaren = new JLabel("32 Farenheit");
		btnConvert = new JButton("Convert");
		
		//Add the first row
		labels.add(txtCelsius);
		controls.add(new JLabel("Celsius"));
		
		//Add the second row
		labels.add(btnConvert);
		controls.add(lblFaren);
        
		// add action listener for convert button
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				convertButtonActionPerformed(evt);
			}
		});
		
		txtCelsius.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent evt) {
				SwingUtilities.invokeLater(new Runnable() {
					@Override
					public void run() {
						txtCelsius.selectAll();
					}
				});
			}
		});	
		
		//Display the window
		setSize(325, 100);
		setVisible(true);
	}
	
	private void convertButtonActionPerformed(ActionEvent evt) {
		// do something with data in txtCelsius test field
		//JOptionPane.showMessageDialog(null,txtCelsius.getText());
		// convert calculation
		int intTemp;
		double temp;
		temp = Double.parseDouble(txtCelsius.getText());
		intTemp = (int)((temp*1.8)+32);
		lblFaren.setText(intTemp + " Farenheit");
	}
	
	public static void main(String args[]) {
		Converter defaults = new Converter();
		defaults.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}