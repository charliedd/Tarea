
public class King extends Character {
	
	public King(String name, int lifePoints, int baseStrength) {
		super(name, lifePoints, baseStrength);
		// TODO Auto-generated constructor stub
	}

	public String fight(iCharacter target){
		return "I'm a King and I " + super.fight(target);
	}
}
