
public class Email implements IValidacion {
	String email;
	
	@Override
	public boolean validar() {
		 email = email.trim();

		    if(email == null || email.equals("")){
		    	System.out.println("el email esta mal");
		        return false;}

		    if(email.matches("[a-zA-Z]*")){
		    	System.out.println("el email esta mal");
		        return false;}
		    
		    if(!email.contains("@")){
		    	System.out.println("el email esta mal");
		    	return false;}
		    
		    return true;
	}

	@Override
	public void setField(String field) {
		this.email = field;
		
	}
	
}
