public class Solucao1k {
  public static void main(String[] args) {
      int numero = 21;

      if (numero % 3 == 0 && numero % 7 == 0) {
          System.out.println("O número é divisível por 3 e 7.");
      } else {
          System.out.println("O número não é divisível por 3 e 7.");
      }
  }
}