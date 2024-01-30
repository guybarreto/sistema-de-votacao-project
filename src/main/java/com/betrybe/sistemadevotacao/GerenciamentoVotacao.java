package com.betrybe.sistemadevotacao;
import java.util.ArrayList;

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<String> pessoasCandidatas;
  private ArrayList<String> pessoasEleitoras;
  private ArrayList<String> cpfsComputados;

  public GerenciamentoVotacao() {
  }

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {

  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {

  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {

  }

  @Override
  public void mostrarResultado() {

  }
}
