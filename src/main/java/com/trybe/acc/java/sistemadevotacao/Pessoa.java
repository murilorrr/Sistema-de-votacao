package com.trybe.acc.java.sistemadevotacao;

abstract class Pessoa implements IPessoa {

  protected String name;

  Pessoa(String name) {
    this.name = name;
  }

  public String getNome() {
    return this.name;
  };

  public void setNome(String newName) {
    this.name = newName;
  };

}
