
import java.util.Scanner;
/*
        * Nome do Aluno: Patrick Azrael Silva Carvalho
        * RA: 722313052
        * Nome do Programa: Faça um programa que leia um número inteiro e mostre uma
        mensagem indicando se este número é par ou ímpar e se é
        positivo ou negativo.
        * Data: 16/04/23
        */

public class Exerc3 {

    public static void main(String[] args) {
        System.out.println("Informe um número: ");
        int num;
        Scanner leia = new Scanner(System.in);
        num = leia.nextInt();
        boolean par;
        par = (num % 2 == 0);
        boolean impar;
        impar = (num % 2 == 1);
        leia.close();
        if (par && num > 0) {
            System.out.println("O número é par e positivo");
        } else if (impar && num > 0) {
            System.out.println("O número e ímpar e positivo");
        } else if (par && num < 0) {
            System.out.println("O número é par e negativo");
        } else {
            if (impar && num < 0) {
                System.out.println("O número informado é impar e negativo");
            }
        }
    }
}