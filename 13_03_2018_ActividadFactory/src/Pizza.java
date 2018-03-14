
public abstract class Pizza {
	public String desc;
	
	Pizza(String tipo){
		desc = tipo;
	}
	
	public void addtoDesc(String desc){
		this.desc += desc;
	}
	
	public void hornear(){
		return;
	}
	
	public void cortar(){
		return;
	}
	
	public String toString(){
		return desc;
	}
		

}
