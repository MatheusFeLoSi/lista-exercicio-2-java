import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double A, B, C;   
        
        System.out.println("Digite o valor de A ");
            A = scanner.nextDouble();
        
        System.out.println("Digite o valor de B ");
            B = scanner.nextDouble();
        
        System.out.println("Digite o valor de C ");
            C = scanner.nextDouble();
        
        if (A==0) {
            if (B==0) {
                if (C!=0) {
                    System.out.println("Coeficientes informados incorretamente.");
                }
            }
        }

        if (A==0) {
            if (B!=0) {
                if (C!=0) {
                    System.out.println("Essa é uma equação de primeiro grau.");

                    double EQ1 = B/C;
                    System.out.println("O valor da raiz real da equação é " + EQ1 + ".");
                }
            }
        }

        double delta = Math.pow(B, 2) - 4 * A * C;

        if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais.");
        }

        if (delta==0) {
            double ResuDelta = B/(2 * A);
            System.out.println("Esta equação possui duas raízes reais iguais no valor de " + ResuDelta);
        }

        if (delta > 0) {
            double x1 = ( B + (delta)) / (2 * A);
            double x2 = (-B - (delta)) / (2 * A);
            System.out.println("Esta equação possui duas raízes reais diferentes no valor de " + x1 + " e " + x2 + "." );
        }

        scanner.close();
    }
}
