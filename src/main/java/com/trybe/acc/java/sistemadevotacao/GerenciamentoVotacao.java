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
   * @param nome is string, nome da pessoa candidata
   * @param numero is integer,  numero da pessoa candidata
   * @author Murilo
   */
  public void cadastrarPessoaCandidata(String nome, int numero) {
    PessoaCandidata candidato = new PessoaCandidata(nome, numero);
    listPessoasCandidatas.add(candidato);
  }

  /**
   * @param nome is string, nome da pessoa eleitora
   * @param numero is integer,  cpf da pessoa eleitora
   * @author Murilo
   */
  public void cadastrarPessoaEleitora(String nome, String numero) {
    PessoaEleitora eleitora = new PessoaEleitora(nome, numero);
    listPessoasEleitoras.add(eleitora);
  }

  /**
   * @param string is cpf da pessoa eleitora
   * @param numero is integer, numero da pessoa candidatas
   * @author Murilo
   */
  public void votar(String string, int numero) {
    // *IMPORTANTE: cada pessoa eleitora só pode votar uma única vez.

  }

  /**
   * Mostrar os resultados atuais da votação, parciais ou não
   * @author Murilo
   */
  public void mostrarResultado() {
    // !mostrar resultado da votação
  }

  /**
   * Retorna lista de Pessoas candidatas
   * @author Murilo
   */
  public ArrayList<PessoaCandidata> getListCandidates() {
    return this.listPessoasCandidatas;
  }

  /**
   * Retorna lista de Pessoas eleitoras
   * @author Murilo
   */
  public ArrayList<PessoaEleitora> getListEleitoras() {
    return this.listPessoasEleitoras;
  }
}
