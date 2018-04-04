
public class DogAdapterforTurkey implements Dog{
	Turkey turkey;
	
	
	DogAdapterforTurkey(Turkey turkey){
		this.turkey = turkey;
	}
	
	@Override
	public String bark() {
		// TODO Auto-generated method stub
		return turkey.gururu();
	}

	@Override
	public String bite() {
		// TODO Auto-generated method stub
		return turkey.peck();
	}
	
}
