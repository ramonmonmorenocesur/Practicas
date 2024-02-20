package practicas;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploFicheros2 {

	
	public static void main (String args[]) throws IOException {
		//pedir cuantas lineas quieres imprimir y que imprima ese numero de lineas
	//leer el fichero 
		char caracter;
		FileReader entrada=null;
		
		try {
			entrada= new FileReader("PruebaFichero.txt");
			System.out.println();
			caracter=(char)entrada.read();
			while(caracter!=(char)-1) {
				
				System.out.print(caracter);
				caracter=(char)entrada.read();
				
			}
			
			
			
			
			
	
			
			
		} catch (FileNotFoundException e) {
		
			System.out.println(e.getMessage());
		}finally {
			if(entrada!=null) {
				entrada.close();
			}
		}   
		
		
		
		int numLineas;
		Scanner teclado = new Scanner(System.in);
		entrada=null;
		try {
			entrada= new FileReader("PruebaFichero.txt");
			System.out.println("cuantas lineas desea leer");
			numLineas=teclado.nextInt();
			caracter=(char)entrada.read();
			while( numLineas  > 0 &&caracter!=(char)-1) {
				
				if(caracter=='\n') {
					numLineas--;
				}System.out.print(caracter);
				caracter=(char)entrada.read();
				
				
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			
			
			
			
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}
}
