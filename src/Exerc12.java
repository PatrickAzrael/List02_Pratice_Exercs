
/* Nome do Aluno: Patrick Azrael Silva Carvalho
* RA: 722313052
* Nome do Programa: Faça um programa que exiba todos os números pares a
partir de 0 até que encontre um múltiplo de 7 (utilize
do/while)
* Data: 10/05/23
*/
public class Exerc12 {
    public static void main(String[] args) {
        int i = 0;
        do {
            i = i + 2;
            if (i % 7 == 0) {
                System.out.println(i);
                break;
            }

        } while (i != 0);
    }
}
