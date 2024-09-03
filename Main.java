import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float weight;
		int age;
		int gender;
		float time;
		int heartrate;
				
		System.out.println("Enter your Weight");
		weight = sc.nextFloat();
		
		System.out.println("Enter your Age");
		age = sc.nextInt();
		
		System.out.println("Are you a Male or Female?");
		System.out.println("Enter 1 if Male, Enter 0 if Female");
		gender = sc.nextInt();
	
		System.out.println("Time you completed the briskwalk");
		System.out.println("For example: 4 Minutes and 30 seconds, put in decimal: 14.30");
		time = sc.nextFloat();
	
		System.out.println("Heartrate in a minute");
		heartrate = sc.nextInt();
		
		System.out.println("VO2MAX: " + Math.round(132.853 - (0.1692 * weight) - (0.3877 * age) + (6.315 * gender) - (3.2649 * time) - (0.156 * heartrate)));
	}
}
