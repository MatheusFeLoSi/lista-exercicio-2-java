import java.util.Scanner;
import java.util.Random;

public class Questao6 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int Num1, Num2;
        int NumAleatorio;
        
        System.out.println("Digite o primeiro número: ");
        Num1 = scanner.nextInt(); 
        
        System.out.println("Digite o segundo número: ");
        Num2 = scanner.nextInt();

        System.out.println("Um número aleátorio está sendo gerado...");
        NumAleatorio = random.nextInt(999);

        if (NumAleatorio % 2 == 0) {
            System.out.println("O número gerado é " + NumAleatorio + " e ele é par");   
        }
        else {
            System.out.println("O número gerado é " + NumAleatorio + " e ele é ímpar");
        }
        
    
        //Verificando qual é maior.
        
        if (Num1>Num2 && Num1>NumAleatorio) {
            System.out.println("O maior número é " + Num1); 
        }
        else if (Num2>Num1 && Num2>NumAleatorio) {
            System.out.println("O maior número é " + Num2);
        }
        else {
            System.out.println("O maior número é " + NumAleatorio);
        }


            //Verificando qual é menor. 
            if (Num1<Num2 && Num1<NumAleatorio) {
                System.out.println("O menor número é " + Num1); 
            }
            else if (Num2<Num1 && Num2<NumAleatorio) {
                System.out.println("O menor número é " + Num2);
            }
            else 
                System.out.println("O menor número é " + NumAleatorio);
 
        scanner.close();
    }
}
