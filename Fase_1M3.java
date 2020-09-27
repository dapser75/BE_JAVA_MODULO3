package Modul3;

import javax.swing.JOptionPane;

public class Fase_1M3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generación e inicialización de variables
		String ciut1="";
		String ciut2="";
		String ciut3="";
		String ciut4="";
		String ciut5="";
		String ciut6="";
		//Entrada de los nombres de las ciudades
		
		ciut1=JOptionPane.showInputDialog("Introduce nombre ciudad1: ");
		ciut1=toMayusculas(ciut1);
		//String d=ciut1.toUpperCase().charAt(0) + ciut1.substring(1, ciut1.length()).toLowerCase();
		ciut2=JOptionPane.showInputDialog("Introduce nombre ciudad2: ");
		ciut2=toMayusculas(ciut2);
		ciut3=JOptionPane.showInputDialog("Introduce nombre ciudad3: ");
		ciut3=toMayusculas(ciut3);
		ciut4=JOptionPane.showInputDialog("Introduce nombre ciudad4: ");
		ciut4=toMayusculas(ciut4);
		ciut5=JOptionPane.showInputDialog("Introduce nombre ciudad5: ");
		ciut5=toMayusculas(ciut5);
		ciut6=JOptionPane.showInputDialog("Introduce nombre ciudad6: ");
		ciut6=toMayusculas(ciut6);
		
		System.out.println(ciut1);
		System.out.println(ciut2);
		System.out.println(ciut3);
		System.out.println(ciut4);
		System.out.println(ciut5);
		System.out.println(ciut6);
		
		
	}
   //Conversión de a  minsuculas con la primera letra en mayuscula
	public static String toMayusculas(String valor) {
	    if (valor == null || valor.isEmpty()) {//control de valor nulo
	        return valor;
	    } else {       
	        return  valor.toUpperCase().charAt(0) + valor.substring(1, valor.length()).toLowerCase();
	    }
	}
	
}
