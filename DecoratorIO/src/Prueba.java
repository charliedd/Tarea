import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Prueba {

	public static void main(String[] args) {
		int c;
		
		InputStream in = new BufferedInputStream(System.in);
		in = new LowerInputStream(in);
		
		try{
			while((c = in.read()) >= 0){
				System.out.print((char)c);
			}
			in.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
