
//Travis Davis
import java.util.Random;

public class Coin {
	@SuppressWarnings("unused")
	private String sideUp;
	private Random rand = new Random();
	private int randomNum;

	public Coin() {
	}

	public void toss() {
		randomNum = rand.nextInt((2 - 1) + 1) + 1;
	}

	public String getSideUp() {
		switch (randomNum) {
		case 1:
			return sideUp = "heads";
		case 2:
			return sideUp = "tails";
		default:
			return sideUp = "error";
		}
	}
}
