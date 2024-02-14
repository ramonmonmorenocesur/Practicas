package practicas;
import java.util.Random;
import java.util.Scanner;
public class ArrayCaracteres {
//pedir por tamaño el tamaño del array 
//construir array de char de ese tamaño
	//rellenarlo de valores aleatorios
	//pedir caracter y bucar el numero de ocurrencias.
	
	public static void main (String[] args) {
		//variables y objetos
		char[]	ArrayCaracteres;
		int tamaño;
		int numOcurrencias=0;
		Scanner teclado=new Scanner(System.in);
		Random aleatorio= new Random();
		char caracter;
		char localizador;
		//procedimiento
		
		System.out.println("Introduxca el tamaño de su array");
		tamaño=teclado.nextInt();
		ArrayCaracteres= new char[tamaño];
		for (int i=0;i<ArrayCaracteres.length;i++) {
	     caracter=(char) aleatorio.nextInt(97,122);
	     ArrayCaracteres[i]=caracter;
		}
		System.out.println("introduzca el caracter que desea buscar");
		localizador=teclado.next().charAt(0);
		
		for (int i=0;i<ArrayCaracteres.length;i++) {
			if(ArrayCaracteres[i]==localizador) {
				numOcurrencias++;
				
				
			}System.out.print(ArrayCaracteres[i]+" ");
		}
		System.out.println();
		System.out.println("el caracter a revisar fue "+localizador+" El numero de Ocurrencias fue de: "+numOcurrencias);
	}
}
