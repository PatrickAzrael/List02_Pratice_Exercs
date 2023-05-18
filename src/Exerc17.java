public class Exerc17 {
  /*
   * Nome do Aluno: Patrick Azrael Silva Carvalho
   * RA: 722313052
   * Nome do Programa: Faça um programa que imprima os múltiplos negativos de 7,
   * superiores a -1000. (utilize do / while)
   * até que ele digite um número menor que 0 (utilize while)
   * Data: 17/05/23
   */
  public static void main(String[] args) {
    int i = -7;
    while (i >= -1000) {
      if (i % 7 == 0) {
        System.out.printf("%d", i);
      }
      i = i - 7;
    }
  }
}
