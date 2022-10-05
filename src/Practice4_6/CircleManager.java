package Practice4_6;

import java.util.Scanner;

public class CircleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c[] = new Circle[3];

        // create three Circle objects
        for (int i = 0; i < c.length; i++) {
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Circle(x, y, radius);
        }

        // find Circle of maximum area
        Circle max = c[0];
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i].getArea() < c[i+1].getArea())
                max = c[i+1];
        }

        System.out.println("가장 면적이 큰 원은 (" + max.getX() +
                ", " + max.getY() + ")" + max.getRadius());
    }
}
