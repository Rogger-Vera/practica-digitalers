package practica;

public class Arbusto extends Vegetal implements Actor{
	
	private double altura;
	private int edad;

	public Arbusto(String tipoCrecimiento, String especie, double altura, int edad) {
		super(tipoCrecimiento, especie);
		this.altura = altura;
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Arbusto() {}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Arbusto [altura=" + altura + ", edad=" + edad + "]";
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
		if(altura >=  2) {
			talar();
		}else
			System.out.println("Sigue creciendo");
	}
	
	public void validarEdad(int edad) {
		if(edad >= 30)
			talar();
		else
			System.out.println("Estas muy joven, segui creciendo ");
	}
	

}
