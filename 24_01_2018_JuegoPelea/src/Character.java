
public abstract class Character implements iCharacter {
	iWeaponBehaviour weapon;
	String name;
	
	int baseStrength;
	int lifePoints;
	
	
	public String fight(iCharacter target){
		if(lifePoints <= 0)return "'m already dead so I can't Attack";
		
		int totalDamage = baseStrength + weapon.getWeaponDamage(); //Total damage = Base Strength + Weapon Damage
		return "attacked " + target.getName() + 
			   " with my " + weapon.useWeapon() + 
			   " for "+ totalDamage + " of Damage."+
			   "\n" + target.receivAttack(totalDamage);
	}
	
	public void iSetWeaponBehaviour(iWeaponBehaviour weapon){
		this.weapon = weapon;
	};
	
	public String receivAttack(int damage){
		lifePoints -= damage;
		if (lifePoints <= 0)return  this.name + " Stopped existing";
		else return this.name + " received " + damage + " damage ";
		
	};
	
	public String getName(){
		return this.name;
	}
	
	public Character(String name, int lifePoints, int baseStrength){
		this.name = name;
		this.lifePoints = lifePoints;
		this.baseStrength = baseStrength; 
		this.weapon = new UnarmedBehaviour();//Attack bare-handed by default
	}

	
}
