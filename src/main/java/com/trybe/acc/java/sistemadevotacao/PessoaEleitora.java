package com.trybe.acc.java.sistemadevotacao;

public class PessoaEleitora extends Pessoa {

  private String name;
  private String cpf;
  private boolean isElegitToVote = true;

  PessoaEleitora(String name, String numberOfCpf) {
    super(name);
    this.cpf = numberOfCpf;
  }

    /**
   * @return String return the name
   */
  public String getName() {
      return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
      this.name = name;
  }

  /**
   * @return String return the cpf
   */
  public String getCpf() {
      return cpf;
  }

  /**
   * @param cpf the cpf to set
   */
  public void setCpf(String cpf) {
      this.cpf = cpf;
  }


  /**
   * @return boolean return the isElegitToVote
   */
  public boolean isIsElegitToVote() {
      return isElegitToVote;
  }

  /**
   * @param isElegitToVote the isElegitToVote to set
   */
  private void setIsElegitToVote(boolean isElegitToVote) {
      this.isElegitToVote = isElegitToVote;
  }

  /**
   * @param candidato the method to vote in one candidate, only one vote per person
   */
  public void vote(PessoaCandidata candidato) {
    if (isElegitToVote) {
      candidato.beVote();
      System.out.println("Esta pessoa votou em " + candidato.name);
      setIsElegitToVote(false);
    } else {
      System.out.println("Esta pessoa já votou");
    }
  }

}
