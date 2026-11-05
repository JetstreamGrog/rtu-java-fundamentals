import java.util.Scanner;

class Main {
    public static void TriangleClassifier (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if (a == b && b == c) {
                System.out.println("equilateral triangle");
            } else if (a == b || b == c || c == a) {
                System.out.println("isosceles triangle");
            } else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("right-angled triangle");
            } else {
                System.out.println("scalene");
            }

        } else {
            System.out.println("Does not exist");
        }
            sc.close();
    }
}