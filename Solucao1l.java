public class Solucao1l {
  public static void main(String[] args) {
      int numero = 14;

      if (numero % 10 == 0) {
          System.out.println("Divisível por 10.");
      } else if (numero % 5 == 0) {
          System.out.println("Divisível por 5.");
      } else if (numero % 2 == 0) {
          System.out.println("Divisível por 2.");
      } else {
          System.out.println("Não é divisível por 10, 5 ou 2.");
      }
  }
}
