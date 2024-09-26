public class Solucao1t {
  public static void main(String[] args) {
      int a = 4;
      int b = 16;

      int menor = (a < b) ? a : b;
      int maior = (a > b) ? a : b;

      System.out.println("Quadrado do menor: " + (menor * menor));
      System.out.println("Raiz quadrada do maior: " + Math.sqrt(maior));
  }
}

