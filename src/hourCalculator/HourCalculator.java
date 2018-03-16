package hourCalculator;

import java.util.Scanner;

public class HourCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int minuteResult = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print("Hari ke "+(i+1)+" masuk jam : ");
			String come = in.nextLine();
			System.out.print("Hari ke "+(i+1)+" pulang jam : ");
			String out = in.nextLine();
			String[] splitterCome = come.split(":");
			String[] splitterOut = out.split(":");
			minuteResult += (Integer.parseInt(splitterOut[0])-Integer.parseInt(splitterCome[0]))*60+(Integer.parseInt(splitterOut[1])-Integer.parseInt(splitterCome[1]));
			System.out.println("Total "+(i+1)+" : "+minuteResult+" menit");
		}
		System.out.println((minuteResult/60)+" jam, "+(minuteResult%60)+" menit");
	}
}
