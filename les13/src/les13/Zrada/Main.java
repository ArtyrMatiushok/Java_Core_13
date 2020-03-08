package les13.Zrada;

import java.util.Scanner;

public class Main {
	
	static VerkhovnaRada VR;
	
	public static void main(String[] args) {
		VR = VerkhovnaRada.getInstance();
		Scanner in = new Scanner(System.in);
		boolean flag = false;
		String titleOfFraction;
		while (!flag) {
			System.out.println("Input 1 to add a fraction");
			System.out.println("Input 2 to remove the fraction");
			System.out.println("Input 3 to show all fractions");
			System.out.println("Input 4 to clear the fraction");
			System.out.println("Input 5 to show the fraction");
			System.out.println("Input 6 to add a senator to the fraction");
			System.out.println("Input 7 to remove a senator from the fraction");
			System.out.println("Input 8 to show all bribe takers from the fraction");
			System.out.println("Input 9 to show the best bribe taker from the fraction");
			
			int input = in.nextInt();
			in.nextLine();
			
			switch(input) {
			case 1:
				System.out.print("Enter the title of fraction: ");
				titleOfFraction = in.nextLine();
				VR.addFraction(new Fraction(titleOfFraction));
				break;
			case 2:
				System.out.print("Enter the title of fraction: ");
				titleOfFraction = in.nextLine();
				VR.removeFraction(titleOfFraction);
				break;
			case 3:
				VR.showAllFractions();
				break;
			case 4:
				System.out.print("Enter the title of fraction: ");
				titleOfFraction = in.nextLine();
				VR.removeSenatorsFromFraction(titleOfFraction);
				break;
			case 5:
				System.out.print("Enter the title of fraction: ");
				titleOfFraction = in.nextLine();
				VR.showFraction(titleOfFraction);
				break;
			case 6:
				System.out.print("Enter the title of fraction: ");
				titleOfFraction = in.nextLine();
				VR.addSenatorToFraction(titleOfFraction);
				break;
			case 7:
				System.out.print("Enter the title of fraction: ");
				titleOfFraction = in.nextLine();
				VR.removeSenatorFromFraction(titleOfFraction);
				break;
			case 8:
				System.out.print("Enter the title of fraction: ");
				titleOfFraction = in.nextLine();
				VR.showAllBribeTakersFromFraction(titleOfFraction);
				break;
			case 9:
				System.out.print("Enter the title of fraction: ");
				titleOfFraction = in.nextLine();
				VR.showTheBestBribeTakersFromFraction(titleOfFraction);
				break;
			default:
					flag = true;
			}
			
		}
	}

}
