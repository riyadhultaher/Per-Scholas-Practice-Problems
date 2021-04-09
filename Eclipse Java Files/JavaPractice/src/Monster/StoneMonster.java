package Monster;

public class StoneMonster extends Monster{

	public StoneMonster(String name) {
		super(name);
	}

	@Override
	protected String attack() {
		return "Attack with stones!";
	}

}
