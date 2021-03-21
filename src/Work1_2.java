import java.util.Scanner;

public class Work1_2 {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Hours: ");
            int hour = in.nextInt();
            System.out.println("Rate per hour: ");
            int rate = in.nextInt();

            double allSalary = rate * hour;
            double firstTax = allSalary * 0.05;
            double secondTax = 1300;
            double Salary = allSalary - firstTax - secondTax;

            System.out.printf("All Salary: %.2f \nFirst Tax: %.2f \nSecond tax: %.2f \nFinal Salary: %.2f",
                    allSalary, firstTax, secondTax, Salary);

        }

}


