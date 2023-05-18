
import java.util.Scanner;

/* Nome do Aluno: Patrick Azrael Silva Carvalho
* RA: 722313052
* Nome do Programa: Elabore um programa que lê dois valores A e B e os escreve com
a mensagem: “São múltiplos” ou “Não são múltiplos”.
* Data: Data: 10/05/23
*/
public class Exerc3 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = leia.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = leia.nextInt();
        leia.close();

        if (num1 % num2 == 0) {
            System.out.printf("Os números [%d] e [%d] são múltiplos", num1, num2);
        } else {
            System.out.printf("Os números [%d] e [%d] não são múltiplos", num1, num2);
        }

    }
}
