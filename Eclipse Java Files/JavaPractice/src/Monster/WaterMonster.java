package Monster;

public class WaterMonster extends Monster {

	public WaterMonster(String name) {
		super(name);
	}

	@Override
	protected String attack() {
		return "Attack wiith water!";
	}
}
