
public class Knight extends Character{
	
	public Knight(String name, int lifePoints, int baseStrength) {
		super(name, lifePoints, baseStrength);
		// TODO Auto-generated constructor stub
	}

	public String fight(iCharacter target){
		return "I'm a Knight and I " + super.fight(target);
	}
}
