
/* Nome do Aluno: Patrick Azrael Silva Carvalho
* RA: 722313052
* Nome do Programa: Faça um programa que imprima todos os números pares de 1
a 100
* Data: 10/05/23
*/
public class Exerc10 {
    public static void main(String[] args) {
        int i = 0;

        do {
            i = i + 2;
            System.out.println(i);
            if (i == 100) {
                break;
            }
        } while (i <= 100);

    }

}
