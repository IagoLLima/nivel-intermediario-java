package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    File file = new File(
        "C:\\Users\\Karen_Iago\\Documents\\Iago\\Capacitação\\Java\\course\\nivel-intermediario-java\\in.txt");
    Scanner sc = null;

    try {
      sc = new Scanner(file);
      sc.hasNextLine();// para verificar se ainda existe uma linha no arquivo
      while (sc.hasNextLine()) {// se ainda existir linha, então imprimi
        System.out.println(sc.nextLine());
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }

    finally {
      if (sc != null) {
        sc.close(); // foi colocado aqui, pois poderia ocorrer uma exceção e o programa n ser encerrado
      }
    }
  }
}