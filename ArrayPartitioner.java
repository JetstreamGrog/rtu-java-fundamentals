import java.util.Scanner;

public class ArrayPartitioner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m[] = new int[10];
        int K;
            System.out.print("Enter m[i] elements: ");
        for (int i = 0; i < 10; i++) {
            m[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        K = sc.nextInt();

        int result[] = new int[10];
        int left = 0;
        int right = 9;

        for (int i = 0; i < 10; i++) {
            if (m[i] < K) {
                result[left] = m[i];
                left++;
            } else {
                result[right] = m[i];
                right--;
            }
        }
        System.out.println(java.util.Arrays.toString(result));
    }

}