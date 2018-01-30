
public class Password implements iCampo {
	String pswrd;

	public boolean validar() {
		pswrd = pswrd.trim();

	    if(pswrd == null || pswrd.equals(""))
	        return false;
	    
	    return true;
	}

	public void setField(String field) {
		// TODO Auto-generated method stub
		this.pswrd = field;
	}
	
}
