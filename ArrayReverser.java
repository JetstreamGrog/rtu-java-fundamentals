import java.util.Scanner;
import java.util.Random;

public class ArrayReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A[] = new float[40];
        int k = sc.nextInt();
        Random r = new Random();

        for (int i = 0; i < 40; i++) {
            if (k <= 0){
                A[i] = r.nextFloat()*200-100;
            } else {
                A[i] = (i+1.0f)*k/(k+1.0f);
            }
        }
        for (int i = 0; i < 20; i++) {
            System.out.printf("%.1f   ", A[i]);
        }
        System.out.println();
        for (int i = 20; i < 40; i++) {
            System.out.printf("%.1f   ", A[i]);
        }


        float temp;
        for (int i = 0; i < 20; i++) {
            temp = A[i];
            A[i] = A[39 - i];
            A[39-i] = temp;
        }

        System.out.println("\nReversed array:");
        for (int i = 0; i < 20; i++) {
            System.out.printf("%.1f ", A[i]);
        }
        System.out.println();
        for (int i = 20; i < 40; i++) {
            System.out.printf("%.1f ", A[i]);
        }
        System.out.println();
    }

}