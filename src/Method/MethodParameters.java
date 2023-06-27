package Method;

import java.util.Scanner;

public class MethodParameters {
    static void myMethod(String firstName) {
        System.out.println(firstName + " Zhekova");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        myMethod("Slavena");
        myMethod("Slaven");
        myMethod("Slave");
        myMethod("Slav");
        myMethod("Sla");
        myMethod("Sl");

    }
}
