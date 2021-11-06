package practica;

public class Vehiculo implements Actor, ObjetoInerte{
	
	private int velocidad;
	private int veloMax;
	private int veloMin;
	private String marca;
	
	public Vehiculo(int velocidad, int veloMax, int veloMin, String marca) {
		super();
		this.velocidad = velocidad;
		this.veloMax = veloMax;
		this.veloMin = veloMin;
		this.marca = marca;
		
	}
	
	public Vehiculo() {}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVeloMax() {
		return veloMax;
	}

	public void setVeloMax(int veloMax) {
		this.veloMax = veloMax;
	}

	public int getVeloMin() {
		return veloMin;
	}

	public void setVeloMin(int veloMin) {
		this.veloMin = veloMin;
	}

	@Override
	public String toString() {
		return "Vehiculo [velocidad=" + velocidad + ", veloMax=" + veloMax + ", veloMin=" + veloMin + ", marca=" + marca
				+ "]";
	}
	
	@Override
	public void sinVida() {
		if (actorInactivo == 0) {
			System.out.println("Actor inactivo");
		}	
	}
	
	public void acelerar() {
		velocidad = velocidad * 2;
		System.out.println("Acelerandooo " + velocidad);
	}
	
	public void arrancar() {
		if (actorActivo == 1) {
			System.out.println("Actor Activo\n"
					+ "Estamos arrancando");
			acelerar();
		}
	}
	
	public void frenar() {
		velocidad = velocidad / 2;
		System.out.println("Frenandooo " + velocidad);
	}
	
	
	
	
	
	
	
	
	
	

}
