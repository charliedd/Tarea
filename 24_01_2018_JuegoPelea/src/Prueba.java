
public class Prueba {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Knight knight = new Knight("Horacio", 100, 10);
		Troll troll = new Troll("Fidel",100,5);
		
		
		troll.iSetWeaponBehaviour(new KnifeBehaviour());
		
		
		
		System.out.println(knight.fight(troll));
		System.out.println(troll.fight(knight));
		
		knight.iSetWeaponBehaviour(new SwordBehaviour());
		
		System.out.println(knight.fight(troll));
		
		System.out.println(troll.fight(knight));
		
		System.out.println(knight.fight(troll));
		
		System.out.println(troll.fight(knight));
	}
}
