package practicas;
import java.util.Random;
import java.util.Scanner;
public class PracticasArray {//
	//pedir por teclado el ramaño de array
	//construir array de int de ese tamaño
	//pedir rango de valores q se quieren introducir
	//maximo y minimo
	//introducir esos valores en el array de manera aleatoria hasta llenarlo
	public static void main (String[] args) {
		//objetos y variables
		Scanner teclado= new Scanner(System.in);
		int max;
		int min;
		int[] ArrayEnteros;
		int longitud;
		int numPares=0;
		Random aleatorio;
		int[] ArrayPares;
		int[]ArrayImpares;		
		int contadorPar=0;
		int contadorImpar=0;
		
		//PEDIMOS TAMAÑO MIN MAX Y MOSTRAMOS
		System.out.println("Introduzca el tamaño de su Array");
		longitud=teclado.nextInt();
		ArrayEnteros= new int[longitud];
		System.out.println("Introduca el valor maximo para su array");
		max=teclado.nextInt();
		System.out.println("Introduzca el valor minimo para su array");
		min=teclado.nextInt();
		aleatorio= new Random();
		
		for(int i=0;i<ArrayEnteros.length;i++) {
			
			ArrayEnteros[i]=aleatorio.nextInt(min,max);
			if(ArrayEnteros[i]%2==0) {numPares++;
				
			}
		}//ALMACENAR LOS PARES E IMPARES EN ARRAYS 
			ArrayPares = new int[numPares];
			ArrayImpares= new int [longitud-numPares];
			
			for(int i=0;i<ArrayEnteros.length;i++) {
				if(ArrayEnteros[i]%2==0) {
				ArrayPares[contadorPar]=ArrayEnteros[i];
				contadorPar++;
				} else {
				ArrayImpares[contadorImpar]=ArrayEnteros[i];
				contadorImpar++;
				}
			}
		//MOSTRAMOS LOS ARRAYS
			System.out.println("Este es el Array de enteros");
			for(int i=0;i<ArrayEnteros.length;i++) {
				
				System.out.print(ArrayEnteros[i]+" ");
			}
			System.out.println();
		System.out.println("Este es el Array de Pares");
		for(int i=0;i<ArrayPares.length;i++) {
			
			System.out.print(ArrayPares[i]+" ");
			
		}
		System.out.println();
		System.out.println("Este es el Array de impares");
		for (int i=0;i<ArrayImpares.length;i++) {
			System.out.print(ArrayImpares[i]+" ");
		}
		
	}
}
