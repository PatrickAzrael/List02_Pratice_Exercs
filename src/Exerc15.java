public class Exerc15 {
    /*
     * Nome do Aluno: Patrick Azrael Silva Carvalho
     * RA: 722313052
     * Nome do Programa: Faça um programa que preencha com zeros todas as posições
     * de uma matriz com 10 linha e 10 colunas
     * até que ele digite um número menor que 0 (utilize while)
     * Data: 10/05/23
     */
    public static void main(String[] args) {
        int posicoes = 10;
        int matriz = 10;
        int m[][] = new int[posicoes][matriz];

        for (int i = 0; i <= posicoes; i++) {
            for (int j = 0; j < posicoes; j++) {
                System.out.print(m[i][j] + " ");
            }

        }
    }
}