public class Solucao1w {
    public static void main(String[] args) {
        int a = 12;
        int b = 8;
        int c = 20;

        int maior, intermediario, menor;


        if (a > b && a > c) {
            maior = a;
            if (b > c) {
                intermediario = b;
                menor = c;
            } else {
                intermediario = c;
                menor = b;
            }
        } else if (b > c) {
            maior = b;
            if (a > c) {
                intermediario = a;
                menor = c;
            } else {
                intermediario = c;
                menor = a;
            }
        } else {
            maior = c;
            intermediario = a > b ? a : b;
            menor = a < b ? a : b;
        }

        System.out.println("Maior: " + maior + ", Intermediário: " + intermediario + ", Menor: " + menor);
    }
}

