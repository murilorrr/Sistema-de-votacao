package com.trybe.acc.java.sistemadevotacao;

public class PessoaCandidata extends Pessoa {

  private int number;
  private short numberOfVotes = 0;

  PessoaCandidata(String name, int number) {
    super(name);
    this.number = number;
  }

  /**
   * Retorna o numero da pessoa candidata.
   * @return int return the number
   */
  public int getNumero() {
    return this.number;
  }

  /**
   * Seta um novo numero da pessoa candidata.
   * @param number the number to set
   */
  public void setNumero(int number) {
    this.number = number;
  }

  /**
   * Acrescenta em um a quantidade de votos do candidato.
   */
  public void beVote() {
    this.numberOfVotes += 1;
  }

  /**
   * Retorna o numero de votos que o candidato já recebeu.
   * @return short return number of votes
   */
  public short votesView() {
    return numberOfVotes;
  }

}
