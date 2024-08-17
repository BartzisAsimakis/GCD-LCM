import java.util.Scanner;

public class gcdLcmPro {
    public static int gcdFinder(int x, int y) {
        if (x % y == 0) {
            return y;
        }

        return gcdFinder(y, x % y);
    }

    public static void gcdFinderPlus(int many) {
        Scanner input = new Scanner(System.in);
        int i;

        System.out.print("Number 1: ");
        int num1 = input.nextInt();

        int gcdTmp = num1;
        int lcm = num1;

        for (i = 1; i < many; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int num2 = input.nextInt();

            gcdTmp = gcdFinder(gcdTmp, num2);
            lcm = lcm * num2 / gcdFinder(gcdTmp, num2);

        }

        System.out.println("=================================");
        System.out.println("GCD = " + gcdTmp + '\n' + "LCM = " + lcm);
        System.out.println("=================================" + '\n');
    }

    public static int lcmFinder(int x, int y) {
        return x * y / gcdFinder(x, y);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;

        do {
            System.out.print("How many numbers: ");
            a = input.nextInt();

            if (a < 2) {
                break;
            }

            gcdFinderPlus(a);

        } while (a >= 0);
    }
}
