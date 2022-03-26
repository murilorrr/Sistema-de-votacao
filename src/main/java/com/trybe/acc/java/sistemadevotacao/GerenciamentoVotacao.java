package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciamentoVotacao {

  Scanner scanner;
  private ArrayList<Pessoa> listPessoasCandidatas = new ArrayList<Pessoa>();
  private ArrayList<Pessoa> listPessoasEleitoras = new ArrayList<Pessoa>();

  GerenciamentoVotacao() {

  }



  public void cadastrarPessoaCandidata(String nome, short numero) {
    // !adiciona a pessoa ao array de pessoas CANDIDATAS
    PessoaCandidata candidato = new PessoaCandidata(nome, numero);
    listPessoasCandidatas.add(candidato);
  }

  public void cadastrarPessoaEleitora(String nome, String numero) {
    // !adiciona a pessoa ao array de pessoas ELEITORAS
    PessoaEleitora eleitora = new PessoaEleitora(nome, numero);
    listPessoasEleitoras.add(eleitora);
  }

  public void votar(String string, int numero) {
    // *IMPORTANTE: cada pessoa eleitora só pode votar uma única vez.

  }

  public void mostrarResultado() {
    // !mostrar resultado da votação
  }

  public ArrayList<Pessoa> getListCandidates() {
    return this.listPessoasCandidatas;
  }

  public ArrayList<Pessoa> getListEleitoras() {
    return this.listPessoasEleitoras;
  }
}
