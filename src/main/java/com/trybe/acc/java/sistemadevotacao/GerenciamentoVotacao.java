package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoVotacao {

  Scanner scanner;
  private ArrayList<PessoaCandidata> listPessoasCandidatas = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> listPessoasEleitoras = new ArrayList<PessoaEleitora>();

  GerenciamentoVotacao() {

  }


  /**
   * Metodo para cadastrar uma pessoa candidata num array de candidatos.
   * @param nome is string, nome da pessoa candidata
   * @param numero is integer,  numero da pessoa candidata
   * @author Murilo
   */
  public void cadastrarPessoaCandidata(String nome, int numero) {
    PessoaCandidata candidato = new PessoaCandidata(nome, numero);
    listPessoasCandidatas.add(candidato);
  }

  /**
   * Metodo para cadastrar uma pessoa eleitora num array de eleitores.
   * @param nome is string, nome da pessoa eleitora
   * @param numero is integer,  cpf da pessoa eleitora
   * @author Murilo
   */
  public void cadastrarPessoaEleitora(String nome, String numero) {
    PessoaEleitora eleitora = new PessoaEleitora(nome, numero);
    listPessoasEleitoras.add(eleitora);
  }

  /**
   * Metodo para votar em uma pessoa candidata.
   * @param personsCpf is cpf da pessoa eleitora
   * @param numeroPessoaCandidata is integer, numero da pessoa candidatas
   * @author Murilo
   */
  public void votar(String personsCpf, int numeroPessoaCandidata) {
    // *IMPORTANTE: cada pessoa eleitora só pode votar uma única vez.
    // * tenho que somar um voto na pessoa votada e subtrair o direito de voto na pessoa votante

    for (PessoaEleitora eleitor : listPessoasEleitoras) {
      if (eleitor.getCpf() == personsCpf) {
        eleitor.vote();
      }
    }

    for (PessoaCandidata candidato : listPessoasCandidatas) {
      if (candidato.getNumber() == numeroPessoaCandidata) {
        candidato.beVote();
      }
    }
  }

  /**
   * Mostrar os resultados atuais da votação, parciais ou não.
   * @author Murilo
   */
  public void mostrarResultado() {
    // para candidato printa o numero de votos dele senao for 0
    for (PessoaCandidata pessoaCandidata : listPessoasCandidatas) {
      System.out.println("Nome: "
          + pessoaCandidata.getNome()
          + " "
          + pessoaCandidata.votesView()
          + "votos "
          + "( " + "porcentagem tal de votos"
          + " )"
      );
      // TODO implementar a porcentagem
    }
  }

  /**
   * Retorna lista de Pessoas candidatas.
   * @author Murilo
   */
  public ArrayList<PessoaCandidata> getListCandidates() {
    return this.listPessoasCandidatas;
  }

  /**
   * Retorna lista de Pessoas eleitoras.
   * @author Murilo
   */
  public ArrayList<PessoaEleitora> getListEleitoras() {
    return this.listPessoasEleitoras;
  }
}
