import java.util.Scanner;

class AverageSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        double s=0, count = 0;

        while (true) {
            System.out.print("x = ");
            x = sc.nextInt();
                if (x == 0){
                    break;
                }
                if (x > 0) {
                    s = s + x;
                    count = count + 1;
                }

        }
        if (count > 0) {
            System.out.println("" + s / count);
        } else {
            System.out.println("0.0");
        }
    }

}