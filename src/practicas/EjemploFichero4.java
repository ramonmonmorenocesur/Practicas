package practicas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class EjemploFichero4 {
	public static void main (String [] args) throws IOException {
		
		//
		File fichero=null;
		fichero= new File("PruebaFichero.txt");
		System.out.println(fichero.getAbsolutePath());
		System.out.println(fichero.getCanonicalPath());
		System.out.println(fichero.getPath());
		
		/*File miDirectorio=null;
		miDirectorio= new File("C:\\Users\\RamonMorenoUrbaneja\\eclipse-workspace\\Practica");
		String [] miLista;
		miLista=miDirectorio.list();
		
		for(int i =0;i<miLista.length;i++) {
			System.out.println(miLista[i]);
		}*/
	
				
			
			 RandomAccessFile fichero2=null;
			 try {
				fichero2 = new RandomAccessFile ("ficheroAleatorio.txt"
						,"rw");
				for(int i =0;i<27;i++) {
					fichero2.writeChar(97+i);
				}
				
				
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			}finally {
				if(fichero2!=null) {
					fichero2.close();
				}
			}
			 
			 
			 
			 
			//quiero empezar a leer de nuevo pero ahira quieo leeer byte a byte y sacar por pantalla exactamente lo mismo 
			 
			 try {
				fichero2= new RandomAccessFile("ficheroAleatorio.txt","r");
				for(int i =0;i<27;i++) {
					
					System.out.print("["+fichero2.readChar()+" "+fichero2.getFilePointer()+"] ");
					
				
				}
				
				fichero2.seek(0);
				System.out.println("\nel fichero acaba en la posicion "+ fichero2.getFilePointer());
				
				for (int i=0;i<108;i=i+2) {
					System.out.print("["+(char)fichero2.readByte()+" "+fichero2.getFilePointer()+"]");
					
				}
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			}finally {
				if(fichero!=null) {
					fichero2.close();
				}
			}
				
			
		}
		
		
	}


