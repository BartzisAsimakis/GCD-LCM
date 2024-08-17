import java.util.Scanner;

public class gcdLcmPro {

    // Method to find GCD using the Euclidean algorithm
    public static int gcdFinder(int x, int y) {
        if (y == 0) {
            return x;
        }
        return gcdFinder(y, x % y);
    }

    // Method to find GCD and LCM for multiple numbers
    public static void gcdFinderPlus(int many) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number 1: ");
        int num1 = input.nextInt();

        int gcdTmp = num1;
        int lcmTmp = num1;

        for (int i = 1; i < many; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int num2 = input.nextInt();

            gcdTmp = gcdFinder(gcdTmp, num2);
            lcmTmp = lcmFinder(lcmTmp, num2);
        }

        System.out.println("=================================");
        System.out.println("GCD = " + gcdTmp);
        System.out.println("LCM = " + lcmTmp);
        System.out.println("=================================");

        // Closing the scanner
        input.close();
    }

    // Method to find LCM2
    public static int lcmFinder(int x, int y) {
        return (x * y) / gcdFinder(x, y);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("How many numbers: ");
            int a = input.nextInt();

            if (a < 2) {
                break;
            }

            gcdFinderPlus(a);
        }

        // Closing the scanner
        input.close();
    }
}
