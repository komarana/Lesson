import java.util.Scanner;

public class Work1_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Surname: ");
        String surname = in.nextLine();

        System.out.print("Name: ");
        String name = in.nextLine();

        System.out.print("Patronymic: ");
        String patronymic = in.nextLine();

        System.out.print("Age: ");
        int age = in.nextInt();
        int year = 2021 - age;

        System.out.printf("Hello %s %s %s. \nYour age: %d. \nYear of birth: %d", surname, name, patronymic, age, year);
    }

}

