package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O3 {

	public static void main(String[] args) {
		int fakultet;
		long fakultetsum = 1;
		int forsøk = 0;
		int maksForsøk = 5;
		
		
		fakultet = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn ett heltall større enn 0: "));
		
		while (fakultet <= 0) {
			forsøk++;
			
				if(forsøk >= maksForsøk) {
					JOptionPane.showMessageDialog(null, "Du har brukt alle dine " + maksForsøk + " forsøk uten gyldig input, programmet avsluttes.");
					System.exit(0);
				}
			
			fakultet = Integer.parseInt(JOptionPane.showInputDialog("Ugyldig verdi.\nForsøk nr "+ (forsøk+1) + " av " + maksForsøk +" totalt. Vennligst forsøk på nytt \nSkriv inn ett heltall større enn 0: "));
			
		}
		
		for (int i = 1; i <= fakultet; i++) {
			fakultetsum *= i;
			
		}
		
		JOptionPane.showMessageDialog(null, fakultet + "! = " + fakultetsum);

	}

}
