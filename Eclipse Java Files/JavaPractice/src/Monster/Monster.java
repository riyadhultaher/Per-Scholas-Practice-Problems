package Monster;

/*
 * The instructions of this program want us to create a Monster
 * superclass and three different type of monster subclasses. 
 * However, the superclass must be a concrete class because the last
 * line of output creates an instance of the Monster class. Thus, this
 * program produces the correct result as long as the Monster class is
 * concrete.
 */

public class Monster {
	
	private String name;
	
	public Monster (String name) {
		this.name = name;
	}
	
	protected String attack () {
		return "!^_&^$@+%$* I don't know how to attack!";
	}
	
	public String getName() {
		return name;
	}
}
