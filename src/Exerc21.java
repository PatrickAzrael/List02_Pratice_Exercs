import java.util.Scanner;

public class Exerc21 {
    /*
     * Nome do Aluno: Patrick Azrael Silva Carvalho
     * RA: 722313052
     * Nome do Programa: Escreva um programa que, dado um número positivo digitado
     * pelo o usuário mostre a tabuada de todos os números de 1 até o
     * número digitado. (utilize for).
     * Data: 17/05/23
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número.");
        int num = leia.nextInt();
        leia.close();
        if (num >= 0) {
            for (int i = 1; i <= num;) {
                int result = num * i;
                System.out.printf("[%d]\n", result);
                i++;
            }
        } else {
            System.out.println("O número informado foi negativo, retorne novamente e informe outro número.");
        }
    }

}
