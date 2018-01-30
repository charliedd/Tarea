
public class Phone implements iCampo{
	String numero;

	public boolean validar() {
		numero = numero.trim();
		
		//matches numbers only
		String regexStr = "^[0-9]*$";

		//matches 10-digit numbers only
		String regexStr2 = "^[0-9]{10}$";

		//matches numbers and dashes, any order really.
		String regexStr3 = "^[0-9\\-]*$";

		//matches 9999999999, 1-999-999-9999 and 999-999-9999
		String regexStr4 = "^(1\\-)?[0-9]{3}\\-?[0-9]{3}\\-?[0-9]{4}$";

		if (numero.matches(regexStr) || numero.matches(regexStr2) || numero.matches(regexStr3) 
				|| numero.matches(regexStr4)){
			return true;
		}
		else{
			System.out.print("Esta mal el telefono");
			return false;
		}
			
	        
	}

	@Override
	public void setField(String field) {
		// TODO Auto-generated method stub
		this.numero = field;
		
	}
	
}
