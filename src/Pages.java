import java.util.Scanner;
public class Pages {

    public static void main(String[] args) {
    // create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your current age");
        int age = scanner.nextInt();

        int minAge = 7 + (age / 2);

        System.out.println(age + " year olds should date someone who is atleast" + minAge + " years old.");

        scanner.close();

    }
}
