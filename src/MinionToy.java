
import java.util.ArrayList;

public class MinionToy implements ISurprise {

	private String name;
	private static final ArrayList<String> minions = RandomNr.addMinions();
	private static int counter = 0;

	private MinionToy(String name) {
		this.name = name;
	}

	public static ISurprise generate() {
		MinionToy.counter++;
		MinionToy.counter = MinionToy.counter == 7 ? MinionToy.counter = 1 : MinionToy.counter++;
		return new MinionToy(minions.get(MinionToy.counter - 1));
	}

	@Override
	public void enjoy() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "You received a minion. His name is " + this.name + "!";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		MinionToy minion = (MinionToy) obj;
		return this.name.equals(minion.name);
	}

	@Override
	public int hashCode() {
		return ((this.name == null) ? 0 : this.name.hashCode());
	}
}