
public class Name implements IValidacion{
	String name;

	public boolean validar() {
		name = name.trim();

	    if(name == null || name.equals("")){
	    	System.out.println("El nombre esta mal");
	    	return false;
	    }
	        

	    if(!name.matches("[a-zA-Z]*")){
	    	System.out.println("El nombre esta mal");
	    	return false;
	    }
	        
	    
	    return true;
	}

	@Override
	public void setField(String field) {
		this.name = field;
		
	}
	
	
	
}
