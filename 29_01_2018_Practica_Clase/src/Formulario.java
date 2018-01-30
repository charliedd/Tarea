import java.util.Scanner;

public class Formulario {
	iCampo[] campos = new iCampo[5];
	
	
	public Formulario(){
		campos[0] = new Email();
		campos[1] = new Name();
		campos[2] = new Phone();
		campos[3] = new Password();
		campos[4] = new Genero();
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
		for (iCampo campo : campos) {
		    if(!campo.validar()){
		    	return false;
		    }
		}
		return true;
	}
	
}
