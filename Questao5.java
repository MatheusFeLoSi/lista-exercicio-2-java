import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double Num1, Num2, resultado;
        String operacao; 

        System.out.println("Digite o primeiro número: ");
        Num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        Num2 = scanner.nextDouble(); 

        System.out.println("Digite o símbolo de operação ( +, -, *, / e ^): ");
        operacao = scanner.next();

        switch (operacao) {
            case "+": 
                resultado = Num1 + Num2; 
                System.out.println("O resultado dessa operação de adição é: " + resultado);
                break;
            
                case "-":
                resultado = Num1 - Num2;
                System.out.println("O resultado dessa operação de subtração é: " + resultado);
                break;

            case "*":
                resultado = Num1 * Num2;
                System.out.println("O resultado dessa operação de multiplicação é: " + resultado);
                break;

            case "/":
                resultado = Num1 / Num2;
                System.out.println("O resultado dessa operação de divisão é: " + resultado);
                break;

            case "^":
                resultado = Math.pow(Num1, Num2);
                System.out.println("O resultado dessa operação de exponenciação é: " + resultado);
                break;

            default :
                System.out.println("O símbolo da operação é inválido.");
        } 
        
        scanner.close();
    }   
}
