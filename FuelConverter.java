import java.util.Scanner;

class FuelConverter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double litersPer100km;
    double milesPerGallon;

    System.out.print("liters-per-100km: ");
    litersPer100km = sc.nextDouble();
    sc.close();
    
    milesPerGallon = 0;
    
    System.out.printf("miles-per-gallon: %.2f", milesPerGallon);
  }
}
