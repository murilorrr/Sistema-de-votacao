package com.trybe.acc.java.sistemadevotacao;

import java.io.InputStream;
import java.util.Scanner;

public class Principal {

  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    GerenciamentoVotacao votacao = new GerenciamentoVotacao();

    openMenuWithScanner(scanner);
    votacao.cadastrarPessoaCandidata();

  }






  private static short openMenuWithScanner(Scanner scanner) {
    short inputNumber = 0;
    System.out.println("Cadastrar pessoa candidata?");
    String entrySystemString =
        "1 - Sim\n2 - Não";
    System.out.println(entrySystemString);
    System.out.println("Entre com o número correspondente à opção desejada:");

    if (scanner.hasNextShort()) {
      inputNumber = scanner.nextShort();
    }
    return inputNumber;
  }

}
