package Animales;
import java.util.Random;
public class UsoAnimales {

	public static void main (String[] args) {
		//crear array de 10 animal.
		Random aleatorio = new Random();
		int[] enteros;
		enteros= new int[10];
		for(int i=0;i<enteros.length;i++) {
			enteros[i]=aleatorio.nextInt(10);
		}
		int numero = aleatorio.nextInt(10);
		//quiero buscar el numero en el array
		boolean encontrado= false;
		int contador=0;
		int i=0;
		while(i<enteros.length) {
			if(enteros[i]==numero) {
				encontrado=true;
				contador++;
				
				
			}i++;
		} if (encontrado)
			
		System.out.println("Encontrado "+ numero+ ":");}  
	}

