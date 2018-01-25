package objectOrientedProgramming;

//Create instances
public class Motor {
	
	private int cyclinders;
	private int hp;
	private String type;
	
	//create constructor
	public Motor(int cyclinders, int hp, String type) {
		super();
		this.cyclinders = cyclinders;
		this.hp = hp;
		this.type = type;
	}
//create getters
	public int getCyclinders() {
		return cyclinders;
	}

	public int getHp() {
		return hp;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Motor cyclinders = " + cyclinders + ", hp = " + hp + ", type = " + type;
	}

}