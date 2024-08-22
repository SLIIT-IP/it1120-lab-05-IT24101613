import java.util.Scanner;
public class IT24101613Lab5Q2 {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.print("Enter the number of new members introduced: ");
		int numberOfMembers=reader.nextInt();
		if (numberOfMembers<0) {
			System.out.println("Input must be number 0 or greater");
			return;
		}
		switch (numberOfMembers) {
			case 0:
				System.out.println("No prize");
				break;
			case 1:
				System.out.println("Prize is a: Pen");
				break;
			case 2:
				System.out.println("Prize is a: Umbrella");
				break;
			case 3:
				System.out.println("Prize is a: Bag");
				break;
			case 4:
				System.out.println("Prize is a: Travelling Chair");
				break;
			default:
				System.out.println("Prize is a: Headphone");
		}
	}
}