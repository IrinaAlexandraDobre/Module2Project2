import java.util.ArrayList;
import java.util.Random;

public class RandomNr {
	static Random random = new Random();

	public static Random getRandom() {
		return random;
	}

	public static ArrayList<String> addCandies() {
		ArrayList<String> myCandies = new ArrayList<>(5);
		myCandies.add("chocolate");
		myCandies.add("mint");
		myCandies.add("coffee");
		myCandies.add("vanilla");
		myCandies.add("strawberry");
		return myCandies;
	}

	public static ArrayList<String> addFortuneCookie() {
		ArrayList<String> mySayings = new ArrayList<>(20);
		mySayings.add("\"Life is really simple, but we insist on making it complicated.\" - Confucius");
		mySayings.add("\"The way to get started is to quit talking and begin doing.\" -Walt Disney");
		mySayings.add("\"May you live all the days of your life.\" -Jonathan Swift");
		mySayings.add("\"Life is ours to be spent, not to be saved.\" -D. H. Lawrence");
		mySayings.add(
				"\"If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough.\" -Oprah Winfrey");
		mySayings.add("\"Love the life you live. Live the life you love.\" -Bob Marley");
		mySayings.add("\"Life is what happens when you're busy making other plans. \"-John Lennon");
		mySayings.add(
				"\"Spread love everywhere you go. Let no one ever come to you without leaving happier.\" -Mother Teresa");
		mySayings.add("\"Life is made of ever so many partings welded together.\" -Charles Dickens");
		mySayings.add("\"Always remember that you are absolutely unique. Just like everyone else.\" -Margaret Mead");
		mySayings.add("\"If you really look closely, most overnight successes took a long time.\" -Steve Jobs");
		mySayings.add("\"The future belongs to those who believe in the beauty of their dreams.\" -Eleanor Roosevelt");
		mySayings.add("\"Tell me and I forget. Teach me and I remember. Involve me and I learn.\" -Benjamin Franklin");
		mySayings.add("\"I never dreamed about success, I worked for it.\" -Estee Lauder");
		mySayings.add("\"It is during our darkest moments that we must focus to see the light.\" - Aristotle");
		mySayings.add("\"I failed my way to success.\" -Thomas Edison");
		mySayings.add("\"Nothing is impossible, the word itself says, ‘I'm possible!'\" -Audrey Hepburn");
		mySayings.add("\"Whether you think you can or you think you can't, you're right.\" -Henry Ford");
		mySayings.add(
				"\"In the end, it's not the years in your life that count. It's the life in your years.\" -Abraham Lincoln");
		mySayings.add("\"Dream big and dare to fail.\" -Norman Vaughan");
		return mySayings;
	}

	public static ArrayList<String> addMinions() {
		ArrayList<String> myMinions = new ArrayList<>(6);
		myMinions.add("Stuart");
		myMinions.add("Dave");
		myMinions.add("Kevin");
		myMinions.add("Bob");
		myMinions.add("Phil");
		myMinions.add("Tim");
		return myMinions;
	}

	@Override
	public String toString() {
		return "The random number is: " + RandomNr.random;
	}

}
