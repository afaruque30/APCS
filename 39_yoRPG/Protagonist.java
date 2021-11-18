public class Protagonist{
	private String name;
	private int health;
	private int damage;
	private boolean defense;
	
	
	public Protagonist(String name){
		this.name = name;
	}
	public static boolean isAlive(){
	return (health>0);
	}
	
	public static void specialize(){
	damage=20;
	health= 100;
	defense=false;
	}
	public static void normalize(){
	damage=10;
	health=100;
	defense=true;
	}
	
	public boolean getDefense(){
	return defense;
	}
	
	public int getHealth(){
	return health;
	}
	public int attack(Monster m){
		m.health -= damage;
		return damage;
	}
	public String getName(){
		return name;
	}
}	
