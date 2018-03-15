
public abstract class Pizza {
	String desc;
	String size;
	
	Pizza(){
		size = "c";
		desc = "";
	}
	
	public void addtoDesc(String newDesc){
		desc += newDesc;
	}
	
	public void setSize(String size){
		this.size = size;
	}
	
	public String getSize(){
		if (size == "g")return "Pizza Grande";
		if (size == "m")return "Pizza Mediana";
		else return "Pizza chica";
	}
	
	public void hornear(){
		return;
	}
	
	public void cortar(){
		return;
	}
	
	public abstract String getdesc();
}
