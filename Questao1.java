import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        Double A, B, C;
        Double media;

        System.out.println("Digite o primeiro número ");
            A = scanner.nextDouble();

        System.out.println("Digite o segundo número ");
            B = scanner.nextDouble();

        System.out.println("Digite o terceiro número ");
            C = scanner.nextDouble();

            double maior = A;
            double menor = A;

        if (B > maior) {
            maior = B;
        }

        if (C > maior) {
            maior = C;
        }
        
        if (B < menor) {
            menor = B;
        }

        if (C < menor) {
            menor = C;
        }

        media = (A + B + C)/3;

        System.out.println("O maior número digitado é " + maior);
        
        System.out.println("O menor número digitado é " + menor);

        System.out.println("A média aritmética entre " + A + " , " + B + " e " + C + " é " + media);

        scanner.close();
    }
}
