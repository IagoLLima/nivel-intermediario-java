package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* É um bloco try que declara um ou mais recursos, e garante que esses
recursos serão fechados ao final do bloco */

public class BlocoTryWithResources {

  public static void main(String[] args) {

    String path = "C:\\Users\\Karen_Iago\\Documents\\Iago\\Capacitacao\\Java\\course\\nivel-intermediario-java\\in.txt";
    try (BufferedReader br = new BufferedReader(new FileReader(path))) { 
      //pode ser instanciado as streams direto no try, porque agora não precisa mais fechar essas var no final
      String line = br.readLine();
      while (line != null) {
        System.out.println(line);
        line = br.readLine();
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }

  }

}
