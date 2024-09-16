package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O1 {

	public static void main(String[] args) {
		
		int[] poengArray = new int[10];
		char[] karakter = new char[10]; 
		
		for (int i = 0; i < poengArray.length; i++) {
			int svar = Integer.parseInt(JOptionPane.showInputDialog("Oppgi poengsum til student nr" + (i+1)));
			poengArray[i] = svar;
			
			while((svar > 100) || (svar < 0)) {
				svar = Integer.parseInt(JOptionPane.showInputDialog("Ugyldig verdi, må være heltall fra 0 til 100 \n Skriv inn poengsum nr" +(i+1)+ " på nytt: "));
				poengArray[i] = svar;
			}
			
		}
		
		for (int i = 0; i < 10; i++) {
			if(poengArray[i] >= 90) {
				karakter[i] = 'A';
			} else if(poengArray[i] >= 80) {
				karakter[i] = 'B';
			} else if(poengArray[i] >= 60) {
				karakter[i] = 'C';
			} else if(poengArray[i] >= 50) {
				karakter[i] = 'D';
			} else if(poengArray[i] >= 40) {
				karakter[i] = 'E';
			} else if(poengArray[i] >= 0) {
				karakter[i] = 'F';
			}
		}
		
		for (int i = 0; i< 10; i++) {
		System.out.println("Student nr"+(i+1)+", poengsum: " +  poengArray[i] + ", karakter = " + karakter[i] );
		}
		
	}

}
