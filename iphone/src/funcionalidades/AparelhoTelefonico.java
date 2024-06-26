package funcionalidades;

import java.util.Scanner;

public class AparelhoTelefonico implements Funcionalidades {

  private Scanner scanner;

  public AparelhoTelefonico(Scanner scanner) {
    this.scanner = scanner;
  }

  @Override
  public void executar(int opcao) {
    switch (opcao) {
      case 2:
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Ligar");
        System.out.println("2 - Atender");
        System.out.println("3 - Correio de voz");

        int opcaoTelefone = scanner.nextInt();
        scanner.nextLine();

        if (opcaoTelefone == 1) {
          ligar();
        } else if (opcaoTelefone == 2) {
          atender();
        } else if (opcaoTelefone == 3) {
          iniciarCorreioVoz();
        }
    }
  }

  private void ligar() {
    System.out.print("Digite o número: ");
    String numero = scanner.nextLine();
    System.out.println("Ligando para o número: " + numero);
  }

  private void atender() {
    System.out.println("Atendendo chamada.");
  }

  private void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz.");
  }
}
