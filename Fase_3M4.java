package Modul3;

import javax.swing.JOptionPane;


/*FASE 4
 *Creeu un nou array per cada una de les ciutats que tenim. La mida dels nous arrays sera la llargada de cada string ( string nomCiutat.Length).
 *Ompliu els nous arrays lletra per lletra.
 *Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB).

 */
public class Fase_3M4 {
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
		ciut1=toMayusculas(ciut1);//Llamada a al metodo toMayuscula 
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
		
		//Declaración de array de tipo char con el tamaño de las ciudades
		char [] c1 = new char [ciut1.length()];
		char [] c2 = new char [ciut2.length()];
		char [] c3 = new char [ciut3.length()];
		char [] c4 = new char [ciut4.length()];
		char [] c5 = new char [ciut5.length()];
		char [] c6 = new char [ciut6.length()];
		
		//Llamada al método para rellenar el array de caracteres desde una cadena.
		c1 = rellenarArray(ciut1);
		c2 = rellenarArray(ciut2);
		c3 = rellenarArray(ciut3);
		c4 = rellenarArray(ciut4);
		c5 = rellenarArray(ciut5);
		c6 = rellenarArray(ciut6);
		
		//Llamamos al método para mostrar al reves
		muestraReves(c1);
		muestraReves(c2);
		muestraReves(c3);
		muestraReves(c4);
		muestraReves(c5);
		muestraReves(c6);
		
	}
		
		public static void muestraReves(char[] city) {
			for (int i=city.length-1;i>=0;i--) {
				System.out.print(city[i]);
							
			}

			return;
		}
	
	
		//Método para mostrar el array en orden inverso. Para ello se recorre el array de final a inicio.
		public static char[] rellenarArray(String ciudad) {
			char [] aux = new char[ciudad.length()];
			for (int i=0; i<ciudad.length();i++) {
				aux[i]= ciudad.charAt(i);
			
			}
			return aux;
		}
	
	
		//Conversión a  minsuculas con la primera letra en mayuscula
		public static String toMayusculas(String valor) {
		    if (valor == null || valor.isEmpty()) {//control de valor nulo
		        return valor;
		    } else {       
		        return  valor.toUpperCase().charAt(0) + valor.substring(1, valor.length()).toLowerCase();
		    }
		}
	
		
	
	
}
