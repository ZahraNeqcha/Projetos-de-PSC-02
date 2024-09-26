public class Solucao1o {
  public static void main(String[] args) {
      int anoNascimento = 1995;
      int anoAtual = 2024;

      if (anoNascimento > anoAtual) {
          System.out.println("Ano de nascimento inválido.");
      } else {
          int idade = anoAtual - anoNascimento;
          System.out.println("A idade da pessoa é: " + idade);
      }
  }
}