package com.trybe.acc.java.sistemadevotacao;

abstract class Pessoa implements IPessoa {

  protected String name;

  Pessoa(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  };

  public void setName(String newName) {
    this.name = newName;
  };

}
