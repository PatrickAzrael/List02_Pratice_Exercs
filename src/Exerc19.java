import java.util.Scanner;

public class Exerc19 {
    /*
     * Nome do Aluno: Patrick Azrael Silva Carvalho
     * RA: 722313052
     * Nome do Programa: Um determinado gás duplica seu volume a cada segundo. Dada
     * um
     * volume inicial, em centímetros cúbicos, digitado pelo usuário
     * faça um programa que determine o tempo necessário para que
     * esse volume se torne maior que 1000 centímetros cúbicos.
     * (utilize while)
     * Data: 10/05/23
     */
    public static void main(String[] args) {
        System.out.println("Informe a quantidade de cm³ inicial: ");
        Scanner leia = new Scanner(System.in);
        int centimetros = leia.nextInt();
        int i = 0;
        leia.close();
        while (centimetros <= 1000) {
            centimetros = centimetros * 2;
            i++;
        }
        System.out.printf("O tempo necessário são [%d] segundos para ultrapassar os 1000 cm³", i);

    }
}
