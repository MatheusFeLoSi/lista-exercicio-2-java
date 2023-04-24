import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double compra;
        double pago;
        double troco;
        int nota50, nota20, nota10, nota5, nota2, nota1; 

        System.out.println("Qual o valor da compra em reais: ");
            compra = scanner.nextDouble();
        
        System.out.println("Qual o valor pago em reais ");
            pago = scanner.nextDouble();
            troco = pago - compra;
        
            if (pago < compra) {
                System.out.println("A quantia paga é insuficiente para realizar a compra.");
            }
            
            else {
                
                System.out.println("O troco será de R$ " + troco);
                
                nota50 = (int) (troco / 50);
                    troco %= 50;

                nota20 = (int) (troco / 20);
                    troco %= 20;

                nota10 = (int) (troco / 10);
                    troco %= 10;

                nota5 = (int) (troco / 5);
                    troco %= 5;

                nota2 = (int) (troco / 2);
                    troco %= 2;

                nota1 = (int) troco;
            
                System.out.println("Quantiade de notas de 50: " + nota50);
               
                System.out.println("Quantiade de notas de 20: " + nota20);
                
                System.out.println("Quantiade de notas de 10: " + nota10);
                
                System.out.println("Quantiade de notas de 5: " + nota5);
                
                System.out.println("Quantiade de notas de 2: " + nota2);
                
                System.out.println("Quantiade de notas de 1: " + nota1);
            }          
     scanner.close(); 
    }   
}
