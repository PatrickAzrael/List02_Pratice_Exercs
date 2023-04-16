import java.util.Scanner;

/*
  * Nome do Aluno: Patrick Azrael Silva Carvalho
 * RA: 722313052
 * Nome do Programa: Faça um programa calcula o total de uma hospedagem em um
   hotel. Ele cobra R$ 60.00 a diária e mais uma taxa de serviço:
   R$ 5.50 por diária, se o número de diárias for maior que 15;
   R$ 6.00 por diária, se o número de diárias for igual a 15;
   R$ 8.00 por diária, se o número de diárias for menor que 15
  * Data: 16/04/23
  */
public class Exerc6 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe a quantidade de dias que você passou hospedado: ");
        int diashospedado = leia.nextInt();

        leia.close();

        int diaria = 60;
        double taxamaior15 = 5.50;
        double taxaigual15 = 6.00;
        double taxamenor = 8.00;

        double valortotal;

        if (diashospedado > 15) {
            valortotal = ((taxamaior15 * diashospedado) + diaria);
            System.out.printf("O valor total entre hospedagem e taxas de serviços foi de [R$ %f]", valortotal);
        } else if (diashospedado == 15) {
            valortotal = ((taxaigual15 * diashospedado) + diaria);
            System.out.printf("O valor total entre hospedagem e taxas de serviço foi de [R$ %f]", valortotal);
        } else if (diashospedado < 15) {
            valortotal = ((taxamenor * diashospedado) + diaria);
            System.out.printf("O valor total entre hospedagem e taxas de serviço foi de [R$ %f]", valortotal);
        }

    }
}
