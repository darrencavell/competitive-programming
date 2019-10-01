package bottle.up.feelings;

import java.util.Scanner;

public class BottleUpFeelings {

	/*
	 * Peter has a ship full of oil, bigger bottle1 and smaller bottle2.
	 * The thing is that, how to maximize the amount of times taken using bottle1 and bottle2.
	 * If it is possible, return the amount of times.
	 * If it is not, return Impossible.
	 *
	 * Input: 1000 7 3
	 * Output: 142 2
	 *
	 * Input: 1000 900 7
	 * Output: Impossible
	 */

	public BottleUpFeelings() {
		Scanner scan = new Scanner(System.in);
		int drums, bottle1, bottle2;
		drums = scan.nextInt(); bottle1 = scan.nextInt(); bottle2 = scan.nextInt();
		int fillTimes = drums / bottle1;
		while ((drums - (fillTimes * bottle1)) % bottle2 != 0 && fillTimes >= 0) {
			fillTimes--;
		}
		if (fillTimes < 0) System.out.println("Impossible");
		else System.out.println(fillTimes + " " + (drums - (fillTimes * bottle1)) / bottle2);
	}
}
