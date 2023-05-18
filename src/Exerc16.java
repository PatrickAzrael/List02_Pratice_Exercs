import java.util.Scanner;

public class Exerc16 {
    /*
     * Nome do Aluno: Patrick Azrael Silva Carvalho
     * RA: 722313052
     * Nome do Programa: Faça um programa que solicite ao usuário que digite um
     * número
     * até que ele digite um número menor que 0 (utilize while)
     * Data: 10/05/23
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = leia.nextInt();
        leia.close();
        while (num >= 0) {
            System.out.println("Informe um número novamente: ");
            num = leia.nextInt();
            num++;
        }

    }
}
