public class Solucao1v {
  public static void main(String[] args) {
      int a = 5;
      int b = 30;
      int c = 25;

      int maior = a;
      if (b > maior) {
          maior = b;
      }
      if (c > maior) {
          maior = c;
      }

      System.out.println("O maior número é: " + maior); // Imprime o maior número
  }
}

