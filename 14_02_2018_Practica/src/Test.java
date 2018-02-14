import java.util.Timer;
import java.util.TimerTask;

public class Test {
	public static void main(String[] args){
		
		Provider DHL = new Provider("dhl",2);
		Provider Fedex = new Provider("fdx",1);
		Provider correoMexico = new Provider("cm",5);
		
		FirstUserType user1 = new FirstUserType("Juan");
		FirstUserType user2 = new FirstUserType("Pedro");
		FirstUserType user3 = new FirstUserType("Jorge");
		FirstUserType user4 = new FirstUserType("Sancho");

		
		
		user1.registerPackage(DHL, "Reloj");
		user1.registerPackage(DHL, "Reloj2");
		user1.registerPackage(Fedex, "Libro");
		user1.registerPackage(correoMexico, "Cuchillo");
		
		user2.registerPackage(Fedex, "Auto");
		user2.registerPackage(DHL, "Object Oriented Programming 4 dummies");
		user2.registerPackage(correoMexico, "Playstation");
		
		
		Timer t = new Timer();
		t.schedule(new TimerTask() {
		    @Override
		    public void run() {
		    	DHL.checkStatus();
				Fedex.checkStatus();
				correoMexico.checkStatus();
		    }
		}, 0, 1000);
		
		
		
		
		
	}
}
