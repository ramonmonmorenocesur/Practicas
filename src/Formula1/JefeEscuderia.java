package Formula1;
import java.util.Random;
public class JefeEscuderia extends Persona {
	
	//ATRIBUTOS
	private final int INTELIGENCIA;
	private final int LIDERAZGO;
	private final int EXPERIENCE;
	
	//CONSTRUCTOR
	public JefeEscuderia(int edad, String nombre, int dni) {
		super(edad, nombre, dni);
		Random aleatorio = new Random();
		this.INTELIGENCIA = aleatorio.nextInt(10);
		this.LIDERAZGO = aleatorio.nextInt(10);
		this.EXPERIENCE = aleatorio.nextInt(10);
	}

	//GETTERS Y SETTERS
	public int getInteligencia() {
		return INTELIGENCIA;
	}
	public void setInteligencia(int inteligencia) {
		
	}
	public int getLiderazgo() {
		return LIDERAZGO;
	}
	public void setLiderazgo(int liderazgo) {
		
	}
	public int getExperiencia() {
		return EXPERIENCE;
	}
	public void setExperiencia(int experiencia) {
		
	}
	
	

}
