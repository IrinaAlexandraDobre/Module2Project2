import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ISurprise fortuneCookie1 = FortuneCookie.generate();
		ISurprise fortuneCookie2 = FortuneCookie.generate();
		ISurprise fortuneCookie3 = FortuneCookie.generate();
		ISurprise fortuneCookie4 = FortuneCookie.generate();
		ISurprise fortuneCookie5 = FortuneCookie.generate();
		ISurprise candies1 = Candies.generate();
		ISurprise candies2 = Candies.generate();
		ISurprise candies3 = Candies.generate();
		ISurprise candies4 = Candies.generate();
		ISurprise minion1 = MinionToy.generate();
		ISurprise minion2 = MinionToy.generate();
		ISurprise minion3 = MinionToy.generate();
		ISurprise minion4 = MinionToy.generate();

		ArrayList<ISurprise> surprises1 = new ArrayList<>();
		surprises1.add(candies1);
		surprises1.add(fortuneCookie1);
		surprises1.add(minion1);

		ArrayList<ISurprise> surprises2 = new ArrayList<>();
		surprises2.add(candies2);
		surprises2.add(fortuneCookie2);
		surprises2.add(minion2);

		ArrayList<ISurprise> surprises3 = new ArrayList<>();
		surprises3.add(candies3);
		surprises3.add(fortuneCookie3);
		surprises3.add(minion3);

		for (ISurprise surprise : surprises1) {
			surprise.enjoy();
		}
		System.out.println();

		// create new bags with the ArrayLists surprises1, surprises2, surprises3
		IBag bag1 = new FIFOContainer(surprises1);
		IBag bag2 = new LIFOContainer(surprises2);
		IBag bag3 = new RandomContainer(surprises3);

		ArrayList<IBag> bags = new ArrayList<>();
		bags.add(bag1);
		bags.add(bag2);
		bags.add(bag3);

		for (IBag bag : bags) {
			System.out.println(bag);
		}

		System.out.println();

		// take out one surprise from each bag- FIFO, LIFO, RANDOM
		for (IBag bag : bags) {
			System.out.println(bag.takeOut());
		}

		for (IBag bag : bags) {
			System.out.println(bag);
		}

		System.out.println();

		System.out.println("bag1 size: " + bag1.size());
		System.out.println("bag2 size: " + bag2.size());
		System.out.println("bag3 size: " + bag3.size());

		System.out.println();

		// use gather() to create random surprises
		System.out.println(GatherSurprises.gather(3));
		System.out.println();
		System.out.println(GatherSurprises.gather());
		System.out.println();

		// add a new surprise in bag1
		System.out.println("Bag1:");
		System.out.println(bag1);
		System.out.println();
		bag1.put(fortuneCookie4);
		System.out.println("Bag1:");
		System.out.println(bag1);
		System.out.println();

		// checking method put(IBag) in Bags
		bag1.put(bag2);
		System.out.println(bag1.isEmpty());
		System.out.println(bag2.isEmpty());
		System.out.println();
		System.out.println("Bag1:");
		System.out.println(bag1);
		System.out.println();

		AbstractGiveSurprises giveSurprises1 = new GiveSurpriseAndSing("lifo", 2);
		AbstractGiveSurprises giveSurprises2 = new GiveSurpriseAndHug("random", 1);
		AbstractGiveSurprises giveSurprises3 = new GiveSurpriseAndApplause("fifo", 3);

		giveSurprises1.put(candies4);
		giveSurprises1.put(fortuneCookie1);
		giveSurprises1.put(candies3);
		giveSurprises1.put(minion4);

		System.out.println("giveSurprises1: ");
		System.out.println(giveSurprises1);
		// give all surprises
		System.out.println();
		giveSurprises1.giveAll();
		System.out.println();

		// check if bag is empty after giving all surprises
		System.out.println(giveSurprises1.isEmpty());
		System.out.println();

		giveSurprises1.put(candies4);
		giveSurprises1.give();
		System.out.println();

		// add a bag in another one
		giveSurprises2.put(bag1);

		// give only one surprise
		giveSurprises2.give();
		System.out.println();

		System.out.println("giveSurprises3: ");
		System.out.println(giveSurprises3);
		giveSurprises3.put(fortuneCookie1);
		giveSurprises3.put(candies3);
		giveSurprises3.put(fortuneCookie5);
		System.out.println("giveSurprises3: ");
		System.out.println(giveSurprises3);

		// give all surprises
		giveSurprises3.giveAll();
		
//		AbstractGiveSurprises giveSurprises4 = new GiveSurpriseAndApplause("fi", 1);

	}

}
