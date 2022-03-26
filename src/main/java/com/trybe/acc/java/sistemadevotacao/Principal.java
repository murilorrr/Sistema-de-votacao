package com.trybe.acc.java.sistemadevotacao;

// import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    GerenciamentoVotacao votacao = new GerenciamentoVotacao();

    short input = 1;
    while (input == 1) {
      input = openMenuWithScanner(scanner);
      if (input == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nome = scanner.next();
        System.out.println("Entre com o número da pessoa candidata:");
        short numeroCandidato = scanner.nextShort();
        votacao.cadastrarPessoaCandidata(nome, numeroCandidato);
      //   ArrayList<Pessoa> pessoas = votacao.getList();
      //   for (Pessoa pessoa : pessoas) {
      //     System.out.println(pessoa.name);
      // }
      }
    }


  }






  private static short openMenuWithScanner(Scanner scanner) {
    short inputNumber = 0;
    System.out.println("Cadastrar pessoa candidata?");
    String entrySystemString =
        "1 - Sim\n2 - Não";
    System.out.println(entrySystemString);
    System.out.println("Entre com o número correspondente à opção desejada:");

    inputNumber = scanner.nextShort();

    return inputNumber;
  }

}
