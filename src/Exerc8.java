import java.util.Scanner;

public class Exerc8 {
    /*
     * Nome do Aluno: Patrick Azrael Silva Carvalho
     * RA: 722313052
     * Nome do Programa: Faça um programa que receba o valor da venda, escolha a
     * condição de pagamento no menu e mostre o total da venda final
     * conforme condições a seguir:
     * Venda a Vista - desconto de 10%
     * Venda a Prazo 30 dias - desconto de 5%
     * Venda a Prazo 60 dias - mesmo preço
     * Venda a Prazo 90 dias - acréscimo de 5%
     * Venda com cartão de débito - desconto de 8%
     * Venda com cartão de crédito - desconto de 7%
     * Data: 16/04/23
     */
    public static void main(String[] args) {
        System.out.println("Digite o valor da venda: ");
        Scanner leia = new Scanner(System.in);
        double valorvenda = leia.nextDouble();

        double valordesconto;
        double valortotal;
        int vendaforma;
        int prazo = 0;
        System.out.println(
                "Qual o método de pagamento? a vista, a prazo ,cartão de crédito ou cartão de débito? (Informe 1, 2, 3 ou 4 para o método de pagamento respectivamente.)");
        vendaforma = leia.nextInt();

        switch (vendaforma) {
            case 1:
                if (vendaforma == 1) {
                    valordesconto = valorvenda * 0.1;
                    valortotal = valorvenda - valordesconto;
                    System.out.println(
                            "O valor total da venda é [" + valorvenda
                                    + "], mas com o desconto de 10% para pagamento a vista fica de [" + valortotal
                                    + "]");
                }
                break;
            case 2:
                System.out.print(
                        "Deseja o prazo de 30 dias, 60 dias ou 90 dias? (Digite 1, 2 ou 3 para os dias respectivamente)");
                prazo = leia.nextInt();
                if (prazo == 1) {
                    valordesconto = valorvenda * 0.05;
                    valortotal = valorvenda - valordesconto;
                    System.out.printf("O valor com o desconto já aplicado ficou de [R$ %f]", valortotal);
                } else if (prazo == 2) {
                    valortotal = valorvenda;
                    System.out.printf("O valor com o desconto já aplicado ficou de [R$ %f]", valortotal);
                } else if (prazo == 3) {
                    valordesconto = valorvenda * 0.05;
                    valortotal = valorvenda + valordesconto;
                    System.out.printf("O valor com o acréscimo já aplicado ficou de [R$ %f]", valortotal);
                }
                break;
            case 3:

                if (vendaforma == 3) {
                    valordesconto = valorvenda * 0.07;
                    valortotal = valorvenda - valordesconto;
                    System.out.printf("O valor com o desconto já aplicado ficou de [R$ %f]", valortotal);
                }
                break;
            case 4:
                valordesconto = valorvenda * 0.08;
                valortotal = valorvenda - valordesconto;
                System.out.printf("O valor com o desconto já aplicado ficou de [R$ %f]", valortotal);
                break;
        }

        leia.close();

    }
}
