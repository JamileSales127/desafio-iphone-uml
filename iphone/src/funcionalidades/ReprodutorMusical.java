package funcionalidades;

import java.util.Scanner;

public class ReprodutorMusical implements Funcionalidades {
  private Scanner scanner;

  public ReprodutorMusical(Scanner scanner) {
    this.scanner = scanner;
  }

  @Override
  public void executar(int opcao) {
    switch (opcao) {
      case 1:
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Tocar");
        System.out.println("2 - Pausar");
        System.out.println("3 - Selecionar música");

        int opcaoReprodutor = scanner.nextInt();
        scanner.nextLine();

        if (opcaoReprodutor == 1) {
          tocar();
        } else if (opcaoReprodutor == 2) {
          pausar();
        } else if (opcaoReprodutor == 3) {
          selecionarMusica();
        }
    }
  }

  private void tocar() {
    System.out.println("Tocando música...");
  }

  private void pausar() {
    System.out.println("Música pausada.");
  }

  private void selecionarMusica() {
    System.out.print("Digite o nome da música: ");
    String musica = scanner.nextLine();
    System.out.println("Música selecionada: " + musica);
  }


  }
