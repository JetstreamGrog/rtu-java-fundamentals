import java.util.Scanner;

public class MathRangeSolver {

    public static void main(String[] args) {
        double x, dx, xg;
        Scanner sc = new Scanner(System.in);

        System.out.println("from: ");
        x = sc.nextDouble();

        System.out.println("to: ");
        xg = sc.nextDouble();

        System.out.println("step: ");
        dx = sc.nextDouble();

        while (x <= xg+dx/2) {
            if (x <= 1)
                System.out.println(x + " not defined");
            else
                System.out.println((x+1)*(x+1) + " " + Math.sqrt(x-1));
            x = x + dx;
        }
        sc.close();
    }
}
