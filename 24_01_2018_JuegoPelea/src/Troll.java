
public class Troll extends Character{
	
	public Troll(String name, int lifePoints, int baseStrength) {
		super(name, lifePoints, baseStrength);
		// TODO Auto-generated constructor stub
	}

	public String fight(iCharacter target){
		return "I'm a troll and I " + super.fight(target);
	}
}
