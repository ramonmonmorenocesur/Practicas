package Animales;

public class Insecto extends Animal {
	
	private boolean alas;
	private boolean antenas;
	private Enemigo[] enemigos;
	public String atributo;
	public boolean isAlas() 
	{
		return alas;
	}
	public void setAlas(boolean alas) {
		this.alas = alas;
	}
	public boolean isAntenas() {
		return antenas;
	}
	public void setAntenas(boolean antenas) {
		this.antenas = antenas;
	}
	public Insecto(String nombre, int tpVida, boolean alas, boolean antenas) {
		super(nombre, tpVida);
		this.alas = alas;
		this.antenas = antenas;
		atributo="soy insecto";
		enemigos = new Enemigo[5];
	}
	
	 public Enemigo[] getEnemigos() {
		return enemigos;
	}
	public void setEnemigos(String enemigo) {
		
	}

	class Enemigo {
		
	public String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Enemigo(String nombre) { 
		super();
		this.nombre = nombre;
	}
	
		
		
		
	}

}
