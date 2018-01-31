
public class Genero implements IValidacion {
	String genero;

	public boolean validar() {
		genero = genero.trim();

	    if(genero == null || genero.equals("")){
	    	System.out.println("El genero esta mal"); 
	    	return false;
	    }
	       

	    if(!genero.matches("[a-zA-Z]*")){
	    	System.out.println("El genero esta mal");
	        return false;}
	    
	    return true;
	}

	@Override
	public void setField(String field) {
		// TODO Auto-generated method stub
		this.genero = field;
	}
	
	
}
