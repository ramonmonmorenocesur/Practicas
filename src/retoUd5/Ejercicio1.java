package retoUd5;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
	public static void main(String[] args) throws IOException {

		//pedir por pantalla dos nombres de ficheros el nombr de ambos sup a 3 elementos y si es mayor imprimir el nombre del fichero es valido
		String nombre1= null;
		String nombre2= null;
		Scanner teclado;
		teclado= new Scanner(System.in);
		
		System.out.println("introduce el nombre de dos ficheros");
		
		do {
			
		
		System.out.println("introduce el nombre de el primero fichero");
		nombre1=teclado.nextLine();
		
		
		}while(nombre1.length()<=3);
		
		do {
			System.out.println("introduce el nombre de el segundo fichero");
			nombre2=teclado.nextLine();
			
			
		}while (nombre2.length()<=3);
		
		
		//obten la ruta del directorio actual y muestrala en consola
		teclado.close();
		System.out.println(System.getProperty("user.dir"));
		String directorioActual =System.getProperty("user.dir");
		String rutaCompletFich1 = directorioActual+ File.separator + nombre1;
		String rutaCompletFich2 = directorioActual+ File.separator + nombre2;
		System.out.println(File.separator);
		System.out.println(rutaCompletFich1);
		File fichero1 = new File(rutaCompletFich1);
		File fichero2 = new File(rutaCompletFich2);
		if(comprobarExiste(rutaCompletFich1)) {
			System.out.println("el fichero " + nombre1+" ya existe.");
		}else {
			fichero1.createNewFile();
			
		}
		
		if(comprobarExiste(rutaCompletFich2)) {
			System.out.println("el fichero " + nombre2+" ya existe.");
		}else {
			fichero2.createNewFile();
			
		}
		if(comprobarExiste(rutaCompletFich1)) {
			escribirEnFichero(fichero1);
			
		}
		//apartado g
		if(comprobarExiste(rutaCompletFich1)) {
			System.out.println(fichero1.getName());
			System.out.println(fichero1.getAbsolutePath());
			System.out.println(fichero1.getParent());
			System.out.println(fichero1.length());
			System.out.println("es directorio? "+ fichero1.isDirectory());
			
		}//fin del if  
		else {System.out.println("no existe y por lo tanto no se puede realizar la accion");
		
		}
		//apartado h
		
		duplicarFicheros(fichero1,fichero2);
		
		//apartado i
		
		borrarFichero(fichero1);
		
		//apartado j
		leerDeFichero(fichero2);
		// apartado k
		
		File directorio = new File ("DirEjer1");
		if (comprobarExiste(directorio)) {
			System.out.println("ya existe");
		}else {
			directorio.mkdir();
		}
		
	}//fin del main 

	static boolean leerDeFichero(File miFichero) throws IOException {
		FileReader entrada = null;
		try {
			entrada = new FileReader(miFichero);
			int caracter = entrada.read();
			while (caracter != -1) {
				System.out.print((char) caracter);
				caracter = entrada.read();
			}

			return true;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (entrada != null) {
				entrada.close();
			}
		}
	}

	static boolean leerDeFichero(String miFichero) throws IOException {
		FileReader entrada = null;
		try {
			entrada = new FileReader(miFichero);
			int caracter = entrada.read();
			while (caracter != -1) {
				System.out.print((char) caracter);
				caracter = entrada.read();
			}

			return true;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (entrada != null) {
				entrada.close();
			}
		}

	}

	static boolean escribirEnFichero(String miFichero) throws IOException {
		/*
		 * m�todo escribirEnFichero (nombreArchivo1) que contiene el c�digo necesario
		 * para grabar en dicho fichero los n�meros del 0-10, cada uno en una l�nea
		 * diferente y utilizando un bucle for. Usa la clase FileWriter.
		 */
		FileWriter salida = null;
		try {
			salida = new FileWriter(miFichero);

			for (int cont = 0; cont < 11; cont++) {
				salida.write(" "+ cont);
				salida.write('\n');
			}
			return true;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (salida != null) {
				salida.close();
			}
		}

	}

	static boolean escribirEnFichero(File miFichero) throws IOException {
		FileWriter salida = null;
		try {
			salida = new FileWriter(miFichero);

			for (int cont = 0; cont < 11; cont++) {
				salida.write(String.valueOf(cont));
				salida.write('\n');
			}
			return true;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (salida != null) {
				salida.close();
			}
		}
	}

	static boolean borrarFichero(File miFichero) {
		return miFichero.delete();
	}

	static boolean borrarFichero(String miFichero) {
		File fichero = new File(miFichero);
		return fichero.delete();
	}

	static boolean comprobarExiste(File fichero) {
		return fichero.exists();
	}

	static boolean comprobarExiste(String fichero) {
		File mifichero = new File(fichero);
		return mifichero.exists();
	}

	static boolean duplicarFicheros(File origen, File destino) throws IOException {
		FileReader entrada = null;
		FileWriter salida = null;
		try {
			entrada = new FileReader(origen);
			salida = new FileWriter(destino);

			int caracter = entrada.read();
			while (caracter!=-1) {
				salida.write((char)caracter);
				caracter = entrada.read();
			}
			
			return true;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (entrada != null)
				entrada.close();
			if (salida != null)
				salida.close();
		}

	}
	
	static boolean duplicarFicheros(String origen, String destino) throws IOException {
		FileReader entrada = null;
		FileWriter salida = null;
		try {
			entrada = new FileReader(origen);
			salida = new FileWriter(destino);

			int caracter = entrada.read();
			while (caracter!=-1) {
				salida.write((char)caracter);
				caracter = entrada.read();
			}
			
			return true;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (entrada != null)
				entrada.close();
			if (salida != null)
				salida.close();
		}

	}
} // fin Ejercicio1