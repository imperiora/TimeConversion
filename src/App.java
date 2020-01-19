import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input the number of minutes: ");

		int minutes = input.nextInt();
		int years = 0;
		int days = 0;

		if (minutes >= 525600) {
			years = minutes / 525600;
			days = (minutes % 525600) / 1440;
			System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
		} else {
			days = minutes / 1440;
			System.out.println(minutes + " minutes is approximately " + " 0 years and " + days + " days");
		}
	}

}
