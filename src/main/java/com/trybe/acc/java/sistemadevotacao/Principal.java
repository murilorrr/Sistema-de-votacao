package com.trybe.acc.java.sistemadevotacao;

import java.util.Scanner;

public class Principal {

  static Scanner scanner = new Scanner(System.in);
  /**
   * Metodo principal que vai executar a partir do inicio do sistema.
   * @param args its this, args.
   */
  public static void main(String[] args) {

    GerenciamentoVotacao votacao = new GerenciamentoVotacao();

    cadastrarCandidatos(votacao);

    cadastrarEleitores(votacao);

    iniciarVotacao(votacao);
  }

  /**
   * Metodo abrir o terminal com opção de criar pessoas Candidatas.
   * @param scanner instancia do Scanner aberto
   * @author Murilo
   */
  private static short openMenuforPessoaCandidata(Scanner scanner) {
    System.out.println("Cadastrar pessoa candidata?");
    String entrySystemString =
    "1 - Sim\n2 - Não";
    System.out.println(entrySystemString);
    System.out.println("Entre com o número correspondente à opção desejada:");
    
    short inputNumber = 0;
    inputNumber = scanner.nextShort();

    return inputNumber;
  }

  /**
   * Metodo abrir o terminal com opção de criar pessoas Eleitoras.
   * @param scanner instancia do Scanner aberto
   * @author Murilo
   */
  private static short openMenuforPessoaEleitora(Scanner scanner) {
    System.out.println("Cadastrar pessoa eleitora?");
    String entrySystemString =
    "1 - Sim\n2 - Não";
    System.out.println(entrySystemString);
    System.out.println("Entre com o número correspondente à opção desejada:");
    
    short inputNumber = 0;
    inputNumber = scanner.nextShort();

    return inputNumber;
  }

  /**
   * Metodo abrir o terminal com opção de votação ou ver resultados.
   * @param scanner instancia do Scanner aberto
   * @author Murilo
   */
  private static short openMenuforVotation(Scanner scanner) {
    System.out.println("Entre com o número correspondente à opção desejada:");
    String entrySystemString =
    "1 - Votar\n2 - Resultado Parcial\n3 - Finalizar Votação";
    System.out.println(entrySystemString);
    
    short inputNumber = 0;
    inputNumber = scanner.nextShort();

    return inputNumber;
  }

  /**
   * Metodo para cadastrar pessoas Candidatas.
   * @param votacao instancia da votação atual
   * @author Murilo
   */
  private static void cadastrarCandidatos(GerenciamentoVotacao votacao) {
    short input = 1;
    while (input == 1) {
      input = openMenuforPessoaCandidata(scanner);
      if (input == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nome = scanner.next();
        System.out.println("Entre com o número da pessoa candidata:");
        short numeroCandidato = scanner.nextShort();
        votacao.cadastrarPessoaCandidata(nome, numeroCandidato);
      }
    }
  }

  /**
   * Metodo para cadastrar pessoas Eleitoras.
   * @param votacao instancia da votação atual
   * @author Murilo
   */
  private static void cadastrarEleitores(GerenciamentoVotacao votacao) {
    short input = 1;
    while (input == 1) {
      input = openMenuforPessoaEleitora(scanner);
      if (input == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nome = scanner.next();
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpfEleitor = scanner.next();
        votacao.cadastrarPessoaEleitora(nome, cpfEleitor);
      }
    }
  }

  /**
   * Metodo para inciar votacao. Dentre realmente votar ou ver os resultados.
   * @param votacao instancia da votação atual
   * @author Murilo
   */
  private static void iniciarVotacao(GerenciamentoVotacao votacao) {
    short input = 0;
    while (input != 3) {
      input = openMenuforVotation(scanner);
      if (input == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpfNumber = scanner.next();
        System.out.println("Entre com o número da pessoa candidata:");
        int numeroPessoaCandidata = scanner.nextInt();
        votacao.votar(cpfNumber, numeroPessoaCandidata);
      } else {
        // mostrar resultado parcial
      }
    }
  }

}
