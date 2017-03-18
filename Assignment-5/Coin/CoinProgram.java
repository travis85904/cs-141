//Travis Davis
public class CoinProgram {
	private static Coin newCoin = new Coin();
	private static int heads, tails = 0;
	// private static ArrayList<String> flips = new ArrayList<String>();

	public static void main(String[] args) {
		System.out.println(newCoin.getSideUp());
		flipCoin();
		print();
	}

	// prints the number of time each side was shown
	public static void print() {
		System.out.println("Heads: " + heads);
		System.out.println("Tails: " + tails);
	}

	// flips coin 20 times and keeps track of each flip
	public static void flipCoin() {
		for (int i = 0; i < 20; i++) {
			newCoin.toss();
			// flips.add(newCoin.getSideUp());
			System.out.println(newCoin.getSideUp());
			switch (newCoin.getSideUp()) {
			case "heads":
				heads += 1;
				break;
			case "tails":
				tails += 1;
				break;
			}
		}
	}
}
