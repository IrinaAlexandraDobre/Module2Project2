import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {
	IBag bag;
	int waitTime;

	AbstractGiveSurprises(String type, int waitTime) {
		this.bag = new CreateBag().makeBag(type);
		this.waitTime = waitTime;
	}

	void put(ISurprise newSurprise) {
		this.bag.put(newSurprise);
	}

	void put(IBag surprises) {
		this.bag.put(surprises);
	}

	void give() {
		System.out.println(this.bag.takeOut());
		giveWithPassion();
	}

	void giveAll() {
		int size = this.bag.size();
		for (int i = 0; i < size; i++) {
			System.out.println(this.bag.takeOut());
			try {
				TimeUnit.SECONDS.sleep(this.waitTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		giveWithPassion();
	}

	boolean isEmpty() {
		return this.bag.isEmpty();
	}

	protected abstract void giveWithPassion();
	
	@Override
	public String toString() {
		if (this.bag.isEmpty()) {
			return "The bag is empty!";
		}
		return "Abstract surprises- " + this.bag;
	}

}
