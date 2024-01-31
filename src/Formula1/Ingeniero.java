package Formula1;
import java.util.Random;
public class Ingeniero extends Persona{
	
	//ATRIBUTOS
	private final int INTELIGENCIA;
	private final int INNOVACION;
	private final int EXPERENCIA;
	//CONSTRUCTOR
	public Ingeniero(int edad, String nombre, int dni) {
		super(edad, nombre, dni);
		Random aleatorio = new Random();
		INTELIGENCIA = aleatorio.nextInt(10);
		INNOVACION = aleatorio.nextInt(10);
		EXPERENCIA = aleatorio.nextInt(10);
	}
	public int getINTELIGENCIA() {
		return INTELIGENCIA;
	}
	public int getINNOVACION() {
		return INNOVACION;
	}
	public int getEXPERENCIA() {
		return EXPERENCIA;
	}
	

}
