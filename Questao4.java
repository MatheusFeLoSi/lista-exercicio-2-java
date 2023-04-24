import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valorOperacao; 
        double R, Rresu;
        String mensagem = " 1: calcular e imprimir o perímetro do círculo.\n 2: calcular e imprimir a área do círculo.\n 3: calcular e imprimir o volume da esfera.";
        
        System.out.println(mensagem);
        
        System.out.println("Digite o indicador de operação: ");
        valorOperacao = scanner.nextInt(); 

        System.out.println("Digite o raio do círculo/esfera: ");
        R = scanner.nextDouble(); 

        switch (valorOperacao) { 
            case 1: 
                System.out.println("A operação escolhida foi 'calcular e imprimir o perímetro do círculo' "); 

                Rresu = (2 * Math.PI * R); 
                DecimalFormat format = new DecimalFormat("#.00");
                String resultadoFormatado = format.format(Rresu);

                System.out.println("O perímetro do círculo em Cm é de " + resultadoFormatado);
                break;
            
            case 2: 
                System.out.println("A operação escolhida foi 'calcular e imprimir a área do círculo.' ");
                
                Rresu = (Math.PI * Math.pow(R, 2));
                DecimalFormat format1 = new DecimalFormat("#.00");
                String resultadoFormatado1 = format1.format(Rresu);

                System.out.println("A aréa do círculo em Cm é de " + resultadoFormatado1);
                break;
            
            case 3: 
                System.out.println("A operação escolhida foi 'calcular e imprimir o volume da esfera.' ");

                Rresu = (4.0/3.0) * Math.PI * Math.pow(R,3 );
                DecimalFormat format2 = new DecimalFormat("#.00");
                String resultadoFormatado2 = format2.format(Rresu);

                System.out.println("O volume do círculo em Cm é de " + resultadoFormatado2);
                break; 

            default : 
                System.out.println("Erro! O codígo da operação é invalido. Digite um número entre 1 e 3.");           
        }
        
        scanner.close();
    }
}
