import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scn.next();
        System.out.printf("Hello, %s!",name);
    }
}