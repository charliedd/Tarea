package ejercicioMovimiento;

public class Principal {

	public static void main(String[] args) {
		
		//Estudiante - Habilidad Motriz Libre
		Estudiante estudiante = new Estudiante("Juanito", true, 12, new HabilidadMotriz.Libre(), 12345);
		
		System.out.println(estudiante.muevete());
		System.out.println(estudiante.salta());
		
		
		estudiante.setMovi(new HabilidadMotriz.Limitada()); //Rompanle las piernas
		
		System.out.println(estudiante.muevete());
		System.out.println(estudiante.salta());
		
		System.out.println(estudiante);
		
		
		//Cocinero - Habilidad Motriz Limitada Invalido?
		Cocinero cocinero = new Cocinero("Juanita", false, 36, new HabilidadMotriz.Limitada(), "Masterchef");
		
		System.out.println(cocinero.muevete());
		System.out.println(cocinero.salta());
		
		
		cocinero.setMovi(new HabilidadMotriz.Libre()); //Arreglenle las piernas
		
		System.out.println(cocinero.muevete());
		System.out.println(cocinero.salta());
		
		System.out.println(cocinero);
	}

}
