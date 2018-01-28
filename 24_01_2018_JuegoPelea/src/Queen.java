
public class Queen extends Character{
	
	public Queen(String name, int lifePoints, int baseStrength) {
		super(name, lifePoints, baseStrength);
		// TODO Auto-generated constructor stub
	}

	public String fight(iCharacter target){
		return "I'm a Queen and I " + super.fight(target);
	}
}
