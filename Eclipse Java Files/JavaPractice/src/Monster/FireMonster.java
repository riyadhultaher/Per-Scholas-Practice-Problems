package Monster;

public class FireMonster extends Monster {

	public FireMonster(String name) {
		super(name);
	}

	@Override
	protected String attack() {
		
		return "Attack with fire!";
	}
	
}
