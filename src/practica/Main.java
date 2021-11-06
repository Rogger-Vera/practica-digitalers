package practica;

public class Main {

	public static void main(String[] args) {

		Estudiante e1 = new Estudiante("Leo", "Castro", 21, 1234, "primario", "2do B", 10);
		System.out.println(e1.toString());
		
		//objeto bicicleta
		
		Bicicleta b1 = new Bicicleta(20, "Saimbreta", 40, 10, 1, 2);
		
		System.out.println(b1.toString());
		
		b1.cambiarPlato();
		b1.cambiarPlato();
		b1.arrancar();
		System.out.println("");
		
		//objeto coche
		
		Coche c1 = new Coche(80, 120, 30, "Fiat", "V8", false);
		System.out.println(c1);
		c1.arrancar();
		c1.frenar();
		c1.remolcado();
		
		//objeto arbol
		
		Arbol a1 = new Arbol("Rapido", "Arce blanco", 6, 50);
		
		System.out.println(a1.toString());
		a1.iniciandoActor();
		a1.validarAltura();
		a1.validarEdad(a1.getEdad());
		
		//objeto arbusto
		
		Arbusto arbusto1 = new Arbusto("Lento", "Hortensia", 1, 20);
		
		System.out.println(arbusto1.toString());
		arbusto1.iniciandoActor();
		arbusto1.validarAltura();
		arbusto1.validarEdad(arbusto1.getEdad());

	}

}
