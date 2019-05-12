

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	
	String number1 = JOptionPane.showInputDialog("Type in a number of your choice");
	int number2 = Integer.parseInt(number1);
	for(int i = 2; i<number2; i++) {
	if(number2 % i == 0) {
		JOptionPane.showMessageDialog(null, "That is not prime!");
	}
	}
	
	
	
	
	
	
}
}
