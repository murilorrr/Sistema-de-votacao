package com.trybe.acc.java.sistemadevotacao;

public class PessoaCandidata extends Pessoa {

  private int number;
  private short NumberOfVotes = 0;

  PessoaCandidata(String name, int number) {
    super(name);
    this.number = number;
  }

  /**
   * @return short return the number
   */
  public int getNumero() {
      return number;
  }

  /**
   * @param number the number to set
   */
  public void setNumero(int number) {
      this.number = number;
  }

  public void beVote() {
    this.NumberOfVotes += 1;
  }

  public short votesView() {
    return NumberOfVotes;
  }

  public int getNumber() {
    return this.number;
  }

}
