package practicas;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class EjemploFicheros {
	public static void main (String[] args) throws IOException {
		
		//trabajar con caracteres 
		//lectura de un fichero 
		//escritura de un fichero
		//excritura de un fichero al final del mismo
		
		//flujo de lectura
		FileReader entrada = null;
		boolean nofin =true;
		char caracter;
		try {
			entrada = new FileReader("PruebaFichero.txt");
			
			do {
				caracter=(char) entrada.read();
				if(caracter==(char)-1) {
					nofin=false;
				}else {
					System.out.print(caracter);
				}
			}while(nofin);
		} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			if(entrada!=null){
				entrada.close();
				
			}
			
		}//fin trycatch
		
		
		String frase ="esto es una prueba de escritura en fichero";
		char[] fraseArray= new char [frase.length()];
		FileOutputStream salida=null;
		
		for(int i=0;i<frase.length();i++) {
			fraseArray[i]=frase.charAt(i);
		}
		//escribir en el fichero lo que tengo en el array
	 try {
		salida = new FileOutputStream("PruebaFichero.txt",true);
		for(int i =0;i<fraseArray.length;i++) {
			
			salida.write((char)fraseArray[i]);
			
		}
		
		
		
	} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
		
	}finally { if (salida!=null) {
		salida.close();
	}
		
	}//fin del try-catch
	 
	//pedir por pantalla que se añada algo y que no se borre lo anterior,meterla en otro array y introducirla
	 String frase2;
	 Scanner teclado = new Scanner(System.in);
	 System.out.println("introduzca una nueva frase para el fichero ");
	
	  salida=null;

		 try {
				salida = new FileOutputStream("PruebaFichero.txt",true);// true para no sobreescribir
				
				 do {
					 
					 
					 frase2=teclado.nextLine();
					 char[]fraseArray2= new char[frase2.length()];
					 for (int i=0;i<frase2.length();i++) {
						 fraseArray2[i]=frase2.charAt(i);
						 
					 }
					 
					salida.write('\n' ); 
					for(int i =0;i<fraseArray2.length;i++) {
						
						salida.write((char)fraseArray2[i]);

				}
					
				 }while(frase2.length()>2 && frase2.charAt(0)!='Q');
					
					
					
					
					
				
				
				// cuando se pulse una Q se debera de cerrar  
				
				
				
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
				
			}finally { if (salida!=null) {
				salida.close();
			}
				
			}
		 
	 
	 
	 
	 
	 
	}

}
