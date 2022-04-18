import javax.swing.JOptionPane;

import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;


public class OkJavaGoInHome {

	public static void main(String[] args) {

		//String id = JOptionPane.showInputDialog("Enter a ID");
		String id = args [0];
		String bright = JOptionPane.showInputDialog("Enter a Bright level");
		
		// Elevator call
		Elevator myElevator = new Elevator("JAVA APT 507");
		myElevator.callForUp(1);
		
		// Security off
		Security mySecurity = new Security("JAVA APT 507");
		mySecurity.off();
		
		// Light on
		Lighting hallLamp = new Lighting("JAVA APT 507 / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting("JAVA APT 507 / floorLamp");
		floorLamp.on();
		

	}

}
