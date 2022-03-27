package com.trybe.acc.java.sistemadevotacao;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;

public class GerenciamentoVotacao {

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
    for (PessoaCandidata pessoaCandidata : listPessoasCandidatas) {
      if (pessoaCandidata.getNumero() == numero) {
        System.out.println("Número pessoa candidata já utilizado!");
        return;
      }
    }
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
    for (PessoaEleitora pessoaEleitora : listPessoasEleitoras) {
      if (pessoaEleitora.getCpf().equals(numero)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }
    }
    listPessoasEleitoras.add(eleitora);
  }

  /**
   * Metodo para votar em uma pessoa candidata.
   * Somar um voto na pessoa votada e subtrai o direito de voto na pessoa votante.
   * @param personsCpf is cpf da pessoa eleitora
   * @param numeroPessoaCandidata is integer, numero da pessoa candidatas
   * @author Murilo
   */
  public void votar(String personsCpf, int numeroPessoaCandidata) {

    for (PessoaEleitora eleitor : listPessoasEleitoras) {
      if (eleitor.getCpf().equals(personsCpf)) {
        for (PessoaCandidata candidato : listPessoasCandidatas) {
          if (candidato.getNumero() == numeroPessoaCandidata) {
            eleitor.vote(candidato);
          }
        }
      }
    }
  }

  /**
   * Mostrar os resultados atuais da votação, parciais ou não.
   * @author Murilo
   */
  public void mostrarResultado() {
    if (quantidadeTotalDeVotos() == 0) {
      return;
    }

    DecimalFormat decimalFormatUS = new DecimalFormat(
        "#,###.#", new DecimalFormatSymbols(Locale.US));
    int totalDeVotos = quantidadeTotalDeVotos();

    // para candidato printa o numero de votos dele senao for 0
    for (PessoaCandidata pessoaCandidata : listPessoasCandidatas) {
      if (pessoaCandidata.votesView() > 0) {
        float votosEmPorcentagem = ((float) pessoaCandidata.votesView() / totalDeVotos) * 100;
        System.out.println("Nome: "
            + pessoaCandidata.getNome()
            + " - "
            + pessoaCandidata.votesView()
            + " votos "
            + "( " + decimalFormatUS.format(votosEmPorcentagem)
            + "% )"
        );
      }
    }
    System.out.println("Total de votos: " + totalDeVotos);
  }

  /**
   * Metodo que retorna a quantidade total de votos.
   * @return integer Quantidade total de votos.
   * @author Murilo
   */
  private int quantidadeTotalDeVotos() {
    int total = 0;
    for (PessoaCandidata pessoaCandidata: listPessoasCandidatas) {
      total += pessoaCandidata.votesView();
    }
    return total;
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
