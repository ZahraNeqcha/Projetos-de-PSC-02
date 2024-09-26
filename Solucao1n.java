public class Solucao1n {
  public static void main(String[] args) {
    int numero = 1234;

    int milhar = (numero / 1000) % 10;
    int centena = (numero / 100) % 10;
    int formado = milhar * 10 + centena;

    if (formado % 4 == 0) {
      System.out.println("O número formado é múltiplo de 4.");
    } else {
      System.out.println("O número formado não é múltiplo de 4.");
    }
  }
}