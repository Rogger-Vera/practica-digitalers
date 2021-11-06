package practica;

public class Profesor extends Persona{
	
	private String materia;
	private String catedra;
	
	public Profesor(String nombre, String apellido, int edad, int dni, String materia, String catedra) {
		super(nombre, apellido, edad, dni);
		this.materia = materia;
		this.catedra = catedra;
	}
	public Profesor() {}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getCatedra() {
		return catedra;
	}
	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}
	@Override
	public String toString() {
		return "Profesor [materia=" + materia + ", catedra=" + catedra + "]";
	}
	
	public void rendirExamen() {
		System.out.println("Hora del examen >D");
		
	}
	
	public void resultadoExamen() {
		int nota = (int)(Math.random()*10);
		if( nota >= 4)
			System.out.println("Aprobado!! Su nota es " + nota);
		else
			System.out.println("Desaprobado!! Su nota es " + nota);
	}
	
		

}
