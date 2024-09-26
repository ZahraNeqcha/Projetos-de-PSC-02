public class Solucao1d {
  public static void main(String[] args) {
      int num1 = 3, num2 = 1, num3 = 2;
      int menor, medio, maior;

      if (num1 < num2 && num1 < num3) {
          menor = num1;
          if (num2 < num3) {
              medio = num2;
              maior = num3;
          } else {
              medio = num3;
              maior = num2;
          }
      } else if (num2 < num1 && num2 < num3) {
          menor = num2;
          if (num1 < num3) {
              medio = num1;
              maior = num3;
          } else {
              medio = num3;
              maior = num1;
          }
      } else {
          menor = num3;
          if (num1 < num2) {
              medio = num1;
              maior = num2;
          } else {
              medio = num2;
              maior = num1;
          }
      }

      System.out.println("Ordem crescente: " + menor + ", " + medio + ", " + maior);
  }
}
