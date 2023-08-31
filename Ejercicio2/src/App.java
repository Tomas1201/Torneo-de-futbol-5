import java.util.Scanner;

public class App {
  public static boolean esMultiplo(int n1, int n2) {
    if (n1 % n2 == 0) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("Ingrese el primer número: ");
    int num1 = Sc.nextInt();
    System.out.println("Ingrese el segundo número: ");
    int num2 = Sc.nextInt();
    if (esMultiplo(num1, num2) || esMultiplo(num2, num1)) {
      System.out.println("Uno de los números es múltiplo del otro.");
    } else {
      System.out.println("Ninguno de los números es múltiplo del otro.");
    }
    Sc.close();
  }
}