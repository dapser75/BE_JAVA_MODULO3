package Modul3;

import javax.swing.JOptionPane;

/*FASE 3
 * Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i guardeu els noms modificats en un nou array(ArrayCiutatsModificades).
 * Mostreu per consola l’array modificat i ordenat per ordre alfabetic.
 */

public class Fase_3M3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Generación e inicialización de variables
		String ciut1="";
		String ciut2="";
		String ciut3="";
		String ciut4="";
		String ciut5="";
		String ciut6="";
					
		String[] ciudades = new String[6];
		String[] ciudadesModificadas = new String[6];
	
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
		
		ciudades [0]=ciut1;
		ciudades [1]=ciut2;
		ciudades [2]=ciut3;
		ciudades [3]=ciut4;
		ciudades [4]=ciut5;
		ciudades [5]=ciut6;
	
		ciudades=ordena(ciudades);//Llamada al metodo de ordenación
		
		//Mostrar por pantalla el array ya ordenado
		ciudadesModificadas = cambiar(ciudades);
		
		//Impresion por pantalla
		for (int i=0;i<ciudadesModificadas.length;i++) {
			System.out.println(ciudadesModificadas[i].toString());
		}	
		
	}
		
	
	/*Metodo de prdenación
	 * Se recorre el array 2 veces y se va ordenando
	 * Se recorre el bucle comparando una posición con el resto de posiciones se coloca en la posición más baja
	 * la palabra con menor orden
	 */
	public static String[] ordena(String lista[]){
		for(int i=0;i<=lista.length;i++){
			for (int n=i+1;n<lista.length;n++){
				if (lista[i].compareToIgnoreCase(lista[n])>=0){
					//Intercambiamos los valores
					String aux=lista[i];
					lista[i]=lista[n];
					lista[n]=aux;
			
				}
											
			}
			
		}
		return lista;
		
	}
	
	
	//Conversión a  minsuculas con la primera letra en mayuscula
	public static String toMayusculas(String valor) {
	    if (valor == null || valor.isEmpty()) {//control de valor nulo
	        return valor;
	    } else {       
	        return  valor.toUpperCase().charAt(0) + valor.substring(1, valor.length()).toLowerCase();
	    }
	}	

	//Método para cambiar las letras
	public static String[] cambiar(String ciud[]) {
		for (int i =0; i<ciud.length;i++) { //bucle para recorrer el array
			ciud[i]=ciud[i].replace("a","4");
			ciud[i]=ciud[i].replace("A","4");
			
			
		}
		return ciud;
	}
	
	

}
