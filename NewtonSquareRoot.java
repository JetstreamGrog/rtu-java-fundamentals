import java.util.Scanner;

public class NewtonSquareRoot {
    public static double guess(double x, double guess){
    if ((Math.abs(guess - x/guess) > 0.0001)){
        double newGuess = (guess + x / guess) / 2.0;
        return guess(x, newGuess);
    }
        return guess;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, guess;
        x = sc.nextDouble();
        double startGuess = x / 2.0;
        double rez = guess(x, startGuess);
        System.out.println(rez);
    }

}
