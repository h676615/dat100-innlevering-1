package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O2 {

	public static void main(String[] args) {
		
		int inntekt = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn din inntekt:"));
		while (inntekt < 0) {
			inntekt = Integer.parseInt(JOptionPane.showInputDialog("Du kan ikke skrive inn ett negativt tall, prøv igjen:"));
		}
		int trinnSkattSum = trinnSkattSum(inntekt);
		double trinnSkattProsent = trinnSkattProsent(inntekt);
		JOptionPane.showMessageDialog(null, "Din inntekt er: " + inntekt + ", \ndin trinnskattprosent er : "+ trinnSkattProsent +"%, \ndu skal betale: "+trinnSkattSum+"kr i trinnskatt.");
		

	}
	
	public static double trinnSkattProsent(int x) {
		int t0 = 0;
		Double T0 = 0.0;
		int t1 = 208051;
		Double T1 = 1.7; 
		int t2 = 292851;
		Double T2 = 4.0;
		int t3 = 670001;
		Double T3 = 13.6;
		int t4 = 937901;
		Double T4 = 16.6;
		int t5 = 1350001;
		Double T5 = 17.6;
		double trinnskatt = 0;
		
		if (x >= t5) {
			trinnskatt = T5;
		} else if (x >= t4) {
			trinnskatt = T4;
		} else if (x >= t3) {
			trinnskatt = T3;
		} else if (x >= t2) {
			trinnskatt = T2;
		} else if (x >= t1) {
			trinnskatt = T1;
		} else if (x >= t0) {
			trinnskatt = T0;
		}
		return trinnskatt;
	}
	
	public static int trinnSkattSum(int x) {
		
		int skatt = 0;
		
		int t0 = 0;
		Double T0 = 0.0;
		int t1 = 208051;
		Double T1 = 1.7; 
		int t2 = 292851;
		Double T2 = 4.0;
		int t3 = 670001;
		Double T3 = 13.6;
		int t4 = 937901;
		Double T4 = 16.6;
		int t5 = 1350001;
		Double T5 = 17.6;
		double trinnskatt = 0;
		
		if (x >= t5) {
			trinnskatt = T5;
		} else if (x >= t4) {
			trinnskatt = T4;
		} else if (x >= t3) {
			trinnskatt = T3;
		} else if (x >= t2) {
			trinnskatt = T2;
		} else if (x >= t1) {
			trinnskatt = T1;
		} else if (x >= t0) {
			trinnskatt = T0;
		}
		
		skatt = (int) Math.round(((trinnskatt*x)*0.01)) ;
		return skatt;
	}
	
}
