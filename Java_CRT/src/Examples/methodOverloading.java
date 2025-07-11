package Examples;

import java.util.Scanner;

public class methodOverloading {
    public static String Display(){
        return "Student Details Displayed below";
    }
    public static String Display(String name){
        return "Student Name: " + name;
    }
    public static int Display(int roll){
        return roll;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your roll number: ");
        int roll = sc.nextInt();
        System.out.println(Display());
        System.out.println(Display(name));
        System.out.println(Display(roll));
        sc.close();
    }
}
