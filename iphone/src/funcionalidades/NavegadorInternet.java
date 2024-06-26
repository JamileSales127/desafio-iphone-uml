package funcionalidades;

import java.util.Scanner;

public class NavegadorInternet implements Funcionalidades {

  private Scanner scanner;

  public NavegadorInternet(Scanner scanner) {
    this.scanner = scanner;
  }

  @Override
  public void executar(int opcao) {
    switch (opcao) {
      case 3:
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Exibir página");
        System.out.println("2 - Adicionar nova aba");
        System.out.println("3 - Atualizar página");

        int opcaoTelefone = scanner.nextInt();
        scanner.nextLine();

        if (opcaoTelefone == 1) {
          exibirPagina();
        } else if (opcaoTelefone == 2) {
          adicionarNovaAba();
        } else if (opcaoTelefone == 3) {
          atualizarPagina();
        }
    }
  }

  private void exibirPagina() {
    System.out.print("Digite a URL: ");
    String url = scanner.nextLine();
    System.out.println("Exibindo página: " + url);
  }

  private void adicionarNovaAba() {
    System.out.println("Adicionando nova aba.");
  }

  private void atualizarPagina() {
    System.out.println("Atualizando página.");
  }
}
