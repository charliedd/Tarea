import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerInputStream extends FilterInputStream{

	protected LowerInputStream(InputStream arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	@Override 
	public int read() throws IOException{
		int b = super.in.read();
		
		if (b == -1)return -1;
			
		char c = (char)b;
		
		c = Character.toLowerCase(c);
		
		int m = (int)c;
		
		return m;
	}
	

}
