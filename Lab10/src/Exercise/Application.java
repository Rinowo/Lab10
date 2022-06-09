package Exercise;

import java.util.Scanner;

public class Application {
    public static void menu() {
        System.out.println("1. Enter Triangle");
        System.out.println("2. Get Area");
        System.out.println("3. Print Error");
        System.out.println("4. Exit");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle();
        InvalidTriangleException invalidTriangleException = new InvalidTriangleException();

        while(true) {
            menu();
            int choose = sc.nextInt();
            switch (choose) {
                case 1 -> triangle.inputAngle();
                case 2 -> {
                    triangle.printList();
                    triangle.printArea();
                }
                case 3 -> invalidTriangleException.printError();
                case 4 -> System.exit(0);
            }
        }
    }
}
