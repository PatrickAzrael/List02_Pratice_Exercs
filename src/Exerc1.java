
import java.util.Scanner;

public class Exerc1 {
    /*
     * Nome do Aluno: Patrick Azrael Silva Carvalho
     * RA: 722313052
     * Nome do Programa: Faça um Programa que peça dois números e imprima o maior
     * deles.
     * Data: 16/04/23
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num1;
        num1 = leia.nextInt();

        System.out.println("Informe outro número: ");
        int num2;
        num2 = leia.nextInt();
        leia.close();
        if (num1 > num2) {
            System.out.printf("O maior número informadoo foi [%d]", num1);
        } else {
            System.out.printf("O maior número informado foi [%d]", num2);
        }

    }
}