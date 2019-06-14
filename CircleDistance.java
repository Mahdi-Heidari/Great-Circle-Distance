package circle.distance;

import java.util.Scanner;

public class CircleDistance {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double x1, y1, x2, y2, distance;
//        The average earth radius is 6,371.01 km.
        final double radius = 6371.01;

//        Prompts the user to enter point 1.
        System.out.print("Enter point 1 (latitude and longitude) in degrees:\t");
        x1 = input.nextDouble();
        y1 = input.nextDouble();

//        Prompts the user to enter point 2.
        System.out.print("Enter point 2 (latitude and longitude) in degrees:\t");
        x2 = input.nextDouble();
        y2 = input.nextDouble();

//        Calculating the distance.
        distance = radius * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2))
                + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2))
                * Math.cos(Math.toRadians(y1) - Math.toRadians(y2)));

        System.out.printf("The distance between the two points is %f km\n", distance);

    }

}
