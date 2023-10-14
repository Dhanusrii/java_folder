package java_programs;
import java.util.*;

public class Switch {
	public static void main(String[] args) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number (1-7) to find the day of the week: ");
        int dayNumber = scan.nextInt();

        if (dayNumber >= 1 && dayNumber <= 7) {
            String dayName;
            switch (dayNumber) {
                case 1:
                    dayName = daysOfWeek[0];
                    break;
                case 2:
                    dayName = daysOfWeek[1];
                    break;
                case 3:
                    dayName = daysOfWeek[2];
                    break;
                case 4:
                    dayName = daysOfWeek[3];
                    break;
                case 5:
                    dayName = daysOfWeek[4];
                    break;
                case 6:
                    dayName = daysOfWeek[5];
                    break;
                case 7:
                    dayName = daysOfWeek[6];
                    break;
                default:
                    dayName = "Invalid day number";
            }
            System.out.println("The day of the week is: " + dayName);
        } else {
            System.out.println("Invalid input.");
        }

    }
}

