package modelo;

import funcionalidades.*;

import java.util.Scanner;

public class Iphone {

  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);

    System.out.println("-------------------------");
    System.out.println("BEM VINDO(A) AO SEU IPHONE!!");
    System.out.println("-------------------------");
    System.out.println("Escolha uma ação: ");
    System.out.println("1 - Reprodutor Musical");
    System.out.println("2 - Aparelho Telefônico");
    System.out.println("3 - Navegador na Internet");

    int opcao = leitura.nextInt();
    leitura.nextLine(); // Limpar o buffer de entrada

    Funcionalidades funcionalidade = null;

    switch (opcao) {
      case 1:
        funcionalidade = new ReprodutorMusical(leitura);
        break;
      case 2:
        funcionalidade = new AparelhoTelefonico(leitura);
        break;
      case 3:
        funcionalidade = new NavegadorInternet(leitura);
        break;
      default:
        System.out.println("Opção inválida.");
        break;
    }

    if (funcionalidade != null) {
      funcionalidade.executar(opcao);
    }

    leitura.close();
  }
}
