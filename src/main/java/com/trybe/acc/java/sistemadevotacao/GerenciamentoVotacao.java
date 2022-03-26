package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoVotacao {

  Scanner scanner;
  private ArrayList<PessoaCandidata> listPessoasCandidatas = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> listPessoasEleitoras = new ArrayList<PessoaEleitora>();

  GerenciamentoVotacao() {

  }



  public void cadastrarPessoaCandidata(String nome, int numero) {
    PessoaCandidata candidato = new PessoaCandidata(nome, numero);
    listPessoasCandidatas.add(candidato);
  }

  public void cadastrarPessoaEleitora(String nome, String numero) {
    PessoaEleitora eleitora = new PessoaEleitora(nome, numero);
    listPessoasEleitoras.add(eleitora);
  }

  public void votar(String string, int numero) {
    // *IMPORTANTE: cada pessoa eleitora só pode votar uma única vez.

  }

  public void mostrarResultado() {
    // !mostrar resultado da votação
  }

  public ArrayList<PessoaCandidata> getListCandidates() {
    return this.listPessoasCandidatas;
  }

  public ArrayList<PessoaEleitora> getListEleitoras() {
    return this.listPessoasEleitoras;
  }
}
