/*
 * cfConverter requires no other files
 */
import javax.swing.*;

public class Converter extends JFrame{
/*
 * Create the GUI and show it. For thread safety,
 * this method should be invoked from the 
 *  even dispatching thread.
 */
	private JTextField txtCelsius;
	private JLabel lblCelsius;
	
	public Converter(){
		initcomponents();
		
		
	}
	private static void initcomponents(){
		txtCelsius = new JTextField();
		lblCelsius = new JLabel();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Celsius Converter");
		
		//Add the text input box
		JTextField txtCelsius = new JTextField(15);
		frame.getContentPane().add(txtCelsius);
		
		//Add the "Celsius" label
		JLabel label = new JLabel("Celsius");
		frame.getContentPane().add(label);
		
		//Display the window
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		//Schedule a job for the event-dispatching thread
		//creating and showing this applications GUI
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createandShowGUI();
			}
		});
	}
}