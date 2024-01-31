package Formula1;
import java.util.Random;
public class Mecanico extends Persona {
	
	
	//ATRIBUTOS
	
	private final int VELOCIDAD;
	private int experiencia;
	//CONSTRUCTOR
	public Mecanico(int edad, String nombre, int dni) {
		super(edad, nombre, dni);
		Random aleatorio= new Random();
		VELOCIDAD = aleatorio.nextInt(10);
		this.experiencia = aleatorio.nextInt(10);
	}
	//GETTERS Y SETTERS
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	public int getVELOCIDAD() {
		return VELOCIDAD;
	}
	

}
