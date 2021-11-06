package practica;

public class Vegetal {
	
	private String tipoCrecimiento;
	private String especie;
	
	public Vegetal(String tipoCrecimiento, String especie) {
		super();
		this.tipoCrecimiento = tipoCrecimiento;
		this.especie = especie;
	}
	public Vegetal() {}
	
	public String getTipoCrecimiento() {
		return tipoCrecimiento;
	}
	public void setTipoCrecimiento(String tipoCrecimiento) {
		this.tipoCrecimiento = tipoCrecimiento;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	@Override
	public String toString() {
		return "Vegetal [tipoCrecimiento=" + tipoCrecimiento + ", especie=" + especie + "]";
	}
	
	public void florecer() {
		System.out.println("Estoy floreciendo");
	}

}
