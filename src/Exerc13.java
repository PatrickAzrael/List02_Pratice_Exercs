
/* Nome do Aluno: Patrick Azrael Silva Carvalho
* RA: 722313052
* Nome do Programa: Faça um programa que some os números de 1 a 100 e imprima
somente o valor total da soma (utilize while).
* Data: 10/05/23
*/

public class Exerc13 {
    public static void main(String[] args) {
        int soma = 0;
        int num = 1;
        while (num <= 100) {
            soma = num + soma;
            num = num + 1;
        }
        System.out.printf("%d ", soma);
    }
}