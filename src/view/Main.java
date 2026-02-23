import java.util.Scanner;
import controller.SomaRecursiva;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro valor natural: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo valor natural: ");
        int num2 = entrada.nextInt();

        if (num1 < 0 || num2 < 0) {
            System.out.println("Valores inválidos. Utilize apenas números naturais.");
        } else {

            // Criando objeto da classe
            SomaRecursiva calculadora = new SomaRecursiva();

            int total = calculadora.somar(num1, num2);

            System.out.println("Valor obtido na soma: " + total);
        }

        entrada.close();
    }
}