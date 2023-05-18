import java.util.Scanner;

/*
  * Nome do Aluno: Patrick Azrael Silva Carvalho
 * RA: 722313052
 * Nome do Programa: Faça um programa que leia o nome, o sobrenome, a idade, em
     anos, e a naturalidade (cidade de nascimento) de uma pessoa.
     Depois, o programa deve dar a seguinte opção “Deseja
     visualizar dados completos?”. Se o caractere digitado pelo
     usuário for ‘S’ o programa deve imprimir na tela Nome,
     Sobrenome, idade e naturalidade. Se o caractere digitado pelo
     usuário for ‘N’ o programa deve imprimir o Nome e a idade. Se
     o caractere não for nenhuma das outras opções acima o programa
     deve imprimir “Digitação errada. Tente Novamente”.
  * Data: 16/04/23
  */
public class Exerc5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = leia.nextLine();

        System.out.println("Escreva seu sobrenome: ");
        String sobrenome = leia.nextLine();

        System.out.println("Informe a sua naturalidade(Cidade em que nasceu): ");
        String cidade = leia.nextLine();

        System.out.println("Informe a sua idade: ");
        int idade = leia.nextInt();

        System.out.println("Você deseja visualizar os dados informados completamente? S ou N?");
        char confirmacao = leia.next().charAt(0);

        leia.close();

        if (confirmacao == 'S') {
            System.out.printf("O nome informado foi [%s].", nome);
            System.out.println(" ");
            System.out.printf("O sobrenome informado foi [%s].", sobrenome);
            System.out.println(" ");
            System.out.printf("A idade informada foi [%d].", idade);
            System.out.println(" ");
            System.out.printf("A sua naturalidade é [%s].", cidade);
        } else if (confirmacao == 'N') {
            System.out.printf("O nome informado foi [%s].", nome);
            System.out.println(" ");
            System.out.printf("A idade informada foi [%d].", idade);
        } else {
            System.out.printf("Digitação errada, tente novamente!");
        }

    }
}
