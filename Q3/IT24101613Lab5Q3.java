import java.util.Scanner;
public class IT24101613Lab5Q3 {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		final double ROOM_CHARGE_PER_DAY=48000.0;
		final double DISCOUNT_3_TO_4_DAYS=0.1;
		final double DISCOUNT_5_OR_MORE_DAYS=0.2;
		double discount=0.0;
		double totalAmount;
		System.out.print("Enter Start Date (1-31): ");
		int startDate=reader.nextInt();
		System.out.print("Enter End Date (1-31): ");
		int endDate=reader.nextInt();
		if (startDate<1  || startDate>31) {
			System.out.println("Error: Days must be between 1 and 31");
			return;
		}
		if (endDate<1  || endDate>31) {
			System.out.println("Error: Days must be between 1 and 31");
			return;
		}
		if (startDate>endDate) {
			System.out.println("Error: Start Date must be less than the End Date");
			return;
		}
		int reservedDays=endDate-startDate;
		if (reservedDays==3 || reservedDays==4) {
			discount=DISCOUNT_3_TO_4_DAYS;
		}
		if (reservedDays>=5) {
			discount=DISCOUNT_5_OR_MORE_DAYS;
		}
		totalAmount=(ROOM_CHARGE_PER_DAY*reservedDays)-(ROOM_CHARGE_PER_DAY*reservedDays*discount);
		System.out.println();
		System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
		System.out.println("Number of Days Reserved: "+ reservedDays);
		System.out.println("Total Amount to be Paid: "+totalAmount);
	}
}