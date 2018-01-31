
public class Phone implements IValidacion{
	String numero;

	public boolean validar() {
		numero = numero.trim();
		
		String regexStr = "^[0-9]*$";

		String regexStr2 = "^[0-9]{10}$";

		String regexStr3 = "^[0-9\\-]*$";

		String regexStr4 = "^(1\\-)?[0-9]{3}\\-?[0-9]{3}\\-?[0-9]{4}$";

		if (numero.matches(regexStr) || numero.matches(regexStr2) || numero.matches(regexStr3) 
				|| numero.matches(regexStr4)){
			return true;
		}
		else{
			System.out.println("Esta mal el telefono");
			return false;
		}
			
	        
	}

	@Override
	public void setField(String field) {
		// TODO Auto-generated method stub
		this.numero = field;
		
	}
	
}
