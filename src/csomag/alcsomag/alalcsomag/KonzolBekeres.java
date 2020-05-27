package csomag.alcsomag.alalcsomag;

import java.util.Scanner;

public class KonzolBekeres {

    public static void main(String[] args) {
        // Scannerrel
        Scanner scannerBekerdezo = new Scanner(System.in);
        System.out.println("Írj be egy stringet = ");
        String s = scannerBekerdezo.nextLine();
        System.out.println("You entered string " + s);
        System.out.println("Írj be egy egész számot =");
        int a = scannerBekerdezo.nextInt();
        System.out.println("You entered integer " + a);
        System.out.println("Írj be egy tört számot = ");
        float b = scannerBekerdezo.nextFloat();
        System.out.println("You entered float " + b);
    }
}
