package practica;

public class Arbol extends Vegetal implements Actor{
	
	private double altura;
	private int edad;

	public Arbol(String tipoCrecimiento, String especie, double altura, int edad) {
		super(tipoCrecimiento, especie);
		this.altura = altura;
		this.edad = edad;
	}

	public Arbol() {}

	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return super.toString() + "Arbol [altura=" + altura + ", edad=" + edad + "]";
	}
	
	public void iniciandoActor() {
		if (actorActivo == 1) {
			System.out.println("Actor Activo");
			super.florecer();	
		}	
	}
	
	public void talar() {
		
		if (actorInactivo == 0) 
			System.out.println("Talar Arbol\nActor inactivo");
		
	}
	
	public void validarAltura() {
		if(altura >=  4.5) {
			talar();
		}else
			System.out.println("Sigue creciendo");
	}
	
	public void validarEdad(int edad) {
		if(edad >= 100)
			talar();
		else
			System.out.println("Estas muy joven, segui creciendo ");
	}
	
	

}
