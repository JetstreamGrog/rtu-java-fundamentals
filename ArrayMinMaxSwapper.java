import java.util.Scanner;

public class ArrayMinMaxSwapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m[] = new int[10];
        int maxIndex = 0;
        int minIndex = 0;
        int temp = 0;

            for (int i = 0; i < 10; i++){
                m[i] = sc.nextInt();

                if (m[i] > m[maxIndex]) {
                    maxIndex = i;
                }
                if (m[i] < m[minIndex]) {
                    minIndex = i;
                }
            }

            temp = m[maxIndex];
            m[maxIndex] = m[minIndex];
            m[minIndex] = temp;

        System.out.println(java.util.Arrays.toString(m));
        sc.close();
    }

}