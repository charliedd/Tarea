import java.util.Scanner;

public class Formulario {
	Campo[] campos = new Campo[5];
	
	
	public Formulario(){
		campos[0] = new Campo(new Name());
		campos[1] = new Campo(new Email());
		campos[2] = new Campo(new Genero());
		campos[3] = new Campo(new Password());
		campos[4] = new Campo(new Phone());
	};

	public void doEverything(){
		fillFields();
		validarTodos();
		
	}
	
	public void fillFields(){
		Scanner s = new Scanner(System.in);

		campos[0].setField(s.nextLine());
		
		campos[1].setField(s.nextLine());
		
		campos[2].setField(s.nextLine());
		
		campos[3].setField(s.nextLine());
		
		campos[4].setField(s.nextLine());
		
		s.close();
	}
	
	public boolean validarTodos(){
		for (Campo campo : campos) {
		    if(!campo.validar()){
		    	System.out.println("Hay campos que no fueron llenados correctamente.");
		    	return false;
		    }
		}
		System.out.println("Se ha completado el registro.");
		return true;
	}
	
}
