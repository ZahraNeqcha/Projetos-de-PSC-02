public class Solucao1g {
  public static void main(String[] args) {
      String nome = "Zahra";
      char sexo = 'F';
      int idade = 18;

      if (sexo == 'F' || sexo == 'f') {
          if (idade < 25) {
              System.out.println(nome + ": ACEITA");
          } else {
              System.out.println(nome + ": NÃO ACEITA");
          }
      } else {
          System.out.println(nome + ": NÃO ACEITA");
      }
  }
}

