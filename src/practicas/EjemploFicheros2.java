package practicas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EjemploFicheros2 {

	public static void main(String[] args) throws IOException {

		BufferedReader entrada = null;
		BufferedWriter salida2 = null;
		FileReader entradaFichero = null;
		PrintWriter salida = null;
		entrada = new BufferedReader(entradaFichero);
		try {
			entradaFichero = new FileReader("PruebaFichero.txt");
			entrada = new BufferedReader(entradaFichero);
			salida = new PrintWriter(new FileWriter("FicheroCopia.txt"));
			salida2 = new BufferedWriter(new FileWriter("CopiaFichero.txt"));
			String linea;
			int numLinea = 3;
			while(numLinea>0) {
				linea= entrada.readLine();
				salida.println(linea);
				salida2.write(linea);
			}
		} catch (FileNotFoundException e) {

			System.out.println(e.getMessage());
		} finally {
			if (entrada != null) {
				entrada.close();
			}
			if (salida!=null) {
				salida.close();
				
			}
			if(salida2!=null) {
				salida2.close();
			}
		}

	}

}
