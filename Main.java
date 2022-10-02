import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.print("Digite um numero inteiro: ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    System.out.println("O numero informado foi " + number);
    sc.close();
  }
}