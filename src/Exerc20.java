
import java.util.Scanner;

public class Exerc20 {
    /*
     * Nome do Aluno: Patrick Azrael Silva Carvalho
     * RA: 722313052
     * Nome do Programa: Escreva um programa que, dada a carga máxima de um
     * elevador e a quantidade máxima de pessoas digitadas pelo
     * usuário, leia o peso de cada pessoa, também digitada pelo
     * usuário, que entra no elevador até que a carga máxima seja
     * atingida ou o número máximo de pessoas seja atingido (utilize
     * do /while).
     * um vetor de tamanho 50
     * Data: 10/05/23
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a carga máxima suportada pelo elevador: ");
        int maxcarga = leia.nextInt();

        System.out.println("Digite a quantidade máxima de pessoas suportada pelo elevador: ");
        int maxpessoas = leia.nextInt();

        int over = entradadepessoas(leia, maxpessoas);
        double soma = Pegapesos(leia, over);

        Limites(maxcarga, maxpessoas, soma, over);

        leia.close();
    }

    private static void Limites(int maxcarga, int maxpessoas, double soma, int over) {
        if (soma > maxcarga) {
            System.out.println("Já foi antigido o limite de peso suportado pelo elevador.");
        } else if (over > maxpessoas) {
            System.out.println("Já foi atingido o limite de pessoas suportada pelo elevador.");
        } else {
            System.out.println("Ainda não foi atingido nenhum limite.");
        }
    }

    private static int entradadepessoas(Scanner leia, int maxpessoas) {
        int rover;

        do {
            System.out.println("Informe a quantidade de pessoas que entrou no elevador: ");
            rover = leia.nextInt();
        } while (rover >= maxpessoas);
        return rover;
    }

    private static double Pegapesos(Scanner leia, int over) {
        int i = 0;
        double ppa = 0;
        double pesos[] = new double[over];
        double somas = 0;

        do {
            System.out.printf("Digite o peso da [%d°] pessoa: ", i + 1);
            ppa = leia.nextFloat();
            pesos[i] = ppa;
            i = i + 1;
        } while (i < over);

        i = 0;
        do {
            somas += pesos[i];
            i++;
        } while (i < pesos.length);

        return somas;
    }

}