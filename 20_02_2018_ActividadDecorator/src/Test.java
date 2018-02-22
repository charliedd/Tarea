
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bebida mochaChico = new Mocha();
		mochaChico.setSize("s");
		mochaChico= new Crema(mochaChico);
		mochaChico = new Azucar(mochaChico);
		
		System.out.println(mochaChico.cost());
		
		Bebida mochaMediano = new Mocha();
		mochaMediano.setSize("m");
		mochaMediano= new Crema(mochaMediano);
		mochaMediano = new Azucar(mochaMediano);
		
		System.out.println(mochaMediano.cost());
		
		Bebida mochaGrande = new Mocha();
		mochaGrande = new Crema(mochaGrande);
		mochaGrande = new Azucar(mochaGrande);
		
		System.out.println(mochaGrande.cost());
	}

}
