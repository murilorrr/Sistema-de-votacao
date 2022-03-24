package com.trybe.acc.java.sistemadevotacao;

abstract class Pessoa implements IPessoa {

  protected String name;
  protected int number;

  public String getNome() {
    return name;
  }

  public void setNome(String newName) {
    this.name = newName;
  }

  public int getNumero() {
    return number;
  }

  public void setNumero(int newNumber) {
    this.number = newNumber;
  }
}
