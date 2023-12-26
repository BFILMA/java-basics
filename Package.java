import java.util.Scanner;

class Package {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter name");

            String name = scanner.nextLine();
            System.out.println("Your name is: " + name);
        }
    }
}