
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat myCat = new Cat();
		Turkey turkey = new Turkey();
		
		Dog fakeDog = new DogAdapter(myCat);
		Dog fakeTurkeyDog = new DogAdapterforTurkey(turkey);
		
		BullDog realDog = new BullDog();
		
		System.out.println("Fakedog says: " + fakeDog.bark());
		System.out.println("Fakedog says: "+ fakeDog.bite());
		
		System.out.println("FakeTurkeydog says: " + fakeTurkeyDog.bark());
		System.out.println("FakeTurkeydog says: "+ fakeTurkeyDog.bite());
		
		System.out.println(realDog.bark());
		System.out.println(realDog.bite());
		
	}

}
