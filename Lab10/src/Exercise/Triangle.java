package Exercise;

import javax.imageio.metadata.IIOInvalidTreeException;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class Triangle {
    private ArrayList<Exercise.Client> tri = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Triangle() {
        tri.add(new Client(1, 4,11,6));
        tri.add(new Client(2, 8,13,19));
        tri.add(new Client(3, 6,8,12));
    }

    public void printList() {
        for (Client client :
                tri) {
            System.out.println(client);
        }
    }

    public void inputAngle() {
        printList();
        try {
            System.out.print("Enter id: "); int id = sc.nextInt();
            System.out.print("Enter size 1: "); double s1 = sc.nextDouble();
            System.out.print("Enter size 2: "); double s2 = sc.nextDouble();
            System.out.print("Enter size 3: "); double s3 = sc.nextDouble();
            Client client = new Client(id , s1, s2, s3);
        }
        catch (Exception e) {
            System.err.println("Exception Error " + e.getMessage());
            InvalidTriangleException invalidTriangleException = new InvalidTriangleException("Exception Error");
        }
    }


    public void printArea() {
        System.out.print("Enter id Triangle: "); int id = sc.nextInt();
        for (Client client :
                tri) {
            client.getPerimeter();
            if (client.getId() == id) {
                System.out.println("Area: " + client.getArea());
                break;
            }
        }
    }
}
