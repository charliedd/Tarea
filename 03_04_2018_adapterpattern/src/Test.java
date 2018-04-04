
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat myCat = new Cat();
		
		DogAdapter fakeDog = new DogAdapter(myCat);
		
		BullDog realDog = new BullDog();
		
		System.out.println("Fakedog says: " + fakeDog.bark());
		System.out.println("Fakedog says: "+ fakeDog.bite());
		
		System.out.println(realDog.bark());
		System.out.println(realDog.bite());
		
	}

}
