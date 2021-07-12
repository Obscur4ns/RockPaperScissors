package rockPaperScissors;

import java.util.Random;

public class RoShamBo {

	private Random rand = new Random();

	public RPS call(RPS call) {
		int rng = rand.nextInt(101);

		RPS result = null;
		if (rng < 50) {
			result = RPS.ROCK;
		} else if (rng < 100) {
			result = RPS.PAPER;
		} else {
			result = RPS.SCISSORS;
		}

		System.out.println("You chose " + call + " and it was " + result);
		if (call == result) {
			System.out.println("Winner winner, chicken dinner!");
		} else {
			System.out.println("Suckaaaa!");
		}

		return result;
	}

}
