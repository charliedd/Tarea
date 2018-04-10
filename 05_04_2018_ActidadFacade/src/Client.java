
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacadeTheater facadeTheater = new FacadeTheater();
		
		System.out.println(facadeTheater.watchMovie());
		
		System.out.println("\n");
		
		System.out.println(facadeTheater.pauseMovie());

	}

}
