
import java.util.ArrayList;

public class FortuneCookie implements ISurprise {

	private String message;
	private static final ArrayList<String> messages = RandomNr.addFortuneCookie();

	private FortuneCookie(String message) {
		this.message = message;
	}

	public static ISurprise generate() {
		int nr = RandomNr.getRandom().nextInt(20);
		return new FortuneCookie(messages.get(nr));
	}

	@Override
	public void enjoy() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return this.message;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		FortuneCookie fortuneCookie = (FortuneCookie) obj;
		return this.message.equals(fortuneCookie.message);
	}

	@Override
	public int hashCode() {
		return ((this.message == null) ? 0 : this.message.hashCode());
	}
}