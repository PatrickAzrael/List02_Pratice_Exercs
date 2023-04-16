import java.util.Scanner;

/*
  * Nome do Aluno: Patrick Azrael Silva Carvalho
 * RA: 722313052
 * Nome do Programa: Faça um programa para imprimir o conceito de um aluno. O
   conceito é calculado em função da nota do aluno que varia de 0
   a 100. As faixas da correlação são mostradas abaixo:
    Nota Conceito
   0 a 49 Insuficiente
   50 a 64 Regular
   65 a 84 Bom
   85 100 Ótimo
  * Data: 16/04/23
  */
public class Exerc5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        int nota1 = leia.nextInt();

        System.out.println("Informe a segunda nota: ");
        int nota2 = leia.nextInt();

        int media = (nota1 + nota2) / 2;

        leia.close();

        if (media >= 0 && media <= 49) {
            System.out.printf("Sua nota foi insuficiente [%d]", media);
        } else if (media >= 50 && media <= 64) {
            System.out.printf("Sua nota foi Regular [%d]", media);
        } else if (media >= 65 && media <= 84) {
            System.out.printf("Sua nota foi Boa [%d]", media);
        } else {
            System.out.printf("Sua media foi ótima [%d]", media);
        }
    }
}
