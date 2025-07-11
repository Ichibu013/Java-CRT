package EasyEg;

import java.util.Scanner;

public class AreaPrg {

    public static void areaCircle(double num) {
        System.out.println("Area : " + ((num * num) * ((double) 22 / 7)));
    }

    public static void areaTriangle(double b, double h) {
        System.out.println("Area" + (b * h) / 2);
    }

    public static void areaSquare(double num) {
        System.out.println("Area" +num * num);
    }

    public static void areaRectangle(double l, double w) {
        System.out.println("Area" +l * w);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("For Circle");
        System.out.print("Enter radius: ");
        int num = input.nextInt();
        areaCircle(num);
        System.out.println("For Triangle");
        System.out.print("Enter length: ");
        int length = input.nextInt();
        System.out.print("Enter width: ");
        int width = input.nextInt();
        areaTriangle(length, width);
        System.out.println("For Square");


    }

}
