package practicas;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Animales.Animal;

public class EjemploFicheros3 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Animal gato;
		Animal perro;
		perro = new Animal("perro",32);
		gato= new Animal("gato",30);
		ObjectOutputStream salida = null;
		try {
			salida = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("FicheroObjetos.txt")));
			salida.writeObject(perro);
			salida.writeObject(gato);
		} catch (FileNotFoundException e) {

			System.out.println(e.getMessage());

		} finally {
			if (salida != null) {
				salida.close();
			}
		}
		ObjectInputStream entrada=null;
		Animal generico;
		
		
		try {
			entrada= new ObjectInputStream(new BufferedInputStream(new FileInputStream("FicheroObjetos.txt")));
			generico=(Animal)entrada.readObject();
			System.out.println(generico.getNombre());
			
			
		} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
		
		}finally {
			if (entrada!=null) {
				entrada.close();
			}
		}

	}
}
