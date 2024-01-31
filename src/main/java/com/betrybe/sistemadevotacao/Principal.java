package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * The type Principal.
 */
public class Principal {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    Principal.cadastrarPessoasCandidatas(input, gerenciamentoVotacao);
    Principal.cadastrarPessoasEleitoras(input, gerenciamentoVotacao);
    Principal.realizarVotacao(input, gerenciamentoVotacao);
    input.close();
  }

  private static void cadastrarPessoasCandidatas(Scanner input,
      GerenciamentoVotacao gerenciamentoVotacao) {
    int opcao;

    do {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");

      opcao = input.nextInt();

      if (opcao == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nome = input.next();

        System.out.println("Entre com o número da pessoa candidata:");
        int numero = input.nextInt();
        input.nextLine();

        gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
      }

    } while (opcao == 1);
  }

  private static void cadastrarPessoasEleitoras(Scanner input,
      GerenciamentoVotacao gerenciamentoVotacao) {
    int opcao;

    do {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");

      opcao = input.nextInt();

      if (opcao == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nome = input.next();

        System.out.println("Entre com o CPF da pessoa eleitora:");
        String cpf = input.next();

        gerenciamentoVotacao.cadastrarPessoaEleitora(nome, cpf);
      }

    } while (opcao == 1);
  }

  private static void realizarVotacao(Scanner input, GerenciamentoVotacao gerenciamentoVotacao) {
    int opcao;

    do {
      System.out.println("Escolha a opção:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");
      System.out.println("Entre com o número correspondente à opção desejada:");

      opcao = input.nextInt();

      switch (opcao) {
        case 1:
          votar(input, gerenciamentoVotacao);
          break;
        case 2:
          gerenciamentoVotacao.mostrarResultado();
          break;
        case 3:
          gerenciamentoVotacao.mostrarResultado();
          System.out.println("Votação Finalizada");
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }

    } while (opcao != 3);
  }

  private static void votar(Scanner scanner, GerenciamentoVotacao gerenciamentoVotacao) {
    System.out.println("Entre com o cpf da pessoa eleitora: ");
    String cpfPessoaEleitora = scanner.next();

    System.out.println("Entre com o número da pessoa candidata:");
    int numeroPessoaCandidata = scanner.nextInt();

    gerenciamentoVotacao.votar(cpfPessoaEleitora, numeroPessoaCandidata);
  }
}
