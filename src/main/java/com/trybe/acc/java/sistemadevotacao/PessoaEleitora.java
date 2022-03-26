package com.trybe.acc.java.sistemadevotacao;

public class PessoaEleitora extends Pessoa {

  private String cpf;
  private boolean isElegitToVote = true;

  PessoaEleitora(String name, String numberOfCpf) {
    super(name);
    this.cpf = numberOfCpf;
  }

  /**
   * Retorna o nome do eleitor.
   * @return String return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Set o nome do eleitor para um novo nome.
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * retorna o CPF do eleitor.
   * @return String return the cpf
   */
  public String getCpf() {
    return cpf;
  }

  /**
   * Seta um nomo CPF para o eleitor.
   * @param cpf the cpf to set
   */
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }


  /**
   * Retorna se o eleitor é elegivel para votar.
   * @return boolean return the isElegitToVote
   */
  public boolean isElegitToVote() {
    return isElegitToVote;
  }

  /**
   * Seta o eleitor ser elegivel para o voto em um novo status.
   * @param isElegitToVote the isElegitToVote to set
   */
  private void setIsElegitToVote(boolean isElegitToVote) {
    this.isElegitToVote = isElegitToVote;
  }

  /**
   * Metodo que abstrai o voto do eleitor.
   * @param candidato the method to vote in one candidate, only one vote per person
   */
  public void vote() {
    if (isElegitToVote()) {
      System.out.println("Esta pessoa votou em alguem");
      setIsElegitToVote(false);
    } else {
      System.out.println("Esta pessoa já votou");
    }
  }

}
