public class Monster{

	private int health;
	private int damage;
	
	
	public Monster(){
	health=100;
	damage=20;
	}
	
	public static boolean isAlive(){
	return (health>0);
	}
		
	public int attack(Protagonist p){
		if (defense) {
		p.health -= damage-10;
		return damage-10;
		}
		else {p.health -= damage;
		return damage;
		}
	}
	public String getName(){
		return name;
	}
}
