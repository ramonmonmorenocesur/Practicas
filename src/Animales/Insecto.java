package Animales;

public class Insecto extends Animal {
	
	private boolean alas;
	private boolean antenas;
	private Enemigo enemigo;
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
	public Insecto(String nombre, int tpVida, boolean alas, boolean antenas, String enemigo) {
		super(nombre, tpVida);
		this.enemigo=new Enemigo(enemigo);
		this.alas = alas;
		this.antenas = antenas;
	}
	
	 public Enemigo getEnemigo() {
		return enemigo;
	}
	public void setEnemigo(Enemigo enemigo) {
		this.enemigo = enemigo;
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
