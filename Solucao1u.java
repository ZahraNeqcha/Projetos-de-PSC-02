public class Solucao1u {
  public static void main(String[] args) {
      int a = 10;
      int b = 20;
      int c = 15;

      int maior;

      if (a > b && a > c) {
          maior = a;
      } else if (b > c) {
          maior = b;
      } else {
          maior = c;
      }

      System.out.println("O maior número é: " + maior);
  }
}


