package rockPaperScissors;

import java.time.LocalDate;
import java.time.Month;

public class RPSapp {

	public static void main(String[] args) {
		LocalDate.of(2021, Month.JULY, 12);

		RoShamBo rsb = new RoShamBo();

		rsb.call(RPS.SCISSORS);
	}
}
