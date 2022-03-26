package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

  private static PessoaEleitora userPessoa = null;
  static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    GerenciamentoVotacao votacao = new GerenciamentoVotacao();

    cadastrarCandidatos(votacao);

    cadastrarEleitores(votacao);

    short input = 0;
    while (input != 3) {
      input = openMenuforVotation(scanner);
      if (input == 0) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpfNumber = scanner.next();
        ArrayList<PessoaEleitora> eleitores = votacao.getListEleitoras();
        for (PessoaEleitora eleitor : eleitores) {
          if (eleitor.getCpf() == cpfNumber) {
            userPessoa = eleitor;
          }
        }
        System.out.println("Entre com o número da pessoa candidata:");
        int numeroPessoaCandidata = scanner.nextInt();
        ArrayList<PessoaCandidata> candidatos = votacao.getListCandidates();
        for (PessoaCandidata candidato : candidatos) {
          if (numeroPessoaCandidata == candidato.getNumber()) {
            userPessoa.vote(candidato);
          }
        }
      } else {
        // mostrar resultado parcial
      }
    }
  }

  private static short openMenuforPessoaCandidata(Scanner scanner) {
    short inputNumber = 0;
    System.out.println("Cadastrar pessoa candidata?");
    String entrySystemString =
        "1 - Sim\n2 - Não";
    System.out.println(entrySystemString);
    System.out.println("Entre com o número correspondente à opção desejada:");

    inputNumber = scanner.nextShort();

    return inputNumber;
  }

  private static short openMenuforPessoaEleitora(Scanner scanner) {
    short inputNumber = 0;
    System.out.println("Cadastrar pessoa eleitora?");
    String entrySystemString =
        "1 - Sim\n2 - Não";
    System.out.println(entrySystemString);
    System.out.println("Entre com o número correspondente à opção desejada:");

    inputNumber = scanner.nextShort();

    return inputNumber;
  }

  private static short openMenuforVotation(Scanner scanner) {
    short inputNumber = 0;
    System.out.println("Entre com o número correspondente à opção desejada:");
    String entrySystemString =
        "1 - Votar\n2 - Resultado Parcial\n3 - Finalizar Votação";
        System.out.println(entrySystemString);

    inputNumber = scanner.nextShort();

    return inputNumber;
  }

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

}
