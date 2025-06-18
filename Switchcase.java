import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int marks;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter name of Student " + i + ":");
            name = scanner.nextLine();

            System.out.println("Enter marks of " + name + " (out of 100):");
            marks = scanner.nextInt();
            scanner.nextLine();

            double percentage = marks;

            System.out.println("---- Report for " + name + " ----");
            System.out.println("Marks: " + marks);
            System.out.println("Percentage: " + percentage + "%");

            if (marks >= 35) {
                System.out.println("Result: Pass");
            } else {
                System.out.println("Result: Fail");
            }

            int grade = marks / 10;
            System.out.print("Grade: ");
            switch (grade) {
                case 10:
                case 9:
                    System.out.println("A+ (Excellent)");
                    break;
                case 8:
                    System.out.println("A (Very Good)");
                    break;
                case 7:
                    System.out.println("B+ (Good)");
                    break;
                case 6:
                    System.out.println("B (Above Average)");
                    break;
                case 5:
                    System.out.println("C+ (Average)");
                    break;
                case 4:
                    System.out.println("C (Below Average)");
                    break;
                default:
                    System.out.println("F (Fail)");
            }

            System.out.println("-------------------------------");
        }

        scanner.close();
    }
}
