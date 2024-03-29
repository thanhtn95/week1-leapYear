import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A YEAR: ");
        int year = sc.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year");
        } else System.out.println(year + " isn't a leap year");
    }

    private static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return true;
        }
        return false;
    }
}
