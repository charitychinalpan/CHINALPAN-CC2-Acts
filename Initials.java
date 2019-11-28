import javax.swing.*;

public class Initials{
	public static void main(String []args){
		String firstNameInitial;
		String middleNameInitial;
		String lastNameInitial;
		
		firstNameInitial=JOptionPane.showInputDialog("Enter your first name's initial:");
		middleNameInitial=JOptionPane.showInputDialog("Enter your middle name's initial:");	
		lastNameInitial=JOptionPane.showInputDialog("Enter your last name's initial:");
		
		JOptionPane.showMessageDialog(null, (firstNameInitial.charAt(0)) + " " + (middleNameInitial.charAt(0)) + " " + (lastNameInitial.charAt(0)));
		
		}}
