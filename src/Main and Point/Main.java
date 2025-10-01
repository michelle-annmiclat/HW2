package Main;

import Device.Device;
import Device.Microwave;

public class Main {

    public static void attemptToChangePrimitive(int val) {
        System.out.println("Inside method, parameter 'val' starts as: " + val);
        val = 99; // Local change
        System.out.println("Inside method, parameter 'val' is now: " + val);
    }

    public static void resetPoint(Point p) {
        p.move(0, 0); // modifies original
        p = new Point(0, 0); // only changes the local copy of reference
    }

    public static int sumCoordinates(Point... points) {
        int sum = 0;
        for (Point point : points) {
            sum += point.x;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Exercise 1
        Point startPoint = new Point(10, 20);
        System.out.println("x value: " + startPoint.x);
        startPoint.move(5, -3);
        startPoint.printState();

        // Exercise 2
        int originalValue = 50;
        attemptToChangePrimitive(originalValue);
        System.out.println("After method call, originalValue = " + originalValue);

        Point refPoint = new Point(3, 4);
        resetPoint(refPoint);
        refPoint.printState();

        // Exercise 3
        Point zeroPoint = new Point();
        zeroPoint.printState();

        // Exercise 4–6
        Microwave m1 = new Microwave(1200, 30);
        m1.printDescription();

        // Exercise 5
        Point p1 = new Point(2, 3);
        Point p2 = new Point(5, 7);
        Point p3 = new Point(-1, 4);

        int total = sumCoordinates(p1, p2, p3);
        System.out.println("Sum of x-coordinates = " + total);

        // Exercise 7 – polymorphism
        Device d1 = new Device(500);
        Device polyDevice = m1; // upcasting
        polyDevice.printDescription(); // runs Microwave’s override (runtime type!)

        // Exercise 8 – downcasting safely
        if (polyDevice instanceof Microwave) {
            Microwave realMicrowave = (Microwave) polyDevice;
            realMicrowave.heatFood();
        }
    }
}
