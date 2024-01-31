package Formula1;
import java.util.Random;
public class Piloto extends Persona {
	
	//ATRIBUTOS
	private final int REFLEJOS;
	private final int INTELIGENCIA;
	private final int AGRESIVIDAD;
	private int experiencia;
	//CONSTRUCOR
	public Piloto(int edad, String nombre, int dni) {
		super(edad, nombre, dni);
		Random aleatorio = new Random();
		this.REFLEJOS = aleatorio.nextInt(10);
		this.INTELIGENCIA = aleatorio.nextInt(10);
		this.AGRESIVIDAD = aleatorio.nextInt(10);
		this.experiencia = aleatorio.nextInt(10);
		
		//GETTERS Y SETTERS
	}
	public int getReflejos() {
		return REFLEJOS;
	}
	public void setReflejos(int reflejos) {
	
	}
	public int getInteligencia() {
		return INTELIGENCIA;
	}
	public void setInteligencia(int inteligencia) {
		
	}
	public int getAgresividad() {
		return AGRESIVIDAD;
	}
	public void setAgresividad(int agresividad) {
		
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
//FIN CLASE
}