package com.trybe.acc.java.sistemadevotacao;

public class PessoaEleitora extends Pessoa {

  protected String name;
  protected String cpf;

  PessoaEleitora(String name, String numberOfCpf) {
    this.name = name;
    this.cpf = numberOfCpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
