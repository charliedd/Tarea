
public class Campo {
	private IValidacion validacion;
	
	public Campo(IValidacion validacion){
		this.validacion = validacion;
	}
	
	public void setValidacion(IValidacion validacion){
		this.validacion = validacion;
		
	}
	
	public boolean validar(){
		return this.validacion.validar();
	}
	
	public void setField(String input){
		this.validacion.setField(input);
	}
	
}
