import java.util.Scanner;

public class Exerc18 {
    /*
     * Nome do Aluno: Patrick Azrael Silva Carvalho
     * RA: 722313052
     * Nome do Programa: Faça um programa que determine o fatorial de um número.
     * Para
     * este problema, tem-se como entrada o valor do número do qual
     * se deseja calcular o fatorial. O fatorial de 0 é igual a 1. O
     * fatorial de um número N (N!) é definido conforme a seguir
     * (utilize for):
     * i. N! = 1 * 2 * 3 * 4 * ... * (N-1) * N
     * Data: 10/05/23
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe um número");
        double num = leia.nextDouble();
        leia.close();
        double i;

        double ftr = 1;

        for (i = 1; i <= num; i = i + 1) {
            ftr = ftr * i;
        }
        System.out.println(ftr);
    }

}
