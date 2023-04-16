import java.util.Scanner;

public class Exerc7 {
    /*
     * Nome do Aluno: Patrick Azrael Silva Carvalho
     * RA: 722313052
     * Nome do ProgramaCrie um programa que lê um número entre 1 e 12,
     * correspondendo
     * a um dos meses do ano onde o mês 1 é Janeiro e 12 é dezembro.
     * Ao final, o programa deve imprimir uma mensagem identificando,
     * com base no número digitado, o nome do mês e a estação.
     * Exemplo para o mês 1: "Mês: Janeiro – Estação: Verão"
     * Data: 16/04/23
     */
    public static void main(String[] args) {
        System.out.println("Digite um número [entre 1 e 12]: ");
        int num;
        Scanner leia = new Scanner(System.in);
        num = leia.nextInt();

        leia.close();

        String mes;
        String estacao;

        switch (num) {
            case 1:
                mes = "Janeiro";
                estacao = "Verão";
                System.out.printf("O mês informado foi [%s] e a estação é [%s].", mes, estacao);
                break;

            case 2:
                mes = "Fevereiro";
                estacao = "Verao";
                System.out.printf("O mês informado foi [%s] e a estação é [%s].", mes, estacao);
                break;

            case 3:
                mes = "Março";
                estacao = "Verão";
                System.out.printf("O mês informado foi [%s] e a estação é [%s] ", mes, estacao);
                break;

            case 4:
                mes = "Abril";
                estacao = "Outono";
                System.out.printf("O mês informado foi [%s] e a estação é [%s].", mes, estacao);
                break;

            case 5:
                mes = "Maio";
                estacao = "Outono";
                System.out.printf("O mês informado foi [%s] e a estação é [%s].", mes, estacao);
                break;

            case 6:
                mes = "Junho";
                estacao = "Inverno";
                System.out.printf("O mês informado foi [%s] e a estação é [%s].", mes, estacao);
                break;

            case 7:
                mes = "Julho";
                estacao = "Inverno";
                System.out.printf("O mês informado foi [%s] e a estação é [%s] ", mes, estacao);
                break;

            case 8:
                mes = "Agosto";
                estacao = "Inverno";
                System.out.printf("O mês informado foi [%s] e a estação é [%s].", mes, estacao);
                break;

            case 9:
                mes = "Setembro";
                estacao = "Primavera";
                System.out.printf("O mês informado foi [%s] e a estação é [%s] ", mes, estacao);
                break;

            case 10:
                mes = "Outubro";
                estacao = "Primavera";
                System.out.printf("O mês informado foi [%s] e a estação é [%s].", mes, estacao);
                break;

            case 11:
                mes = "Novembro";
                estacao = "Primavera";
                System.out.printf("O mês informado foi [%s] e a estação é [%s] ", mes, estacao);
                break;

            case 12:
                mes = "Dezembro";
                estacao = "Verão";
                System.out.printf("O mês informado foi [%s] e a estação é [%s].", mes, estacao);
                break;
            default:
                System.out.printf("O [%d] informado foi errado, tente novamente!", num);
        }

    }
}
