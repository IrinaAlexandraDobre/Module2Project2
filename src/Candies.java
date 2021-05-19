import java.util.ArrayList;

public class Candies implements ISurprise {

	private int noCandies;
	private static final ArrayList<String> candies = RandomNr.addCandies();
	private String type;

	private Candies(int noCandies, String type) {
		this.noCandies = noCandies;
		this.type = type;
	}

	public static ISurprise generate() {
		int no = RandomNr.getRandom().nextInt(7) + 1;
		int typeCandies = RandomNr.getRandom().nextInt(5);
		return new Candies(no, candies.get(typeCandies));
	}

	@Override
	public void enjoy() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "You received " + this.noCandies + " " + this.type + " candies!";
	}

}
