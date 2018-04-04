
public class DogAdapter implements Dog{
	Cat mycat;
	
	DogAdapter(Cat mycat){
		this.mycat = mycat;
	}
	
	@Override
	public String bark() {
		// TODO Auto-generated method stub
		return mycat.purr();
	}

	@Override
	public String bite() {
		// TODO Auto-generated method stub
		return mycat.slash();
	}

}
